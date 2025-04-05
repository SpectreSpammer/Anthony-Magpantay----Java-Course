package day10_collections_framework.hashMap;

import java.util.HashMap;
import java.util.Map;

public class EmployeeServiceHashMap {

    private HashMap<Integer,EmployeeHashMap> employees;

    public EmployeeServiceHashMap() {
       employees = new HashMap<>();
    }

    //get
    public EmployeeHashMap getEmployeeById(int id){
        return  employees.get(id);
    }

    //add
    public EmployeeHashMap addEmployee(EmployeeHashMap addEmployee){
        return  employees.put(addEmployee.getId(), addEmployee);
    }

    //update
    public void updateEmployeeById(int id, String name, String dept){
        if(employees.containsKey(id)){
            employees.put(id,new EmployeeHashMap(id,name,dept));
        }
    }

    //remove
    public EmployeeHashMap removeEmployeeById(int id){
        return  employees.remove(id);
    }

    //exist
    public boolean isEmployeeExist(int id){
        return employees.containsKey(id);
    }

    //display
    public void displayAllEmployees(){
        for(Map.Entry<Integer,EmployeeHashMap> entry  : employees.entrySet()){
            System.out.println("Key: " + entry.getKey() + " , Value: " + entry.getValue());
        }
    }
}
