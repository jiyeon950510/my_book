package com.jycoding.book.domain;

import org.springframework.data.jpa.repository.JpaRepository;

// @Repository 적어야 스프링이 IoC 빈으로 등록이 되는데, 
// JpaRepository 를 extends 하면 생략이 가능함.
// JpaRepository 는 CRUD 함수를 들고있음.
public interface BookRepository extends JpaRepository<Book, Long> {

}
