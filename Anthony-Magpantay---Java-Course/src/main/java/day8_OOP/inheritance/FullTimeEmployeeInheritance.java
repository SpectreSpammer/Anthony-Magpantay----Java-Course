package day8_OOP.inheritance;

public class FullTimeEmployeeInheritance extends  EmployeeInheritance{

    private double bonus;

    public FullTimeEmployeeInheritance(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary(){
        return super.calculateSalary() + bonus;
    }

    @Override
    public void displayEmployeeInfo(){
        super.displayEmployeeInfo();
        System.out.println("Bonus: " + bonus);

    }


}
