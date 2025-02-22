package day7_methods;

public class MainOverloading {
    public static void main(String[] args) {

        //same name but different parameter

        displayEmployeeInfo("Anthony", 35,70000.75);
        System.out.println();

        double bonus = calculateSalary(70000.85, 7);
        System.out.println(" - Total Bonus: " + bonus);

        double salary =  calculateSalary(40, 3500.75);
        System.out.println(" - Total Salary: " + salary);

        System.out.println("Salary based on performance: " + calculateSalary(70000.75, "GoOd"));


    }

    private static double calculateSalary(int hoursWorked,double hourlyRate) {
        return hourlyRate * hoursWorked;
    }

    private static double calculateSalary(double salary, int yearsOfService) {
        return salary * yearsOfService;
    }

    private static String calculateSalary(double salary, String performanceRating) {

        double bonusPercentage;

        switch (performanceRating.toLowerCase()){
            case "excellent":
                bonusPercentage = 0.1;
                break;

            case "good":
                bonusPercentage = 0.05;
                break;

            default:
                bonusPercentage = 0.03;
                performanceRating = "average";
        }
        double bonusAmount = salary * bonusPercentage;
        return String.format("Anthony received a bonus of Php: %.2f, Performance: %s",
                                                        bonusAmount,        performanceRating);


    }


    private static void displayEmployeeInfo(String name, int age, double salary) {
        System.out.println(" - Employee Name: " + name);
        System.out.println(" - Employee Age: " + age);
        System.out.println(" - Employee Salary: " + salary);
    }
}
