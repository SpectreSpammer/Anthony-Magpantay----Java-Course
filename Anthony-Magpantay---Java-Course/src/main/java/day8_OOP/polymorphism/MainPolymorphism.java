package day8_OOP.polymorphism;

import day8_OOP.inheritance.EmployeeInheritance;
import day8_OOP.inheritance.FullTimeEmployeeInheritance;

public class MainPolymorphism {
    public static void main(String[] args) {

        EmployeePolymorphism fte = new FullTimeEmployeePolymorphism(101, "Anthony", 70000.75, 35000.75);
        fte.displayInfo();

        System.out.println();

        EmployeePolymorphism contractual = new ContractualEmployeePolymorphism(102, "Nan", 60000.75, 3500.75, 3);
        contractual.displayInfo();
    }
}