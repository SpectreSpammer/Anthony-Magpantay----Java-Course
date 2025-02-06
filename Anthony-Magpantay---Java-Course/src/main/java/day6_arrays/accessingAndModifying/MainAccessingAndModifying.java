package day6_arrays.accessingAndModifying;

public class MainAccessingAndModifying {
    public static void main(String[] args) {

        String [] employeeNames = { "Anthony","Nan","Nami","Robin"};

        int [] yearsOfService = { 5,10, 7,15};

        double [] salary = { 70000,30000,90000,120000};

        boolean [] isLate = { true, false, true, false};

        //printing out all employee names
        for(String empNames : employeeNames){
            System.out.println("Employee names: " + empNames);
        }

        //10% raise > 10 yrs of service
        System.out.println("Applying 10% increase to the employee who has 10 yrs of service");
        for(int i=0; i< yearsOfService.length;i++){
            if(yearsOfService [i] > 10){
                double originalSalary = salary[i];
                salary[i] *= 1.10;
                System.out.printf("%s received a 10%% raise, Original Salary: Php %.2f, New Salary: %.2f %n",
                                    employeeNames[i],       originalSalary,                   salary[i]  );
            }
        }

        System.out.println("--------------------");
        //10% salary deduction for the late employee
        System.out.println("Applying 10% salary deduction to the employee who is always late");
        for(int i=0; i< employeeNames.length;i++){
            if(isLate [i] ){
                double originalSalary = salary[i];
                salary[i] -= 1.10;
                System.out.printf("%s was late and 10%% deduction  , Original Salary: Php %.2f, New Salary: %.2f %n",
                        employeeNames[i],       originalSalary,                   salary[i]  );
            }
        }

    }
}
