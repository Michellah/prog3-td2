package com.example.prog3_td2.controller.response.sponsor;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class SponsorResponse {
    private int id;
    private String name;
}
