package com.test.study.bean;

import lombok.Data;

/**
 * @author Kindy
 * @Description:
 * @date
 */

@Data
public class Book {


    private    String  name;
    private    String  author;


    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }


    public Book() {
    }
}
