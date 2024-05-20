package com.lifedefender.lifedefender.sleep.controller;

import com.lifedefender.lifedefender.sleep.dto.SleepRequestDto;
import com.lifedefender.lifedefender.sleep.dto.SleepResponseDto;
import com.lifedefender.lifedefender.sleep.service.SleepService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class SleepController {

    private final SleepService sleepService;

    @GetMapping("/v1/sleep/retrieve")
    public ResponseEntity<List<SleepResponseDto>> retrieve(){
        return sleepService.retrieve();
    }

    @PostMapping("/v1/sleep/save")
    public ResponseEntity<SleepResponseDto> save(SleepRequestDto sleepRequestDto){
        return sleepService.save(sleepRequestDto);
    }
}
