//Note: Static keyword
//Static varible in java is used to share same variable or method of a given class
//-Properties
//-Functions
//-Blocks
//-Nested Classes

public class Note_ten {
    public static void main(String[] args) {
        // Call the static method WITHOUT creating any object
        Employee.displayCompany(); 

        // Create two employee objects
        Employee emp1 = new Employee("Leo");
        Employee emp2 = new Employee("Rolex");
        Employee emp3 = new Employee("jd");


        // Check the shared static variable
        System.out.println("Total Employees: " + Employee.employeeCount); // Outputs 2
    }
}
class Employee {
    String name;
    // 1. Static Variable: Shared by ALL instances of this class
    static String companyName = "Vikram"; 
    static int employeeCount = 0;

    public Employee(String name) {
        this.name = name;
        employeeCount++; // Increments the shared counter every time an object is made
    }

    // 2. Static Method: Can be called directly using the class name
    public static void displayCompany() {
        System.out.println("Welcome to " + companyName);
        // System.out.println(name); // ERROR! Static methods cannot access instance variables
    }
}
