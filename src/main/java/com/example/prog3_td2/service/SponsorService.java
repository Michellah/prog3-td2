package com.example.prog3_td2.service;

import com.example.prog3_td2.model.PlayerEntity;
import com.example.prog3_td2.model.SponsorEntity;
import com.example.prog3_td2.repository.PlayerRepository;
import com.example.prog3_td2.repository.SponsorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class SponsorService {
    private final SponsorRepository repository;

    public List<SponsorEntity> getSponsor() {
        return repository.findAll();
    }
    public List<SponsorEntity> createSponsors(List<SponsorEntity> toCreate) {
        return repository.saveAll(toCreate);
    }

    public List<SponsorEntity> updateSponsors(List<SponsorEntity> toUpdate) {
        return repository.saveAll(toUpdate);
    }

    public SponsorEntity deleteSponsor(int SponsorEntityId) {
        Optional<SponsorEntity> optional = repository.findById(Long.valueOf(String.valueOf(SponsorEntityId)));
        if (optional.isPresent()) {
            repository.delete(optional.get());
            return optional.get();
        } else {
            throw new RuntimeException("SponsorEntity." + SponsorEntityId + " not found");
        }
    }
}
