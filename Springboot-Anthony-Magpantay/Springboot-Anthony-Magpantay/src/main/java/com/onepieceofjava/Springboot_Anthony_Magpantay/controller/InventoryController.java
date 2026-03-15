package com.onepieceofjava.Springboot_Anthony_Magpantay.controller;


import com.onepieceofjava.Springboot_Anthony_Magpantay.model.Employee;
import com.onepieceofjava.Springboot_Anthony_Magpantay.service.InventoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/onepieceofjava")
public class InventoryController {

    private final InventoryService service;

    //manually service injection without any annotation
    public InventoryController() {
        this.service = new InventoryService(); // manually initialization
    }

    // ====================EMPLOYEES====================
    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return service.getAllEmployees();
    }

// ====================ASSETS====================
    @GetMapping("/assets")
    public String getMessage2(){
        return "Hi Anthony, Welcome to Springboot";
    }
}
