package com.example.testfotmvc.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.testfotmvc.model.staffModel;
import com.example.testfotmvc.service.staffService;

@RestController
public class staffController {
    @Autowired
    staffModel staffModel;

    @Autowired
    staffService staffService;
    @RequestMapping("/addStaff")
    public String hello(){
        staffModel = new staffModel();
        staffModel.setPassword("1234");
        staffModel.setEmail("email@email.com");
        staffModel.setPhone("22334455");
        staffModel.setPosition("Manager");
        staffService.addStaff(staffModel);
        return "New Staff added";
    }

}
