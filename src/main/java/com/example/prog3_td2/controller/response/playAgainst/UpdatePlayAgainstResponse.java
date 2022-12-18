package com.example.prog3_td2.controller.response.playAgainst;

import com.example.prog3_td2.model.TeamEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class UpdatePlayAgainstResponse {

    private int id;
    private TeamEntity team1;
    private TeamEntity team2;
    private Instant datetime;
    private String stadium;
}
