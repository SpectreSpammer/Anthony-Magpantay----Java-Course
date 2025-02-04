package day5_controlFlow.decisionMaking;

import java.util.Scanner;

public class MainSwitch {
    public static void main(String[] args) {

       String name = "Anthony";

       int yearsOfService = 3;

        System.out.println("Employee Name: " + name);

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
    }
}
