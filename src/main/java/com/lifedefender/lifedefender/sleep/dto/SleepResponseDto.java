package com.lifedefender.lifedefender.sleep.dto;

import com.lifedefender.lifedefender.entity.Sleep;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class SleepResponseDto {

    private Long id;
    private String sleepPlace;
    private Integer sleepHour;
    private Integer sleepMinute;
    private Integer sleepDay;
    private Integer usuallySleep;
    private LocalDateTime regDate;
    private String regId;

    public SleepResponseDto(Sleep s) {
        this.id = s.getId();
        this.sleepPlace = s.getSleepPlace();
        this.sleepHour = s.getSleepHour();
        this.sleepMinute = s.getSleepMinute();
        this.sleepDay = s.getSleepDay();
        this.usuallySleep = s.getUsuallySleep();
        this.regDate = s.getRegDate();
        this.regId = s.getRegId();
    }
/*

    public SleepResponseDto toDto(Sleep s){
        return SleepResponseDto.builder()
                .id(s.getId())
                .sleepPlace(s.getSleepPlace())
                .sleepHour(s.getSleepHour())
                .sleepMinute(s.getSleepMinute())
                .sleepDay(s.getSleepDay())
                .usuallySleep(s.getUsuallySleep())
                .regDate(s.getRegDate())
                .regId(s.getRegId())
                .build();
    }
     */
}
