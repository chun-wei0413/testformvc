package com.example.testfotmvc.entity;


import lombok.Data;
import lombok.ToString;

import java.sql.Date;

@Data
@ToString
public class Book {
    private Integer id;
    private String title;
    private String author;
    private String bookConcern;
    private Date publishDate;
    private Float price;
    private Integer categoryId;
}