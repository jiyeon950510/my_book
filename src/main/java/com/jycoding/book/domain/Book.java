package com.jycoding.book.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data // Getter, Setter
@Entity // 서버 실행시에 Object Relation Mapping 이 됨. (테이블이 h2에 생성)
public class Book {

    @Id // PK 를 해당 변수로 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 해당 데이터베이스 번호증가 전략을 따라가겠다
    private Long id;

    private String title;
    private String author;

}
