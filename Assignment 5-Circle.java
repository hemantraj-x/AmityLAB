import java.util.Scanner;

class Point {
    int x, y;

    void input(Scanner sc) {
        System.out.print("Enter x: ");
        x = sc.nextInt();
        System.out.print("Enter y: ");
        y = sc.nextInt();
    }
}

class Circle {
    Point p;
    double radius;

    Circle() {
        p = new Point();
    }

    void input(Scanner sc) {
        p.input(sc);
        System.out.print("Enter radius: ");
        radius = sc.nextDouble();
    }

    void display() {
        double area = Math.PI * radius * radius;
        System.out.println("Center: (" + p.x + "," + p.y + ")");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
    }
}

public class Assignment5_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle();
        c.input(sc);
        c.display();
    }
}
