package com.example.testfotmvc.model;

import org.springframework.stereotype.Component;
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Table;

@Component
@Data
@Entity
@Table(name = "memberinfo") // 指定表名
public class staffModel {
    private int id;
    private String email;
    private String phone;
    private String password;
    private String position;
}
