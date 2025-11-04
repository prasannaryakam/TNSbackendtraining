// Program: Display Employee Details using Instance and Static Variables

// Logic Class
public class Employee {
    // Instance variables — unique for each employee
    int empId;
    String empName;
    double salary;

    // Static variable — common for all employees
    static String companyName = "Tech Solutions Pvt. Ltd.";

    // Method to display employee information
    void displayEmployeeDetails() {
        // Local variable
        String message = "Employee Record";
        
        // Printing employee details
        System.out.println("-----------------------------------");
        System.out.println(message);
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Salary: ₹" + salary);
        System.out.println("Company: " + companyName);
        System.out.println("-----------------------------------\n");
    }
}
