package day5_controlFlow.loopSStatement;

public class MainForLoop {
    public static void main(String[] args) {

        double salary = 50000;

        int yearsOfService = 2;

        System.out.println(" Salary progression for the next 5 yrs");

        double annualRaisePercentage = 0.05;

        for(int years = 1; years <= 5; years++){
            salary *= (1 + annualRaisePercentage);

            yearsOfService++;

            System.out.printf("Year: %d - Salary: Php %.2f, Years of Service: %d %n",
                                years,          salary,                 yearsOfService);
        }
    }
}
