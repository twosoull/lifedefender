package com.lifedefender.lifedefender.sleep.dto;

import com.lifedefender.lifedefender.entity.UsualSleep;
import lombok.Data;

@Data
public class UsualSleepResponseDto {
    private Integer usuallySleep;

    public UsualSleepResponseDto(UsualSleep usualSleep){
        this.usuallySleep = usualSleep.getUsuallySleep();
    }
}
