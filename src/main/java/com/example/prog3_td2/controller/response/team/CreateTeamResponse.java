package com.example.prog3_td2.controller.response.team;

import com.example.prog3_td2.model.PlayerEntity;
import com.example.prog3_td2.model.SponsorEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class CreateTeamResponse {
    private String name;
    private List<PlayerEntity>  player;
    private List<SponsorEntity>  sponsor;
}
