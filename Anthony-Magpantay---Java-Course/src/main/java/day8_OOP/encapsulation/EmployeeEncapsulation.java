package day8_OOP.encapsulation;

public class EmployeeEncapsulation {

    private String name;
    private int id;
    private double salary;

    public EmployeeEncapsulation(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if( salary > 0){
            this.salary = salary;
        }else {
            System.out.println("Salary must be greater than zero");
        }
    }

    public void salaryIncreaseByPercentage(double percentage){
        if(percentage > 0){
            this.salary *= (percentage / 100);

            System.out.println(name + " received a " + percentage + "% raise");
        }else {
            System.out.println("Raise percentage must be greater than zero");
        }
    }
}
