package com.jycoding.book.web;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class BookController {

    @GetMapping("/")
    public ResponseEntity<?> findAll() {
        return new ResponseEntity<String>("ok", HttpStatus.OK);
    }

}
