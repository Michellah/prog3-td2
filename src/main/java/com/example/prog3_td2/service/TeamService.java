package com.example.prog3_td2.service;

import com.example.prog3_td2.model.SponsorEntity;
import com.example.prog3_td2.model.TeamEntity;
import com.example.prog3_td2.repository.SponsorRepository;
import com.example.prog3_td2.repository.TeamRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TeamService {
    private final TeamRepository repository;

    public List<TeamEntity> getTeam() {
        return repository.findAll();
    }
    public List<TeamEntity> createTeams(List<TeamEntity> toCreate) {
        return repository.saveAll(toCreate);
    }

    public List<TeamEntity> updateTeams(List<TeamEntity> toUpdate) {
        return repository.saveAll(toUpdate);
    }

    public TeamEntity deleteTeam(int TeamEntityId) {
        Optional<TeamEntity> optional = repository.findById(Long.valueOf(String.valueOf(TeamEntityId)));
        if (optional.isPresent()) {
            repository.delete(optional.get());
            return optional.get();
        } else {
            throw new RuntimeException("TeamEntity." + TeamEntityId + " not found");
        }
    }
}
