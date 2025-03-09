package day8_OOP.abstraction;

public class PartTimeEmployeeAbstraction extends EmployeeAbstraction{

    private int hoursWorked;
    private double overTimePay;


    public PartTimeEmployeeAbstraction(int id, String name, double salary, double overTimePay,int hoursWorked) {
        super(id, name, salary);
        this.overTimePay = overTimePay;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return salary + (overTimePay * hoursWorked);
    }
}
