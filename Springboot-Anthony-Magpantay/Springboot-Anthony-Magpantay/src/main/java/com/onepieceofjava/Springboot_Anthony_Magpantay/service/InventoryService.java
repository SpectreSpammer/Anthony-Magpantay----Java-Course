package com.onepieceofjava.Springboot_Anthony_Magpantay.service;


import com.onepieceofjava.Springboot_Anthony_Magpantay.model.Assets;
import com.onepieceofjava.Springboot_Anthony_Magpantay.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class InventoryService {

    private List<Employee> employeeList = new ArrayList<>();
    private List<Assets> assetsList = new ArrayList<>();
    private Long employeeId = 101L;
    private Long assetId = 201L;

    public InventoryService() {
        initializeEmployees();

    }

    private void initializeAssets() {
    }

    private void initializeEmployees() {
        addEmployee(new Employee(null,"Anthony","IT"));
        addEmployee(new Employee(null,"Nan","Security"));
        addEmployee(new Employee(null,"Luffy","HR"));
        addEmployee(new Employee(null,"Itchigo","PR"));
        addEmployee(new Employee(null,"Zoro","Marketing"));
    }

    public List<Employee> getAllEmployees(){
        return employeeList;
    }

    private void addEmployee(Employee employee) {
        employee.setId(employeeId++);
        if(employee.getAssets() != null && !employee.getAssets().isEmpty()){
            for(Assets asset : employee.getAssets()){
                asset.setId(assetId++);
                assetsList.add(asset);
            }
        }
    }

}
