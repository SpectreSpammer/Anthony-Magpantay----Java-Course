package day9_exceptions.customizedException;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MainCustomizedException {
    public static void main(String[] args) {

        EmployeeException employee = new EmployeeException( "Anthony",70000.75);

        try{
            employee.raiseSalary(-10);
        } catch (InvalidRaiseException e) {
            System.out.println("Exception: " + e.getMessage());
        }

    }
}
