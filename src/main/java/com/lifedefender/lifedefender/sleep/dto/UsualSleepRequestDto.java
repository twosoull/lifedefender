package com.lifedefender.lifedefender.sleep.dto;

import com.lifedefender.lifedefender.entity.UsualSleep;
import lombok.Data;

@Data
public class UsualSleepRequestDto {

    private Integer usuallySleep;

    public UsualSleep toEntity(){
        return new UsualSleep(
                this.usuallySleep
        );
    }
}
