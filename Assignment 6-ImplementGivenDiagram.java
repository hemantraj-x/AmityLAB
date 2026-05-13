import java.util.Scanner;

// Interface
interface Exam {
    void percent_cal();
}

// Base class
class Student {
    String name;
    int roll_no;
    double marks1, marks2;

    void getData(Scanner sc) {
        System.out.print("Enter name: ");
        name = sc.nextLine();

        System.out.print("Enter roll number: ");
        roll_no = sc.nextInt();

        System.out.print("Enter marks1: ");
        marks1 = sc.nextDouble();

        System.out.print("Enter marks2: ");
        marks2 = sc.nextDouble();
        sc.nextLine(); // clear buffer
    }

    void show() {
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll_no);
        System.out.println("Marks1: " + marks1);
        System.out.println("Marks2: " + marks2);
    }
}

// Derived class
class Result extends Student implements Exam {
    double per;

    // Implement interface method
    public void percent_cal() {
        per = (marks1 + marks2) / 2;
    }

    void display() {
        show();
        System.out.println("Percentage: " + per + "%");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Result r = new Result();
        r.getData(sc);
        r.percent_cal();
        r.display();

        sc.close();
    }
}
