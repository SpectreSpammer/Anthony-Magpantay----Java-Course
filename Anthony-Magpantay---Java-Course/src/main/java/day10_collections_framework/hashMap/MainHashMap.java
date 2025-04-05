package day10_collections_framework.hashMap;

public class MainHashMap {
    public static void main(String[] args) {

        EmployeeServiceHashMap serviceHashMap = new EmployeeServiceHashMap();

        //add
        serviceHashMap.addEmployee(new EmployeeHashMap(3,"anthony","it"));
        serviceHashMap.addEmployee(new EmployeeHashMap(1,"nan","devops"));
        serviceHashMap.addEmployee(new EmployeeHashMap(5,"sanji","kitchen"));
        serviceHashMap.addEmployee(new EmployeeHashMap(2,"nami","sales"));
        serviceHashMap.addEmployee(new EmployeeHashMap(4,"robin","hr"));
        serviceHashMap.addEmployee(new EmployeeHashMap(3,"anthony","it"));

        System.out.println("---Printing all employees");
        serviceHashMap.displayAllEmployees();
        System.out.println();

        System.out.println("Get employee by id");
        int searchById = 2;
        EmployeeHashMap emp = serviceHashMap.getEmployeeById(searchById);
        System.out.println("Employee with an Id: " + searchById + ": " + emp);
        System.out.println();

        //update
        serviceHashMap.updateEmployeeById(3,"Anthony magpantay","backend");
        System.out.println("Updating employee 3");
        serviceHashMap.displayAllEmployees();

        System.out.println("Remove employee 4");
        serviceHashMap.removeEmployeeById(4);
        System.out.println("After removing employee 4");
        serviceHashMap.displayAllEmployees();
        System.out.println();

        System.out.println("Check if employee 4 is exist?");
        int checkId = 4;
        System.out.println("Does employee " + checkId + " exist?" + serviceHashMap.isEmployeeExist(4));
    }
}
