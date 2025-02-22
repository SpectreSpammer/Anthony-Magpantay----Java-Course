package day8_OOP.inheritance;

public class PartTimeEmployeeInheritance extends  EmployeeInheritance{

    private int hoursWorked;
    private double overtimePay;

    public PartTimeEmployeeInheritance(String name, int id, double salary,int hoursWorked, double overtimePay) {
        super(name, id, salary);
        this.hoursWorked = hoursWorked;
        this.overtimePay = overtimePay;
    }

    @Override
    public double calculateSalary(){
        return super.calculateSalary() + (overtimePay * hoursWorked);
    }

    @Override
    public void displayEmployeeInfo(){
        super.displayEmployeeInfo();
        System.out.println("Hours of Worked: " + hoursWorked);
        System.out.println("Over time pay: " + overtimePay);
    }


}
