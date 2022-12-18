package com.example.prog3_td2.controller.mapper;

import com.example.prog3_td2.controller.response.sponsor.CreateSponsorResponse;
import com.example.prog3_td2.controller.response.sponsor.SponsorResponse;
import com.example.prog3_td2.controller.response.sponsor.UpdateSponsorResponse;
import com.example.prog3_td2.model.SponsorEntity;
import org.springframework.stereotype.Component;


@Component
public class SponsorRestMapper {

    public SponsorResponse toRest(SponsorEntity domain) {
        return SponsorResponse.builder()
                .id(domain.getId())
                .name(domain.getName())
                .build();
    }

    public SponsorEntity toDomain(CreateSponsorResponse rest) {
        return SponsorEntity.builder()
                .name(rest.getName())
                .build();
    }

    public SponsorEntity toDomain(UpdateSponsorResponse rest) {
        return  SponsorEntity.builder()
                .id(rest.getId())
                .name(rest.getName())
                .build();
    }
}
