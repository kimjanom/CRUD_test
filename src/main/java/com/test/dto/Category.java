package com.test.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity(name = "book_category")
@Data
@ToString
@EqualsAndHashCode
//파라미터가 없는 기본 생성자 생성-> 자바는 클래스에 생성자를 작성하지 않으면 자동으로 생성하지 않나?
@NoArgsConstructor
public class Category {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    @Column(name = "category", nullable = false)
    private String category;

}
