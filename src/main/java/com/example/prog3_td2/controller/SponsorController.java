package com.example.prog3_td2.controller;


import com.example.prog3_td2.controller.mapper.SponsorRestMapper;
import com.example.prog3_td2.controller.response.sponsor.CreateSponsorResponse;
import com.example.prog3_td2.controller.response.sponsor.SponsorResponse;
import com.example.prog3_td2.controller.response.sponsor.UpdateSponsorResponse;
import com.example.prog3_td2.model.SponsorEntity;
import com.example.prog3_td2.service.SponsorService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class SponsorController {
    private final SponsorService service;
    private final SponsorRestMapper mapper;

    @GetMapping("/sponsors")
    public List<SponsorResponse> getSponsors() {
        return service.getSponsor().stream()
                .map(mapper::toRest)
                .toList();
    }

    @PostMapping("/sponsors")
    public List<SponsorResponse> createSponsors(@RequestBody List<CreateSponsorResponse> toCreate) {
        List<SponsorEntity> domain = toCreate.stream()
                .map(mapper::toDomain)
                .toList();
        return service.createSponsors(domain).stream()
                .map(mapper::toRest)
                .toList();
    }

    @PutMapping("/sponsors")
    public List<SponsorResponse> updateTeams(@RequestBody List<UpdateSponsorResponse> toUpdate) {
        List<SponsorEntity> domain = toUpdate.stream()
                .map(mapper::toDomain)
                .toList();
        return service.updateSponsors(domain).stream()
                .map(mapper::toRest)
                .toList();
    }

    @DeleteMapping("/sponsors/{sponsorId}")
    public SponsorResponse deleteSponsor(@PathVariable Integer sponsorId) {
        return mapper.toRest(service.deleteSponsor(sponsorId));
    }

}
