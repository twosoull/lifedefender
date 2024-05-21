package com.lifedefender.lifedefender.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "sleep_manage")
public class SleepManage {

    @Id @GeneratedValue
    @Column(name = "smanage_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    @OneToMany(mappedBy = "sleepManage")
    private List<Sleep> sleeps;

    private LocalDateTime sleepDate;
    private LocalDateTime regDate;
}
