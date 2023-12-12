package com.example.testfotmvc.apibody;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;

public class BookBean implements Serializable {
    @Getter
    @Setter
    public static class SaveBookBean{
        private Integer id;
        private String title;
        private String author;
        private String bookConcern;
        private LocalDate publishDate;
        private Float price;
        private Integer categoryId;
    }
}
