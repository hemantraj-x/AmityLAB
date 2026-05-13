interface Bank {
    void deposit();
    void withdraw();
}

class Customer {
    String name = "Anshuman";
    int id = 101;
}

class Account extends Customer implements Bank {
    double balance = 5000;

    public void deposit() {
        balance = balance + 1000;
        System.out.println("Deposited 1000");
    }

    public void withdraw() {
        balance = balance - 500;
        System.out.println("Withdrawn 500");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Balance: " + balance);
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Account a = new Account();

        a.display();
        a.deposit();
        a.withdraw();
        a.display();
    }
}
