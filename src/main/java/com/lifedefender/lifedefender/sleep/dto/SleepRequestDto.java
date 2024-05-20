package com.lifedefender.lifedefender.sleep.dto;

import com.lifedefender.lifedefender.entity.Sleep;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class SleepRequestDto {

    private Long id;
    private String sleepPlace;
    private Integer sleepHour;
    private Integer sleepMinute;
    private Integer sleepDay;
    private Integer usuallySleep;
    private LocalDateTime regDate;
    private String regId;

    public Sleep toEntity(){
        return new Sleep(
                this.sleepPlace,
                this.sleepHour,
                this.sleepMinute,
                this.sleepDay,
                this.usuallySleep
        );
    }
}
