package com.lifedefender.lifedefender.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class User {

    @Id @GeneratedValue
    private Long id;

    @OneToMany(mappedBy = "user")
    private List<SleepManage> sleepManage;

    @OneToOne
    @JoinColumn(name="user_id")
    private UsualSleep usualSleep;

    private String name;
    private LocalDateTime regDate;


}
