package day10_collections_framework.treeMap;

public class MainTreeMap {
    public static void main(String[] args) {

        EmployeeServiceTreeMap serviceTreeMap = new EmployeeServiceTreeMap();

        //add
        serviceTreeMap.addEmployee(new EmployeeTreeMap(3,"anthony","it"));
        serviceTreeMap.addEmployee(new EmployeeTreeMap(1,"nan","devops"));
        serviceTreeMap.addEmployee(new EmployeeTreeMap(5,"sanji","kitchen"));
        serviceTreeMap.addEmployee(new EmployeeTreeMap(2,"nami","sales"));
        serviceTreeMap.addEmployee(new EmployeeTreeMap(4,"robin","hr"));
        serviceTreeMap.addEmployee(new EmployeeTreeMap(3,"anthony","it"));

        System.out.println("---Printing all employees");
        serviceTreeMap.displayAllEmployees();
        System.out.println();

        System.out.println("Get employee by id");
        int searchById = 2;
        EmployeeTreeMap emp = serviceTreeMap.getEmployeeById(searchById);
        System.out.println("Employee with an Id: " + searchById + ": " + emp);
        System.out.println();

        //update
        serviceTreeMap.updateEmployeeById(3,"Anthony magpantay","backend");
        System.out.println("Updating employee 3");
        serviceTreeMap.displayAllEmployees();

        System.out.println("Remove employee 4");
        serviceTreeMap.removeEmployeeById(4);
        System.out.println("After removing employee 4");
        serviceTreeMap.displayAllEmployees();
        System.out.println();

        System.out.println("First employee: " + serviceTreeMap.getFirstEmployee());
        System.out.println("Last employee: " + serviceTreeMap.getLastEmployee());

        System.out.println("Check if employee 4 is exist?");
        int checkId = 4;
        System.out.println("Does employee " + checkId + " exist?" + serviceTreeMap.isEmployeeExist(4));
    }
}
