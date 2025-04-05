package day10_collections_framework.hashSet;

import day10_collections_framework.treeSet.EmployeeTreeSet;

import java.util.HashSet;

public class EmployeeServiceHashSets {
    HashSet<EmployeeHashSets> employeeHashSets;

    public EmployeeServiceHashSets() {
        employeeHashSets = new HashSet<>();
    }


    //get first
    public boolean containsEmployee(EmployeeHashSets containsEmployee){
        return employeeHashSets.contains(containsEmployee);
    }


    //add object
    public boolean addEmployee(EmployeeHashSets addEmployee){
        return employeeHashSets.add(addEmployee);
    }


    //delete object
    public boolean removeEmployeeByIndex(EmployeeHashSets removeEmployee){
        return employeeHashSets.remove(removeEmployee);
    }



    //print out of all employees
    public void printALlEmployees(){
        for(EmployeeHashSets emp : employeeHashSets){
            System.out.println(" - " + emp);
        }
    }
}
