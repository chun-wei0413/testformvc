package com.example.testfotmvc.entity;


import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Category {
    private Integer id;
    private String name;
    private Boolean root;
    private Integer parentId;
}
