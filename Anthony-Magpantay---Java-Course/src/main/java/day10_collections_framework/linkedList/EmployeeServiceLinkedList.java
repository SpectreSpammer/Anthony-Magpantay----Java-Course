package day10_collections_framework.linkedList;

import day10_collections_framework.arrayList.EmployeeArrayList;

import java.util.ArrayList;

public class EmployeeServiceLinkedList {

    private ArrayList<EmployeeLinkedList> employeeList;

    public EmployeeServiceLinkedList() {
        employeeList = new ArrayList<>();
    }

    //get last
    public EmployeeLinkedList getLastEmployee(){
        return employeeList.getLast();
    }

    //get first
    public EmployeeLinkedList getFirstEmployee(){
        return employeeList.getFirst();
    }

    //get employee by index
    public EmployeeLinkedList getEmployeeByIndex(int employeeId){
        return employeeList.get(employeeId);
    }

    //add object
    public void addEmployee(EmployeeLinkedList addEmployee){
       employeeList.add(addEmployee);
    }

    //add by index
    public void addEmployeeByIndex(int index,EmployeeLinkedList addEmployeeByIndex){
        employeeList.add(index,addEmployeeByIndex);
    }

    //add in last
    public void addEmployeeByLastIndex(EmployeeLinkedList addEmployeeInLastIndex){
        employeeList.addLast(addEmployeeInLastIndex);
    }

    //add in first
    public void addEmployeeByFirstIndex(EmployeeLinkedList addEmployeeInFirstIndex){
        employeeList.addFirst(addEmployeeInFirstIndex);
    }

    //update
    public void updateEmployeeByIndex(int index,EmployeeLinkedList updateEmployeeByIndex){
        employeeList.set(index,updateEmployeeByIndex);
    }

    //delete
    public EmployeeLinkedList removeEmployeeByIndex(int employeeId){
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
        for(EmployeeLinkedList emp : employeeList){
            System.out.println(" - " + emp);
        }
    }


}
