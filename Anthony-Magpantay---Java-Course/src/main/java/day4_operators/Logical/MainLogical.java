package day4_operators.Logical;

public class MainLogical {
    public static void main(String[] args) {


        double salary = 50000;
        double hourlyRate = 1000;
        int hoursOfWork = 9;
        int yearsOfService = 9;


        // && AND -> Both conditions are true
        if(hoursOfWork > 9 &&  salary <= 50000){
            System.out.println(" - Anthony has worked more than 9 hrs and his salary is less than 50k");
        }else{
            System.out.println(" - Anthony has worked less than 9 hrs and his salary is more than 50k");
        }


        // || OR -> Atleast one condition is true
        if( yearsOfService <= 10 || salary > 100000){
            System.out.println(" Anthony either a long time employee or highly paid");
        }else{
            System.out.println(" Anthony neither a long time employee or highly paid");
        }

    }
}
