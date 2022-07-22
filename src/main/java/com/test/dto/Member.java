package com.test.dto;

import lombok.Data;

import javax.persistence.*;

    @Data
    @Entity
    public class Member {
        @Id
        @GeneratedValue(strategy= GenerationType.AUTO)
        private long id;
        @Column
        private String MemberName;
        @ManyToOne
        @JoinColumn(name="TEAM_ID")
        private Team team;
    }
