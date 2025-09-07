import java.util.Scanner;
public class EmployeeManagementSystem {
// TODO: Create an Employee class with:
// - Static variable: companyName, totalEmployees
// - Instance variables: empId, name, department, salary // - Constructors (default and parameterized)
// - Static methods: setCompanyName(), getTotalEmployees() // - Instance methods: calculateAnnualSalary(), displayEmployee(), updateSalary()
static class Employee {


    static String companyName;
    static int totalEmployees = 0;

    private String empId;
    private String name;
    private String department;
    private double salary;

    public Employee() {
        this.empId = "Unknown";
        this.name = "Unknown";
        this.department = "Unassigned";
        this.salary = 0.0;
        totalEmployees++;
    }

    public Employee(String empId, String name, String department, double salary) {
        this.empId = empId;
        this.name = name;
        this.department = department;
        this.salary = salary;
        totalEmployees++;
    }

    public static void setCompanyName(String name) {
        companyName = name;
    }

    public static int getTotalEmployees() {
        return totalEmployees;
    }

    public double calculateAnnualSalary() {
        return salary * 12;
    }

    public void displayEmployee() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Monthly Salary: " + salary);
        System.out.println("Annual Salary: " + calculateAnnualSalary());
    }

    public void updateSalary(double newSalary) {
        this.salary = newSalary;
    }
}
// TODO: Create a Department class with:
// - deptName, Employee array, employeeCount
// - methods to add employees, find highest paid, calculate total payroll
    static class Department{
    String deptName;
    String[] employees;
    int employeeCount;

    public Department(String deptName, int maxEmployees, int employeeCount){
        this.deptName = deptName;
        this.employees = new String[maxEmployees];
        this.employeeCount = employeeCount;
    }
    public void addEmployee(String empId) {
        if (employeeCount < employees.length) {
            employees[employeeCount++] = empId;
        } else {
            System.out.println("Department is full, cannot add more employees.");
        }
    }
    public String findHighestPaid(Employee[] empList) {
        String highestPaid = null;
        double maxSalary = 0.0;
        for (String empId : employees) {
            for (Employee emp : empList) {
                if (emp.empId.equals(empId) && emp.salary > maxSalary) {
                    maxSalary = emp.salary;
                    highestPaid = empId;
                }
            }
        }
        return highestPaid;
    }
    public double calculateTotalPayroll(Employee[] empList) {
        double totalPayroll = 0.0;
        for (String empId : employees) {
            for (Employee emp : empList) {
                if (emp.empId.equals(empId)) {
                    totalPayroll += emp.salary;
                }
            }
        }
        return totalPayroll;
    }
}
// TODO: Main application features:
// 1. Set company name
// 2. Create multiple departments
// 3. Add employees to departments
// 4. Display department-wise employee information //
// 5. Find highest paid employee across all departments //
// 6. Calculate company-wide payroll
// 7. Show total number of employees

    static class Application {
        private Employee[] employees;
        private Department[] departments;
        private int empCount = 0;
        private int deptCount = 0;

        public Application(int maxEmployees, int maxDepartments) {
            employees = new Employee[maxEmployees];
            departments = new Department[maxDepartments];
        }

        public void addEmployee(Employee emp) {
            if (empCount < employees.length) {
                employees[empCount++] = emp;
            } else {
                System.out.println("Cannot add more employees, limit reached.");
            }
        }

        public void addDepartment(Department dept) {
            if (deptCount < departments.length) {
                departments[deptCount++] = dept;
            } else {
                System.out.println("Cannot add more departments, limit reached.");
            }
        }

        public void displayAllEmployees() {
            for (int i = 0; i < empCount; i++) {
                employees[i].displayEmployee();
                System.out.println("-------------------");
            }
        }

        public String findHighestPaidEmployee() {
            String highestPaidId = null;
            double maxSalary = 0.0;
            for (int i = 0; i < empCount; i++) {
                if (employees[i].salary > maxSalary) {
                    maxSalary = employees[i].salary;
                    highestPaidId = employees[i].empId;
                }
            }
            return highestPaidId;
        }

        public double calculateTotalPayroll() {
            double totalPayroll = 0.0;
            for (int i = 0; i < empCount; i++) {
                totalPayroll += employees[i].salary;
            }
            return totalPayroll;
        }
    }





    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== EMPLOYEE MANAGEMENT SYSTEM ===");
// TODO: Implement interactive menu system:
// 1. Add Employee
// 2. Display All Employees
// 3. Search Employee
// 4. Department Statistics
// 5. Company Statistics
// 6. Exit
        Application app = new Application(100, 10);
        Employee.setCompanyName("Tech Solutions Inc.");
        boolean running = true;
        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Department Statistics");
            System.out.println("5. Company Statistics");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    String empId = scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Department: ");
                    String dept = scanner.nextLine();
                    System.out.print("Enter Monthly Salary: ");
                    double salary = scanner.nextDouble();
                    scanner.nextLine();
                    Employee emp = new Employee(empId, name, dept, salary);
                    app.addEmployee(emp);
                    System.out.println("Employee added successfully.");
                    break;
                case 2:
                    app.displayAllEmployees();
                    break;
                case 3:
                    System.out.print("Enter Employee ID to search: ");
                    String searchId = scanner.nextLine();
                    boolean found = false;
                    for (int i = 0; i < app.empCount; i++) {
                        if (app.employees[i].empId.equals(searchId)) {
                            app.employees[i].displayEmployee();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Employee not found.");
                    }
                    break;
                case 4:

                    System.out.println("NO");
                    break;
                case 5:
                    System.out.println("Total Employees: " + Employee.getTotalEmployees());
                    System.out.println("Total Payroll: " + app.calculateTotalPayroll());
                    String highestPaidId = app.findHighestPaidEmployee();
                    if (highestPaidId != null) {
                        System.out.println("Highest Paid Employee ID: " + highestPaidId);
                    } else {
                        System.out.println("No employees found.");
                    }
                    break;
                case 6:


// TODO: Demonstrate all OOP principles:
// - Encapsulation (private variables, public methods) // - Object creation and interaction
// - Static vs instance members
// - Code reusability
// Your implementation here
                    scanner.close();
            }
    }
}

