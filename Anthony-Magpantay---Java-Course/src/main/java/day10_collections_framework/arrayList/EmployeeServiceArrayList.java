package day10_collections_framework.arrayList;

import java.util.ArrayList;

public class EmployeeServiceArrayList {

    private ArrayList<EmployeeArrayList> employeeList;

    public EmployeeServiceArrayList() {
        employeeList = new ArrayList<>();
    }

    //get last
    public EmployeeArrayList getLastEmployee(){
        return employeeList.getLast();
    }

    //get first
    public EmployeeArrayList getFirstEmployee(){
        return employeeList.getFirst();
    }

    //get employee by index
    public EmployeeArrayList getEmployeeByIndex(int employeeId){
        return employeeList.get(employeeId);
    }

    //add object
    public void addEmployee(EmployeeArrayList addEmployee){
       employeeList.add(addEmployee);
    }

    //add by index
    public void addEmployeeByIndex(int index,EmployeeArrayList addEmployeeByIndex){
        employeeList.add(index,addEmployeeByIndex);
    }

    //add in last
    public void addEmployeeByLastIndex(EmployeeArrayList addEmployeeInLastIndex){
        employeeList.addLast(addEmployeeInLastIndex);
    }

    //add in first
    public void addEmployeeByFirstIndex(EmployeeArrayList addEmployeeInFirstIndex){
        employeeList.addFirst(addEmployeeInFirstIndex);
    }

    //update
    public void updateEmployeeByIndex(int index,EmployeeArrayList updateEmployeeByIndex){
        employeeList.set(index,updateEmployeeByIndex);
    }

    //delete
    public EmployeeArrayList removeEmployeeByIndex(int employeeId){
        return employeeList.remove(employeeId);
    }

    //total # of employees
    public int getTotalNoOfEmployees(){
        return employeeList.size();
    }

    //empty
    public boolean isEmpty(){
        return employeeList.isEmpty();
    }

    //print out of all employees
    public void printALlEmployees(){
        for(EmployeeArrayList emp : employeeList){
            System.out.println(" - " + emp);
        }
    }


}
