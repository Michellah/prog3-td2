package com.example.prog3_td2.repository;

import com.example.prog3_td2.model.PlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<PlayerEntity, Long> {
}
