package day6_arrays.multidimensional;

public class MainMultiDimensional {
    public static void main(String[] args) {


        //name, age, salary, years of service, is full time employee? , performance rating, ,
        Object [][] employeeData = {
                { "Anthony",30, 50000.75, 5,true, 'B'},
                { "Nan",29, 60000.85, 11,false, 'A'},
                { "Nami",21, 70000.25,13,false, 'C'},
                { "Robin",35, 80000.75,8,true, 'B'}
        };

        displayEmployeeData(employeeData);
        System.out.println("------------");


        //10% raise > 10 yrs of service
        System.out.println("Applying 10% increase to the employee who has 10 yrs of service");
        for(int i=0; i< employeeData.length;i++){
            if((int)employeeData [i][3] > 10){
                double originalSalary = (double) employeeData[i][2];
                employeeData[i][2] = (double) employeeData[i][2] *1.10;
                System.out.printf("%s received a 10%% raise, Original Salary: Php %.2f, New Salary: %.2f %n",
                        employeeData[i][0],       originalSalary,                   employeeData[i][2]  );
            }
        }
    }

    private static void displayEmployeeData(Object[][] employeeData) {

        for(Object[] employees : employeeData){
            System.out.println("Employee Name: " + employees[0]);
            System.out.println("Age: " + employees[1]);
            System.out.println("Salary: " +  employees[2]);
            System.out.println("Years of Service: " +  employees[3]);
            System.out.println("Full Time Employee: " + employees[4]);
            System.out.println("Performance Rating: " + employees[5]);
        }
    }
}
