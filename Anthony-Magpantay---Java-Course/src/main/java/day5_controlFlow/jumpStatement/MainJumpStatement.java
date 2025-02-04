package day5_controlFlow.jumpStatement;

public class MainJumpStatement {
    public static void main(String[] args) {

        String name = "Anthony";
        String performanceRating = "B";
        double salary = 50000;

        int yearsOfService = 3;

        System.out.println("Employee Name: " + name);
        //for int
        switch (yearsOfService){
            case 0:
            case 1:
                System.out.println(" Employee Level: Trainee");

            case 2:
            case 3:
                System.out.println(" Employee Level: Junior");

            case 4:
            case 5:
                System.out.println(" Employee Level: Mid");
                break;
            case 6:
            case 7:
                System.out.println(" Employee Level: Senior");
                break;
            default:
                System.out.println(" Employee Level: Expert");

        }

        //for String
        System.out.println("Performance Rating:");
        switch (performanceRating.toLowerCase()){
            case "a":
                System.out.println("Very Good");
                break;

            case "b":
                System.out.println("Good");
                break;

            case "c":
                System.out.println("Fair");
                break;

            default:
                System.out.println("Failed");
        }


        System.out.println("Salary Adjustment");
        for(int year = 1; year <=5; year++){
            if( year == 3){
                System.out.println("Skipping year 3 due to salary adjustment");
                break;
//                continue;
            }

            salary *= 1.05;
            System.out.printf("Year %d,  Salary: %.2f %n",
                                year,    salary);
        }
    }
}
