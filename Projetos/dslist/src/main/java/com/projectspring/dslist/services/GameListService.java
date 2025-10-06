package com.projectspring.dslist.services;

import com.projectspring.dslist.dto.GameListDTO;
import com.projectspring.dslist.dto.GameMinDTO;
import com.projectspring.dslist.entities.Game;
import com.projectspring.dslist.entities.GameList;
import com.projectspring.dslist.projections.GameMinProjection;
import com.projectspring.dslist.repositories.GameListRepository;
import com.projectspring.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();
        return dto;
    }

    @Transactional
    public void move(Long listId, int sourceIndex, int destinationId){
        List<GameMinProjection> list = gameRepository.searchByList(listId);

        GameMinProjection obj = list.remove(sourceIndex);
        list.add(destinationId, obj);

        int min = sourceIndex < destinationId ? sourceIndex : destinationId;
        int max = sourceIndex < destinationId ? destinationId : sourceIndex;

        for (int i = min; i <= max; i++){
            gameListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
        }
    }
}
