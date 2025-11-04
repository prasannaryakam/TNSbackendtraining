// Main Class
public class EmployeeMain {
    public static void main(String[] args) {
        // Creating first employee object
        Employee e1 = new Employee();
        e1.empId = 201;
        e1.empName = "Anjali";
        e1.salary = 55000.50;
        e1.displayEmployeeDetails();

        // Creating second employee object
        Employee e2 = new Employee();
        e2.empId = 202;
        e2.empName = "Rahul";
        e2.salary = 67000.75;
        e2.displayEmployeeDetails();
    }
}
