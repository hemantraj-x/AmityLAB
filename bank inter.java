import java.util.*;

// Bank Interface
interface Bank {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
    void displayAccountDetails();
}

// Customer Class
class Customer {
    private String customerId;
    private String customerName;
    private String customerAddress;
    private String phoneNumber;
    
    public Customer(String customerId, String customerName, String customerAddress, String phoneNumber) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.phoneNumber = phoneNumber;
    }
    
    // Getters
    public String getCustomerId() { return customerId; }
    public String getCustomerName() { return customerName; }
    public String getCustomerAddress() { return customerAddress; }
    public String getPhoneNumber() { return phoneNumber; }
    
    public void displayCustomerDetails() {
        System.out.println("=== CUSTOMER DETAILS ===");
        System.out.println("Customer ID: " + customerId);
        System.out.println("Name: " + customerName);
        System.out.println("Address: " + customerAddress);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("========================");
    }
}

// Account Class extending Customer and implementing Bank interface
class Account extends Customer implements Bank {
    private String accountNumber;
    private double balance;
    private String accountType;
    private Date openingDate;
    
    public Account(String customerId, String customerName, String customerAddress, String phoneNumber,
                   String accountNumber, String accountType) {
        super(customerId, customerName, customerAddress, phoneNumber);
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = 0.0;
        this.openingDate = new Date();
    }
    
    // Implementing Bank interface methods
    
    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("=== DEPOSIT SUCCESSFUL ===");
            System.out.println("Amount Deposited: $" + amount);
            System.out.println("New Balance: $" + balance);
            System.out.println("Transaction Time: " + new Date());
        } else {
            System.out.println("Invalid deposit amount!");
        }
        System.out.println("==========================\n");
    }
    
    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("=== WITHDRAWAL SUCCESSFUL ===");
            System.out.println("Amount Withdrawn: $" + amount);
            System.out.println("New Balance: $" + balance);
            System.out.println("Transaction Time: " + new Date());
        } else if(amount > balance) {
            System.out.println("Insufficient balance!");
            System.out.println("Available Balance: $" + balance);
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
        System.out.println("============================\n");
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void displayAccountDetails() {
        super.displayCustomerDetails();
        System.out.println("=== ACCOUNT DETAILS ===");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Current Balance: $" + balance);
        System.out.println("Account Opened: " + openingDate);
        System.out.println("========================");
    }
    
    // Additional utility methods
    public String getAccountNumber() { return accountNumber; }
    public String getAccountType() { return accountType; }
}

// Driver/Test Class
public class BankAccountSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Account> accounts = new ArrayList<>();
        
        System.out.println("=== BANK ACCOUNT MANAGEMENT SYSTEM ===");
        System.out.println("Creating sample accounts...\n");
        
        // Create sample accounts
        Account acc1 = new Account("CUST001", "John Doe", "123 Main St", "555-0101", 
                                  "ACC123456789", "Savings");
        Account acc2 = new Account("CUST002", "Jane Smith", "456 Oak Ave", "555-0202", 
                                  "ACC987654321", "Current");
        
        accounts.add(acc1);
        accounts.add(acc2);
        
        // Demonstrate functionality
        System.out.println("1. Account 1 Details:");
        acc1.displayAccountDetails();
        
        System.out.println("2. Making transactions...");
        acc1.deposit(5000.00);
        acc1.deposit(2500.50);
        acc1.withdraw(1000.00);
        
        System.out.println("3. Account 2 Details:");
        acc2.displayAccountDetails();
        acc2.deposit(10000.00);
        acc2.withdraw(2000.75);
        
        // Menu-driven interface
        int choice;
        do {
            System.out.println("\n=== BANK OPERATIONS MENU ===");
            System.out.println("1. Display All Accounts");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            
            switch(choice) {
                case 1:
                    System.out.println("\n=== ALL ACCOUNTS ===");
                    for(Account acc : accounts) {
                        acc.displayAccountDetails();
                        System.out.println();
                    }
                    break;
                    
                case 2:
                    System.out.print("Enter Account Number: ");
                    String accNum = sc.next();
                    Account depositAcc = findAccount(accounts, accNum);
                    if(depositAcc != null) {
                        System.out.print("Enter deposit amount: ");
                        double depAmt = sc.nextDouble();
                        depositAcc.deposit(depAmt);
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;
                    
                case 3:
                    System.out.print("Enter Account Number: ");
                    accNum = sc.next();
                    Account withdrawAcc = findAccount(accounts, accNum);
                    if(withdrawAcc != null) {
                        System.out.print("Enter withdrawal amount: ");
                        double withAmt = sc.nextDouble();
                        withdrawAcc.withdraw(withAmt);
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;
                    
                case 4:
                    System.out.print("Enter Account Number: ");
                    accNum = sc.next();
                    Account balanceAcc = findAccount(accounts, accNum);
                    if(balanceAcc != null) {
                        System.out.println("Account: " + accNum);
                        System.out.println("Balance: $" + balanceAcc.getBalance());
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;
                    
                case 5:
                    System.out.println("Thank you for banking with us!");
                    break;
                    
                default:
                    System.out.println("Invalid choice!");
            }
        } while(choice != 5);
        
        sc.close();
    }
    
    private static Account findAccount(List<Account> accounts, String accountNumber) {
        for(Account acc : accounts) {
            if(acc.getAccountNumber().equals(accountNumber)) {
                return acc;
            }
        }
        return null;
    }
}