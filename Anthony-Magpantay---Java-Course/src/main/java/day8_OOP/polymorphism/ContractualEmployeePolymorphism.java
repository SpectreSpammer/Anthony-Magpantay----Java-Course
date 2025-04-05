package day8_OOP.polymorphism;

public class ContractualEmployeePolymorphism implements EmployeePolymorphism {

    private int id;
    private String name;
    private double salary;
    private double hourlyRate;
    private int workingHours;


    public ContractualEmployeePolymorphism(int id, String name, double salary, double hourlyRate, int workingHours) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.hourlyRate = hourlyRate;
        this.workingHours = workingHours;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public double salary() {
        return salary;
    }

    @Override
    public double calculateSalary() {
        return salary + ( hourlyRate * workingHours);
    }
}
