package com.lifedefender.lifedefender.sleep.controller;

import com.lifedefender.lifedefender.sleep.dto.SleepRequestDto;
import com.lifedefender.lifedefender.sleep.dto.SleepResponseDto;
import com.lifedefender.lifedefender.sleep.dto.UsualSleepRequestDto;
import com.lifedefender.lifedefender.sleep.dto.UsualSleepResponseDto;
import com.lifedefender.lifedefender.sleep.service.SleepService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class SleepController {

    private final SleepService sleepService;
    /**
     * usualSleep
     */
    public ResponseEntity<UsualSleepResponseDto> retrieveUsualSleep(){
        return sleepService.retrieveUsualSleep();
    }

    public ResponseEntity<UsualSleepResponseDto> usualSleepSave(@RequestBody UsualSleepRequestDto usualSleepRequestDto){
        return sleepService.usualSleepSave(usualSleepRequestDto);
    }
    /**
     * Sleep
     * @return
     */
    @GetMapping("/v1/sleep/retrieve")
    public ResponseEntity<List<SleepResponseDto>> retrieveSleep(){
        return sleepService.retrieveSleep();
    }

    @PostMapping("/v1/sleep/save")
    public ResponseEntity<SleepResponseDto> saveSleep(@RequestBody SleepRequestDto sleepRequestDto){
        return sleepService.saveSleep(sleepRequestDto);
    }


}
