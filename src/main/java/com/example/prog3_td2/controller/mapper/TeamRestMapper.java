package com.example.prog3_td2.controller.mapper;

import com.example.prog3_td2.controller.response.team.CreateTeamResponse;
import com.example.prog3_td2.controller.response.team.TeamResponse;
import com.example.prog3_td2.controller.response.team.UpdateTeamResponse;
import com.example.prog3_td2.model.TeamEntity;
import com.example.prog3_td2.service.TeamService;
import org.springframework.stereotype.Component;


@Component
public class TeamRestMapper {

    public TeamResponse toRest(TeamEntity domain) {
        return TeamResponse.builder()
                .id(domain.getId())
                .name(domain.getName())
                .player(domain.getPlayer())
                .sponsor(domain.getSponsor())
                .build();
    }

    public TeamEntity toDomain(CreateTeamResponse rest) {
        return TeamEntity.builder()
                .name(rest.getName())
                .player(rest.getPlayer())
                .sponsor(rest.getSponsor())
                .build();
    }

    public TeamEntity toDomain(UpdateTeamResponse rest) {
        return  TeamEntity.builder()
                .id(rest.getId())
                .name(rest.getName())
                .player(rest.getPlayer())
                .sponsor(rest.getSponsor())
                .build();
    }
}
