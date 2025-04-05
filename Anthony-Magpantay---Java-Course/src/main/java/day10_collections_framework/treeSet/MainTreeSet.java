package day10_collections_framework.treeSet;

import day10_collections_framework.arrayList.EmployeeArrayList;

import java.util.Comparator;

public class MainTreeSet {
    public static void main(String[] args) {

        EmployeeServiceTreeSet employees = new EmployeeServiceTreeSet();
        employees.addEmployee(new EmployeeTreeSet(1,"anthony","IT"));
        employees.addEmployee(new EmployeeTreeSet(1,"anthony","IT"));
        employees.addEmployee(new EmployeeTreeSet(5,"robin","HR"));
        employees.addEmployee(new EmployeeTreeSet(3,"nan","Security"));
        employees.addEmployee(new EmployeeTreeSet(4,"nami","Sales"));
        employees.addEmployee(new EmployeeTreeSet(2,"sanji","Kitchen"));


        System.out.println("-----Employees Sorted-----");
        employees.printALlEmployees();
        System.out.println();
        System.out.println("First Employee:" + employees.getFirstEmployee());
        System.out.println("Last Employee:" + employees.getLastEmployee());
        System.out.println();

        EmployeeServiceTreeSet employeeByName = new EmployeeServiceTreeSet(
                Comparator.comparing(EmployeeTreeSet::getName)
        );
        employeeByName.addEmployee(new EmployeeTreeSet(1,"anthony","IT"));
        employeeByName.addEmployee(new EmployeeTreeSet(1,"anthony","IT"));
        employeeByName.addEmployee(new EmployeeTreeSet(5,"robin","HR"));
        employeeByName.addEmployee(new EmployeeTreeSet(3,"nan","Security"));
        employeeByName.addEmployee(new EmployeeTreeSet(4,"nami","Sales"));
        employeeByName.addEmployee(new EmployeeTreeSet(2,"sanji","Kitchen"));
        employeeByName.addEmployee(new EmployeeTreeSet(2,"brook","Artist"));
        employeeByName.printALlEmployees();
        System.out.println();

        EmployeeServiceTreeSet employeeByDept = new EmployeeServiceTreeSet(
                Comparator.comparing(EmployeeTreeSet::getDept)
        );
        employeeByDept.addEmployee(new EmployeeTreeSet(1,"anthony","IT"));
        employeeByDept.addEmployee(new EmployeeTreeSet(1,"anthony","IT"));
        employeeByDept.addEmployee(new EmployeeTreeSet(5,"robin","HR"));
        employeeByDept.addEmployee(new EmployeeTreeSet(3,"nan","Security"));
        employeeByDept.addEmployee(new EmployeeTreeSet(4,"nami","Sales"));
        employeeByDept.addEmployee(new EmployeeTreeSet(2,"sanji","Kitchen"));
        employeeByDept.addEmployee(new EmployeeTreeSet(2,"brook","Artist"));
        employeeByDept.printALlEmployees();
        System.out.println();

        System.out.println("First Employee: " + employees.getFirstEmployee());
        System.out.println("Last Employee: " + employees.getLastEmployee());
        System.out.println();

        employees.removeEmployeeByIndex(new EmployeeTreeSet(1,"anthony","IT"));
        employeeByDept.printALlEmployees();


    }
}
