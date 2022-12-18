package com.example.prog3_td2.controller.response.player;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class UpdatePlayerResponse {

    private int id;
    private String name;
    private int number;
}
