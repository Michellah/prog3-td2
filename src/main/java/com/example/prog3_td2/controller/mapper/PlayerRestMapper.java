package com.example.prog3_td2.controller.mapper;

import com.example.prog3_td2.controller.response.player.CreatePlayerResponse;
import com.example.prog3_td2.controller.response.player.PlayerResponse;
import com.example.prog3_td2.controller.response.player.UpdatePlayerResponse;
import com.example.prog3_td2.model.PlayerEntity;
import org.springframework.stereotype.Component;


@Component
public class PlayerRestMapper {

    public PlayerResponse toRest(PlayerEntity domain) {
        return PlayerResponse.builder()
                .id(domain.getId())
                .name(domain.getName())
                .build();
    }

    public PlayerEntity toDomain(CreatePlayerResponse rest) {
        return PlayerEntity.builder()
                .name(rest.getName())
                .number(rest.getNumber())
                .build();
    }

    public PlayerEntity toDomain(UpdatePlayerResponse rest) {
        return  PlayerEntity.builder()
                .id(rest.getId())
                .name(rest.getName())
                .number(rest.getNumber())
                .build();
    }
}
