package com.test.dto;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Team {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String teamName;
//    양방향 매핑을 위해 추가
    @OneToMany(mappedBy = "team")
    private List<Member> members = new ArrayList<>();
}