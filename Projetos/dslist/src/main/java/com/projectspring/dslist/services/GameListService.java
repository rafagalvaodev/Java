package com.projectspring.dslist.services;

import com.projectspring.dslist.dto.GameListDTO;
import com.projectspring.dslist.dto.GameMinDTO;
import com.projectspring.dslist.entities.Game;
import com.projectspring.dslist.entities.GameList;
import com.projectspring.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();
        return dto;
    }
}
