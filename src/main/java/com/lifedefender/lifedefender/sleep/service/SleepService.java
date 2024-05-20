package com.lifedefender.lifedefender.sleep.service;

import com.lifedefender.lifedefender.sleep.dto.SleepRequestDto;
import com.lifedefender.lifedefender.sleep.dto.SleepResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

public interface SleepService {
    ResponseEntity<List<SleepResponseDto>> retrieve();

    ResponseEntity<SleepResponseDto> save(SleepRequestDto sleepRequestDto);
}
