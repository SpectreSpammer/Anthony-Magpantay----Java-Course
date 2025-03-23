package day10_collections_framework.treeSet;

import day10_collections_framework.arrayList.EmployeeArrayList;

import java.util.Comparator;
import java.util.TreeSet;

public class EmployeeServiceTreeSet {
    private TreeSet<EmployeeTreeSet> employeeTreeSets;

    public EmployeeServiceTreeSet() {
        employeeTreeSets = new TreeSet<>();
    }

    public EmployeeServiceTreeSet(Comparator<EmployeeTreeSet> comparator) {
       employeeTreeSets = new TreeSet<>(comparator);
    }

    //get first
    public EmployeeTreeSet getFirstEmployee(){
        return employeeTreeSets.getFirst();
    }

    //get last
    public EmployeeTreeSet getLastEmployee(){
        return employeeTreeSets.getLast();
    }

    //add object
    public boolean addEmployee(EmployeeTreeSet addEmployee){
        return employeeTreeSets.add(addEmployee);
    }


    //delete object
    public boolean removeEmployeeByIndex(EmployeeTreeSet removeEmployee){
        return employeeTreeSets.remove(removeEmployee);
    }

    //delete first
    public EmployeeTreeSet removeFirstEmployee(){
        return employeeTreeSets.removeFirst();
    }

    //delete last
    public EmployeeTreeSet removeLastEmployee(){
        return employeeTreeSets.removeLast();
    }

    //print out of all employees
    public void printALlEmployees(){
        for(EmployeeTreeSet emp : employeeTreeSets){
            System.out.println(" - " + emp);
        }
    }
}
