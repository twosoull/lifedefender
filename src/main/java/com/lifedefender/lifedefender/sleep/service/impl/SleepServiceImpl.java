package com.lifedefender.lifedefender.sleep.service.impl;

import com.lifedefender.lifedefender.entity.Sleep;
import com.lifedefender.lifedefender.entity.UsualSleep;
import com.lifedefender.lifedefender.sleep.dto.SleepRequestDto;
import com.lifedefender.lifedefender.sleep.dto.SleepResponseDto;
import com.lifedefender.lifedefender.sleep.dto.UsualSleepRequestDto;
import com.lifedefender.lifedefender.sleep.dto.UsualSleepResponseDto;
import com.lifedefender.lifedefender.sleep.repository.SleepRepository;
import com.lifedefender.lifedefender.sleep.repository.UsualSleepRepository;
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
    private final UsualSleepRepository usualSleepRepository;

    @Override
    public ResponseEntity<List<SleepResponseDto>> retrieveSleep() {

        List<Sleep> findSleeps = sleepRepository.findAll();

        List<SleepResponseDto> sleepResponseDtoList = findSleeps
                .stream()
                .map(sleep -> new SleepResponseDto(sleep))
                .collect(Collectors.toList());
        return new ResponseEntity<>(sleepResponseDtoList, HttpStatus.OK);
    }

    @Override
    @Transactional
    public ResponseEntity<SleepResponseDto> saveSleep(SleepRequestDto sleepRequestDto) {

        Sleep saveSleep = sleepRepository.save(sleepRequestDto.toEntity());
        return new ResponseEntity<>(new SleepResponseDto(saveSleep),HttpStatus.OK);
    }

    @Override
    public ResponseEntity<UsualSleepResponseDto> usualSleepSave(UsualSleepRequestDto usualSleepRequestDto) {
        UsualSleep saveUsualSleep = usualSleepRepository.save(usualSleepRequestDto.toEntity());
        return new ResponseEntity<>(new UsualSleepResponseDto(saveUsualSleep),HttpStatus.OK);
    }

    @Override
    public ResponseEntity<UsualSleepResponseDto> retrieveUsualSleep() {
        return null;
    }
}
