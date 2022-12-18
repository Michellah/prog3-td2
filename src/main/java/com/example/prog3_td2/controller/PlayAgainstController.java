package com.example.prog3_td2.controller;

import com.example.prog3_td2.controller.mapper.PlayAgainstRestMapper;
import com.example.prog3_td2.controller.response.playAgainst.CreatePlayAgainstResponse;
import com.example.prog3_td2.controller.response.playAgainst.PlayAgainstResponse;
import com.example.prog3_td2.controller.response.playAgainst.UpdatePlayAgainstResponse;
import com.example.prog3_td2.model.PlayAgainstEntity;
import com.example.prog3_td2.service.PlayAgainstService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class PlayAgainstController {
    private final PlayAgainstService service;
    private final PlayAgainstRestMapper mapper;

    @GetMapping("/playAgainsts")
    public List<PlayAgainstResponse> getPlayAgainst() {
        return service.getPlayAgainst().stream()
                .map(mapper::toRest)
                .toList();
    }

    @PostMapping("/playAgainsts")
    public List<PlayAgainstResponse> createPlayAgainst(@RequestBody List<CreatePlayAgainstResponse> toCreate) {
        List<PlayAgainstEntity> domain = toCreate.stream()
                .map(mapper::toDomain)
                .toList();
        return service.createPlayAgainsts(domain).stream()
                .map(mapper::toRest)
                .toList();
    }

    @PutMapping("/playAgainsts")
    public List<PlayAgainstResponse> updatePlayAgainst(@RequestBody List<UpdatePlayAgainstResponse> toUpdate) {
        List<PlayAgainstEntity> domain = toUpdate.stream()
                .map(mapper::toDomain)
                .toList();
        return service.updatePlayAgainsts(domain).stream()
                .map(mapper::toRest)
                .toList();
    }

    @DeleteMapping("/playAgainsts/{playAgainstId}")
    public PlayAgainstResponse deletePlayAgainst(@PathVariable Integer playAgainstId) {
        return mapper.toRest(service.deletePlayAgainst(playAgainstId));
    }

}
