// Interface for Sales Department
interface SalesDepartment {
    void processSale(double amount);
}

// Interface for Finance Department
interface FinanceDepartment {
    void generateInvoice(String clientName, double amount);
}

// Class implementing both interfaces
class CommercialExecutive implements SalesDepartment, FinanceDepartment {

    double lastSaleAmount;
    String lastClient;

    // Implement SalesDepartment method
    public void processSale(double amount) {
        lastSaleAmount = amount;
        System.out.println("Sales Department:");
        System.out.println("Sale processed successfully.");
        System.out.println("Sale Amount: ₹" + amount);
    }

    // Implement FinanceDepartment method
    public void generateInvoice(String clientName, double amount) {
        lastClient = clientName;
        System.out.println("\nFinance Department:");
        System.out.println("Invoice generated successfully.");
        System.out.println("Client Name: " + clientName);
        System.out.println("Invoice Amount: ₹" + amount);
    }

    // Additional method
    void showSummary() {
        System.out.println("\n--- Commercial Summary ---");
        System.out.println("Client: " + lastClient);
        System.out.println("Final Sale Amount: ₹" + lastSaleAmount);
        System.out.println("All operations completed successfully.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        CommercialExecutive exec = new CommercialExecutive();

        exec.processSale(50000);
        exec.generateInvoice("ABC Pvt Ltd", 50000);
        exec.showSummary();
    }
}
