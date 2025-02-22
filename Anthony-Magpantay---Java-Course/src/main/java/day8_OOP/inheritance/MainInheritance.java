package day8_OOP.inheritance;

public class MainInheritance {
    public static void main(String[] args) {

        EmployeeInheritance regularEmployee = new EmployeeInheritance("Anthony", 101, 70000.75);
        FullTimeEmployeeInheritance fte = new FullTimeEmployeeInheritance("Nan", 102, 80000.75, 25000.75);
        PartTimeEmployeeInheritance pt = new PartTimeEmployeeInheritance("Nan", 102, 80000.75, 4, 2500.75);

        System.out.println("Regular Employee");
        regularEmployee.displayEmployeeInfo();
        regularEmployee.calculateSalary();
        System.out.println();

        System.out.println("Full Time Employee");
        fte.displayEmployeeInfo();
        fte.calculateSalary();
        System.out.println();

        System.out.println("Part Time Employee");
        pt.displayEmployeeInfo();
        pt.calculateSalary();
    }
}
