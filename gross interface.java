
// Gross Interface
interface Gross {
    double calculateGrossSalary();
    void displayGrossDetails();
}

// Employee Class
abstract class Employee {
    protected String empId;
    protected String name;
    protected double basicSalary;
    
    public Employee(String empId, String name, double basicSalary) {
        this.empId = empId;
        this.name = name;
        this.basicSalary = basicSalary;
    }
    
    public String getEmpId() { return empId; }
    public String getName() { return name; }
    public double getBasicSalary() { return basicSalary; }
}

// Salary Class extending Employee and implementing Gross
class Salary extends Employee implements Gross {
    private double hra;
    private double da;
    private double ta;
    
    public Salary(String empId, String name, double basicSalary, double hra, double da, double ta) {
        super(empId, name, basicSalary);
        this.hra = hra;
        this.da = da;
        this.ta = ta;
    }
    
    // Implementing Gross interface method
    public double calculateGrossSalary() {
        return basicSalary + hra + da + ta;
    }
    
    // Implementing Gross interface method
    public void displayGrossDetails() {
        double gross = calculateGrossSalary();
        System.out.println("=== EMPLOYEE GROSS SALARY DETAILS ===");
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: $" + basicSalary);
        System.out.println("HRA: $" + hra);
        System.out.println("DA: $" + da);
        System.out.println("TA: $" + ta);
        System.out.println("Gross Salary: $" + gross);
        System.out.println("=====================================");
    }
}

// Test class
class GrossSalaryTest {
    public static void main(String[] args) {
        Salary emp1 = new Salary("EMP001", "John Doe", 50000, 10000, 15000, 5000);
        Salary emp2 = new Salary("EMP002", "Jane Smith", 60000, 12000, 18000, 6000);
        
        System.out.println("Employee 1 Gross Salary:");
        emp1.displayGrossDetails();
        
        System.out.println("\nEmployee 2 Gross Salary:");
        emp2.displayGrossDetails();
        
        // Using interface reference
        Gross grossEmp = emp1;
        System.out.println("\nGross salary via interface: $" + grossEmp.calculateGrossSalary());
    }
}