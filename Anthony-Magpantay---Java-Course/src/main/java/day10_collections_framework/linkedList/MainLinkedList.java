package day10_collections_framework.linkedList;

import day10_collections_framework.arrayList.EmployeeArrayList;
import day10_collections_framework.arrayList.EmployeeServiceArrayList;

public class MainLinkedList {

    public static void main(String[] args) {

        EmployeeServiceLinkedList employees = new EmployeeServiceLinkedList();
        employees.addEmployee(new EmployeeLinkedList(1,"anthony","IT"));
        employees.addEmployee(new EmployeeLinkedList(1,"anthony","IT"));
        employees.addEmployee(new EmployeeLinkedList(5,"robin","HR"));
        employees.addEmployee(new EmployeeLinkedList(3,"nan","Security"));
        employees.addEmployee(new EmployeeLinkedList(4,"nami","Sales"));
        employees.addEmployee(new EmployeeLinkedList(6,"sanji","Kitchen"));

        System.out.println("-----After adding of employees-----");
        employees.printALlEmployees();
        System.out.println();
        employees.addEmployeeByFirstIndex(new EmployeeLinkedList(7,"luffy","Backend"));
        System.out.println("-----After adding first employee in First Index-----");
        employees.printALlEmployees();
        System.out.println();
        employees.addEmployeeByLastIndex(new EmployeeLinkedList(8,"zoro","Frontend"));
        System.out.println("-----After adding first employee in Last Index-----");
        employees.printALlEmployees();
        System.out.println();
        employees.addEmployeeByIndex(4,new EmployeeLinkedList(9,"brook","Music"));
        System.out.println("-----After adding employee in middle Index-----");
        employees.printALlEmployees();
        System.out.println();
        employees.updateEmployeeByIndex(2,new EmployeeLinkedList(10,"anthony","Devops"));
        System.out.println("-----Updating Employee-----");
        employees.printALlEmployees();
        System.out.println();
        employees.removeEmployeeByIndex(5);
        System.out.println("-----Removing Employee by index-----");
        employees.printALlEmployees();
        System.out.println();
        System.out.println("Total number of employees: " + employees.getTotalNoOfEmployees());
        System.out.println("Is the employee empty?" + employees.isEmpty());
        System.out.println();
        System.out.println("First employee: " + employees.getFirstEmployee());
        System.out.println("Last employee: " + employees.getLastEmployee());
        System.out.println("Employee at index 2: " + employees.getEmployeeByIndex(2));

    }
}
