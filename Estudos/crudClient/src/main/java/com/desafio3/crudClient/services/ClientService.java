package com.desafio3.crudClient.services;

import com.desafio3.crudClient.dto.ClientDTO;
import com.desafio3.crudClient.entity.Client;
import com.desafio3.crudClient.repository.ClientRepository;
import com.desafio3.crudClient.services.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id){
        Client client = repository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("Recurso não encontrado"));
        return new ClientDTO(client);
    }


    @Transactional(propagation = Propagation.SUPPORTS)
    public void deleteById(Long id){
        if(!repository.existsById(id)){
            throw new ResourceNotFoundException("Recurso não encontrado");
        }
        repository.deleteById(id);
    }

    @Transactional(readOnly = true)
    public Page<ClientDTO> findAll(Pageable pageable){
        Page<Client> client = repository.findAll(pageable);
        return client.map(ClientDTO::new);
    }

    @Transactional
    public ClientDTO create(ClientDTO dto){
        Client client = new Client();
        copyDTOToEntity(dto, client);
        client = repository.save(client);
        return new ClientDTO(client);
    }

    @Transactional
    public ClientDTO update(Long id, ClientDTO dto){
        try {
            Client client = repository.getReferenceById(id);
            copyDTOToEntity(dto, client);
            return new ClientDTO(client);
        } catch (EntityNotFoundException e){
            throw new ResourceNotFoundException("Recurso não encontrado");
        }
    }

    private void copyDTOToEntity(ClientDTO dto, Client entity){
        entity.setName(dto.getName());
        entity.setCpf(dto.getCpf());
        entity.setIncome(dto.getIncome());
        entity.setBirthDate(dto.getBirthDate());
        entity.setChildren(dto.getChildren());
    }
}
