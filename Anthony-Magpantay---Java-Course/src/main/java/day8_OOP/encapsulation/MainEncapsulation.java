package day8_OOP.encapsulation;

public class MainEncapsulation {
    public static void main(String[] args) {

        EmployeeEncapsulation employeeEncapsulation = new EmployeeEncapsulation("Anthony", 101, 70000.75);

        //getters
        System.out.println("Name: " + employeeEncapsulation.getName());
        System.out.println("Id: " + employeeEncapsulation.getId());
        System.out.println("Name: " + employeeEncapsulation.getSalary());

        //setter
        employeeEncapsulation.setName("Nan");
        employeeEncapsulation.setSalary(90000.75);
        System.out.println("---- Updated -----");
        System.out.println("Name: " + employeeEncapsulation.getName());
        System.out.println("Name: " + employeeEncapsulation.getSalary());

        System.out.println();
        employeeEncapsulation.setSalary(-90000.75);
        System.out.println();

        employeeEncapsulation.salaryIncreaseByPercentage(50);
        System.out.println();

        employeeEncapsulation.salaryIncreaseByPercentage(-50);

    }
}
