package day4_operators.ArithmeticOperators;

public class MainArithmeticOperators {
    public static void main(String[] args) {


        String name = "Anthony";
        double salary = 50000;
        double bonus = 25000;
        double bir =  10000;
        double hourlyRate = 1500;
        int hoursOfWork = 9;
        int yearsOfService = 5;

        //addition +
        double grossPay = salary + bonus;
        System.out.println( " - Gross Pay: Php " + grossPay);


        //substraction -
        double netPay = grossPay - bir;
        System.out.println( " - Net Pay: Php " + netPay);

        //multiplication *
        double dailyIncome = hourlyRate * hoursOfWork;
        System.out.println( " - Daily Income: Php " + dailyIncome);

        //division /
        double annualIncreaseBaseOnYearsOfExperience = grossPay / yearsOfService;
        System.out.println( " - Annual Increase Based on years of service/experience " + annualIncreaseBaseOnYearsOfExperience);


        //modulus %
        int nextPayRaise = 365 %  120;
        System.out.println(" - Days until next pay raise: " + nextPayRaise);
    }
}
