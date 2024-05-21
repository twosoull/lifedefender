package com.lifedefender.lifedefender.sleep.service;

import com.lifedefender.lifedefender.sleep.dto.SleepRequestDto;
import com.lifedefender.lifedefender.sleep.dto.SleepResponseDto;
import com.lifedefender.lifedefender.sleep.dto.UsualSleepRequestDto;
import com.lifedefender.lifedefender.sleep.dto.UsualSleepResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface SleepService {
    ResponseEntity<UsualSleepResponseDto> usualSleepSave(UsualSleepRequestDto usualSleepRequestDto);
    ResponseEntity<UsualSleepResponseDto> retrieveUsualSleep();
    ResponseEntity<List<SleepResponseDto>> retrieveSleep();
    ResponseEntity<SleepResponseDto> saveSleep(SleepRequestDto sleepRequestDto);
}
