package day10_collections_framework.hashSet;

public class MainHashSets {
    public static void main(String[] args) {

        EmployeeServiceHashSets employeeServiceHashSets = new EmployeeServiceHashSets();

        EmployeeHashSets emp5 = new EmployeeHashSets(105,"anthony","IT");
        EmployeeHashSets emp3 = new EmployeeHashSets(103,"nan","devops");
        EmployeeHashSets emp2 = new EmployeeHashSets(102,"nami","hr");
        EmployeeHashSets emp6 = new EmployeeHashSets(105,"anthony","IT");
        EmployeeHashSets emp1 = new EmployeeHashSets(101,"robin","pr");
        EmployeeHashSets emp4 = new EmployeeHashSets(104,"sanji","sales");


        System.out.println("--Adding of employees");
        System.out.println("Added employee 1: " + employeeServiceHashSets.addEmployee(emp1) );
        System.out.println("Added employee 2: " + employeeServiceHashSets.addEmployee(emp2) );
        System.out.println("Added employee 3: " + employeeServiceHashSets.addEmployee(emp3) );
        System.out.println("Added employee 4: " + employeeServiceHashSets.addEmployee(emp4) );
        System.out.println("Added employee 5: " + employeeServiceHashSets.addEmployee(emp5) );
        System.out.println("Added employee 6: " + employeeServiceHashSets.addEmployee(emp6) );
        System.out.println();

        employeeServiceHashSets.printALlEmployees();
        System.out.println();


        System.out.println("Checking if the employee is exist");
        System.out.println("Contains emp1: " + employeeServiceHashSets.containsEmployee(emp1));
        System.out.println("Contains emp2: " + employeeServiceHashSets.containsEmployee(emp2));
        System.out.println("Contains emp3: " + employeeServiceHashSets.containsEmployee(emp3));
        System.out.println("Contains emp4: " + employeeServiceHashSets.containsEmployee(emp4));
        System.out.println("Contains emp5: " + employeeServiceHashSets.containsEmployee(emp5));
        System.out.println("Contains emp6: " + employeeServiceHashSets.containsEmployee(emp6));

        System.out.println();

        System.out.println("hashcode for employee 1 " + emp1.hashCode());
        System.out.println("hashcode for employee 2 " + emp2.hashCode());
        System.out.println("hashcode for employee 3 " + emp3.hashCode());
        System.out.println("hashcode for employee 4 " + emp4.hashCode());
        System.out.println("hashcode for employee 5 " + emp5.hashCode());
        System.out.println("hashcode for employee 6 " + emp6.hashCode());







    }
}
