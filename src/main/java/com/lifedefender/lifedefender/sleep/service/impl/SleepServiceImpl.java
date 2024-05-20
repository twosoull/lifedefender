package com.lifedefender.lifedefender.sleep.service.impl;

import com.lifedefender.lifedefender.entity.Sleep;
import com.lifedefender.lifedefender.sleep.dto.SleepRequestDto;
import com.lifedefender.lifedefender.sleep.dto.SleepResponseDto;
import com.lifedefender.lifedefender.sleep.repository.SleepRepository;
import com.lifedefender.lifedefender.sleep.service.SleepService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor

public class SleepServiceImpl implements SleepService {

    private final SleepRepository sleepRepository;
    @Override
    public ResponseEntity<List<SleepResponseDto>> retrieve() {

        List<Sleep> findSleeps = sleepRepository.findAll();

        List<SleepResponseDto> sleepResponseDtoList = findSleeps
                .stream()
                .map(sleep -> new SleepResponseDto(sleep))
                .collect(Collectors.toList());
        return new ResponseEntity<>(sleepResponseDtoList, HttpStatus.OK);
    }

    @Override
    @Transactional
    public ResponseEntity<SleepResponseDto> save(SleepRequestDto sleepRequestDto) {

        Sleep saveSleep = sleepRepository.save(sleepRequestDto.toEntity());
        return new ResponseEntity<>(new SleepResponseDto(saveSleep),HttpStatus.OK);
    }
}
