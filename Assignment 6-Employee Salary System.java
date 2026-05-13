import java.util.*;

// Gross Interface
interface Gross {
    double calculateGross();
}

// Employee Class
class Employee {
    int empId;
    String empName;

    void getEmployeeData(Scanner sc) {
        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Name: ");
        empName = sc.nextLine();
    }

    void printEmployeeData() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
    }
}

// Salary Class implementing Gross
class Salary extends Employee implements Gross {
    double basicPay;
    double hra;
    double da;

    void getSalaryData(Scanner sc) {
        System.out.print("Enter Basic Pay: ");
        basicPay = sc.nextDouble();
        System.out.print("Enter HRA: ");
        hra = sc.nextDouble();
        System.out.print("Enter DA: ");
        da = sc.nextDouble();
    }

    public double calculateGross() {
        return basicPay + hra + da;
    }

    void printSalary() {
        printEmployeeData();
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + calculateGross());
    }
}

// Driver Class
public class Assignment6_Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Salary emp = new Salary();

        emp.getEmployeeData(sc);
        emp.getSalaryData(sc);

        System.out.println("\n--- Employee Salary Details ---");
        emp.printSalary();

        sc.close();
    }
}
