package com.lifedefender.lifedefender.sleep.repository;

import com.lifedefender.lifedefender.entity.Sleep;
import com.lifedefender.lifedefender.sleep.dto.SleepResponseDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface SleepRepository extends JpaRepository<Sleep,Long> {

}
