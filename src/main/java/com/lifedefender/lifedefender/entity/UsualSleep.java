package com.lifedefender.lifedefender.entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "usual_sleep")
@Getter
public class UsualSleep {

    @Id @GeneratedValue
    @Column(name = "usual_id")
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "usually_sleep")
    private Integer usuallySleep;

    private LocalDateTime regDate;
    private String regId;

    public UsualSleep() {
    }

    public UsualSleep(Integer usuallySleep) {
        this.usuallySleep = usuallySleep;
    }
}
