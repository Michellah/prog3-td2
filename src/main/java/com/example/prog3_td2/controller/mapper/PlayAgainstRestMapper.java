
package com.example.prog3_td2.controller.mapper;

import com.example.prog3_td2.controller.response.playAgainst.CreatePlayAgainstResponse;
import com.example.prog3_td2.controller.response.playAgainst.PlayAgainstResponse;
import com.example.prog3_td2.controller.response.playAgainst.UpdatePlayAgainstResponse;
import com.example.prog3_td2.model.PlayAgainstEntity;
import org.springframework.stereotype.Component;


@Component
public class PlayAgainstRestMapper {

    public PlayAgainstResponse toRest(PlayAgainstEntity domain) {
        return PlayAgainstResponse.builder()
                .id(domain.getId())
                .team1(domain.getTeam1())
                .team2(domain.getTeam2())
                .datetime(domain.getDatetime())
                .stadium(domain.getStadium())
                .build();
    }

    public PlayAgainstEntity toDomain(CreatePlayAgainstResponse rest) {
        return PlayAgainstEntity.builder()
                .team1(rest.getTeam1())
                .team2(rest.getTeam2())
                .datetime(rest.getDatetime())
                .stadium(rest.getStadium())
                .build();
    }

    public PlayAgainstEntity toDomain(UpdatePlayAgainstResponse rest) {
        return  PlayAgainstEntity.builder()
                .id(rest.getId())
                .team1(rest.getTeam1())
                .team2(rest.getTeam2())
                .datetime(rest.getDatetime())
                .stadium(rest.getStadium())
                .build();
    }
}
