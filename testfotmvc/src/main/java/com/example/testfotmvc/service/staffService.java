package com.example.testfotmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.testfotmvc.model.staffModel;
import com.example.testfotmvc.repository.staffRepository;

@Service
public class staffService {

    @Autowired
    staffRepository staffRepository;
    public void addStaff(staffModel staffModel){
        staffRepository.addStaff(staffModel);
    }
}
