package com.example.prog3_td2.service;

import com.example.prog3_td2.model.PlayerEntity;
import com.example.prog3_td2.repository.PlayerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PlayerService {
    private final PlayerRepository repository;

    public List<PlayerEntity> getPlayer() {
        return repository.findAll();
    }
    public List<PlayerEntity> createPlayers(List<PlayerEntity> toCreate) {
        return repository.saveAll(toCreate);
    }

    public List<PlayerEntity> updatePlayers(List<PlayerEntity> toUpdate) {
        return repository.saveAll(toUpdate);
    }

    public PlayerEntity deletePlayer(int PlayerEntityId) {
        Optional<PlayerEntity> optional = repository.findById(Long.valueOf(String.valueOf(PlayerEntityId)));
        if (optional.isPresent()) {
            repository.delete(optional.get());
            return optional.get();
        } else {
            throw new RuntimeException("PlayerEntity." + PlayerEntityId + " not found");
        }
    }
}
