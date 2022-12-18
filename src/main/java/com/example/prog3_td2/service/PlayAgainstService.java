package com.example.prog3_td2.service;

import com.example.prog3_td2.model.PlayAgainstEntity;
import com.example.prog3_td2.repository.PlayAgainstRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PlayAgainstService {
    private final PlayAgainstRepository repository;

    public List<PlayAgainstEntity> getPlayAgainst() {
        return repository.findAll();
    }
    public List<PlayAgainstEntity> createPlayAgainsts(List<PlayAgainstEntity> toCreate) {
        return repository.saveAll(toCreate);
    }

    public List<PlayAgainstEntity> updatePlayAgainsts(List<PlayAgainstEntity> toUpdate) {
        return repository.saveAll(toUpdate);
    }

    public PlayAgainstEntity deletePlayAgainst(int PlayAgainstEntityId) {
        Optional<PlayAgainstEntity> optional = repository.findById(Long.valueOf(String.valueOf(PlayAgainstEntityId)));
        if (optional.isPresent()) {
            repository.delete(optional.get());
            return optional.get();
        } else {
            throw new RuntimeException("PlayAgainstEntity." + PlayAgainstEntityId + " not found");
        }
    }
}
