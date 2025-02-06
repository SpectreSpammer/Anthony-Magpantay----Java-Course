package day6_arrays.initializingArray;

public class MainDeclaringAndInitializing {
    public static void main(String[] args) {

        String [] employeeNames = { "Anthony","Nan","Nami","Robin"};

        for(String empNames : employeeNames){
            System.out.println("Employee names:" + empNames);
        }

        System.out.println("------------");

        Object[] empInfo = {"Anthony",30,true};
        for(Object info : empInfo){
            System.out.println("Employee Info:" + info);
        }
    }
}
