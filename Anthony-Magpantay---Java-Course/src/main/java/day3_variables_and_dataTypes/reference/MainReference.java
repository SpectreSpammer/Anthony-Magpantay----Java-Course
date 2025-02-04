package day3_variables_and_dataTypes.reference;

public class MainReference {
    public static void main(String[] args) {

        //creating objects using interface
        Employee manager = new Manager();
        Employee developer = new Developer();
        Employee designer = new Designer();

        //arrays
        Employee[] employees = {manager,designer,developer};

        //for each
        for(Employee employee : employees){
            employee.work();
            employee.lunch();
            employee.attendMeeting();
            System.out.println();
        }

    }
}
