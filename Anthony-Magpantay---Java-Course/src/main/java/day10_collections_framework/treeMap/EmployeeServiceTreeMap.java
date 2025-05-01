package day10_collections_framework.treeMap;

import java.util.Map;
import java.util.TreeMap;

public class EmployeeServiceTreeMap {

    private TreeMap<Integer, EmployeeTreeMap> employees;

    public EmployeeServiceTreeMap() {
       employees = new TreeMap<>();
    }

    //get
    public EmployeeTreeMap getEmployeeById(int id){
        return  employees.get(id);
    }

    //add
    public EmployeeTreeMap addEmployee(EmployeeTreeMap addEmployee){
        return  employees.put(addEmployee.getId(), addEmployee);
    }

    //update
    public void updateEmployeeById(int id, String name, String dept){
        if(employees.containsKey(id)){
            employees.put(id,new EmployeeTreeMap(id,name,dept));
        }
    }

    //remove
    public EmployeeTreeMap removeEmployeeById(int id){
        return  employees.remove(id);
    }

    //exist
    public boolean isEmployeeExist(int id){
        return employees.containsKey(id);
    }

    //first employee
    public EmployeeTreeMap getFirstEmployee(){
        return employees.firstEntry().getValue();
    }

    //last employee
    public EmployeeTreeMap getLastEmployee(){
        return employees.lastEntry().getValue();
    }

    //display
    public void displayAllEmployees(){
        for(Map.Entry<Integer,EmployeeTreeMap> entry  : employees.entrySet()){
            System.out.println("Key: " + entry.getKey() + " , Value: " + entry.getValue());
        }
    }
}
