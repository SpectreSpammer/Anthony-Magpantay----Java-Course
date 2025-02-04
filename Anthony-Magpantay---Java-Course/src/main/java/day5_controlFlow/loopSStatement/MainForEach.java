package day5_controlFlow.loopSStatement;

import java.util.List;

public class MainForEach {
    public static void main(String[] args) {

        String [] employeeNames = {"Anthony","Nan","Nami","Robin"};
        Object [] employeeInfo = {"Anthony", 30, 50000.75, 10000.75f,true,'B'};

        System.out.println("List of Employees using arrays");
        for(String name : employeeNames){
            System.out.println(" - " + name);
        }

        System.out.println("--------------------");
        System.out.println("List of Employees using List");
        List<String> listOfEmployees =  List.of("Anthony","Nan","Nami","Robin");
        for(String name : listOfEmployees){
            System.out.println(" - " + name);
        }

        System.out.println("--------------------");
        System.out.println("Employee Info");

        for(Object info : employeeInfo){
            System.out.println(" - " + info);
        }
    }
}
