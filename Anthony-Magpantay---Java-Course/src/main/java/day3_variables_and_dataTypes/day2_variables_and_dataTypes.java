package day3_variables_and_dataTypes;

public class day2_variables_and_dataTypes {
    public static void main(String[] args) {

        //variable type + variable name = declaration

        //8 bit
        byte age = 29;
        System.out.println("byte: " + age);

        //16 bit
        short deptCode = 12345;
        System.out.println("short: " + deptCode);

        char performanceGrade = 'B';
        System.out.println("char: " + performanceGrade);

        //32 bit
        float hourlyRate = 500.123456789f;
        System.out.println("float: " + hourlyRate);
        System.out.printf("Hourly Rate: %.2f %n", hourlyRate);

        int empId = 1234567890;
        System.out.println("int: " + empId);

        //64 bit
        double annualSalary = 1200000.12345678912;
        System.out.println("double: " + annualSalary);
        System.out.printf("Annual salary : %.2f %n", annualSalary);

        long sss = 123456789123456789L;
        System.out.println("long: " + sss);



        //string
        String name = "anthony";
        System.out.println("String: " + name);

        //boolean
        boolean isFullTime = false;
        System.out.println("boolean: " + isFullTime);
    }
}
