package day8_OOP.abstraction;

public class MainAbstraction {
    public static void main(String[] args) {

        EmployeeAbstraction fte = new FullTimeEmployeeAbstraction(101,"Anthony",80000.75, 40000.75);
        EmployeeAbstraction pt = new PartTimeEmployeeAbstraction(102,"Nan",90000.75, 2500.75,3);

        fte.displayInfo();
        System.out.println("Total salary for Full Time Employee: " + fte.calculateSalary());
        System.out.println();

        pt.displayInfo();
        System.out.println("Total salary for Part Time Employee: " + pt.calculateSalary());
        System.out.println();
    }
}
