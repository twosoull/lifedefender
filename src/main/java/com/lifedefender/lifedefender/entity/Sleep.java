package com.lifedefender.lifedefender.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "sleep")
@Getter
@NoArgsConstructor
public class Sleep {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private String sleepPlace;
    private Integer sleepHour;
    private Integer sleepMinute;
    private Integer sleepDay;
    private Integer usuallySleep;
    private LocalDateTime regDate;
    private String regId;

    public Sleep(String sleepPlace, Integer sleepHour, Integer sleepMinute, Integer sleepDay, Integer usuallySleep) {
        this.sleepPlace = sleepPlace;
        this.sleepHour = sleepHour;
        this.sleepMinute = sleepMinute;
        this.sleepDay = sleepDay;
        this.usuallySleep = usuallySleep;
    }
}
