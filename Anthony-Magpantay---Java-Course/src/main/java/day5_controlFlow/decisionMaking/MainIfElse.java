package day5_controlFlow.decisionMaking;

public class MainIfElse {
    public static void main(String[] args) {

        double salary = 50000;
        double hourlyRate = 1000;
        int hoursOfWork = 9;
        int yearsOfService = 5;

        // equals ==
        if( yearsOfService == 10){
            System.out.println(" Anthony has been received a amount of 100,000 for staying the company for 10 years");
        }else{
            System.out.println(" Anthony has not reached 10 years");
        }

        // not equal !=
        if( salary != 50000){
            System.out.println(" - Anthony doesnt have a salary of 50k");
        }else{
            System.out.println(" - Anthony does have a salary of 50k");
        }

        // greater than >
        if(hoursOfWork > 9) {
            System.out.println(" - Anthony filed an overtime");
        }else {
            System.out.println(" - Anthony did not filed an overtime");
        }

        //less than <
        if( hourlyRate < 1000){
            System.out.println(" - Anthony is underpaid for being a developer");
        }else{
            System.out.println(" - Anthony is well paid for being a developer");
        }

        // greater than or equal to >=
        if(hoursOfWork >= 9) {
            System.out.println(" - Anthony filed an overtime");
        }else {
            System.out.println(" - Anthony did not filed an overtime");
        }

        //less than or equal to <=
        if( hourlyRate <= 1000){
            System.out.println(" - Anthony is underpaid for being a developer");
        }else{
            System.out.println(" - Anthony is well paid for being a developer");
        }


    }
}
