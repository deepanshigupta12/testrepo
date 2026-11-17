/**
 * Calculates and displays an employee's salary details.
 */
public class EmployeeSalary {
    public static void main(String[] args) {
        Employee employee = new Employee("Rahul", 30000);
        employee.printSalaryDetails();
    }
}

/**
 * Holds employee salary data and provides salary calculations.
 */
class Employee {
    private final String name;
    private final double basicSalary;

    Employee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

    private double calculateHra() {
        return basicSalary * 0.20;
    }

    private double calculateDa() {
        return basicSalary * 0.10;
    }

    private double calculatePf() {
        return basicSalary * 0.12;
    }

    private double calculateTotalSalary() {
        return basicSalary + calculateHra() + calculateDa();
    }

    private double calculateNetSalary() {
        return calculateTotalSalary() - calculatePf();
    }

    void printSalaryDetails() {
        System.out.println("Employee: " + name);
        System.out.println("Total Salary: " + calculateTotalSalary());
        System.out.println("Net Salary: " + calculateNetSalary());
    }
}
