import java.util.*;

abstract class ThreeDObject {
    abstract double wholeSurfaceArea();
    abstract double volume();
}

class Box extends ThreeDObject {
    double l, b, h;

    Box(double l, double b, double h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    double wholeSurfaceArea() {
        return 2 * (l*b + b*h + l*h);
    }

    double volume() {
        return l * b * h;
    }
}

class Cube extends ThreeDObject {
    double a;

    Cube(double a) {
        this.a = a;
    }

    double wholeSurfaceArea() {
        return 6 * a * a;
    }

    double volume() {
        return a * a * a;
    }
}

class Cylinder extends ThreeDObject {
    double r, h;

    Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }

    double wholeSurfaceArea() {
        return 2 * Math.PI * r * (r + h);
    }

    double volume() {
        return Math.PI * r * r * h;
    }
}

class Cone extends ThreeDObject {
    double r, h;

    Cone(double r, double h) {
        this.r = r;
        this.h = h;
    }

    double wholeSurfaceArea() {
        double l = Math.sqrt(r*r + h*h);
        return Math.PI * r * (r + l);
    }

    double volume() {
        return (1.0/3) * Math.PI * r * r * h;
    }
}

public class ThreeDTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ThreeDObject obj;

        System.out.println("Enter length, breadth, height of Box:");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        obj = new Box(l, b, h);
        System.out.println("Box Surface Area = " + obj.wholeSurfaceArea());
        System.out.println("Box Volume = " + obj.volume());

        System.out.println("\nEnter side of Cube:");
        double a = sc.nextDouble();
        obj = new Cube(a);
        System.out.println("Cube Surface Area = " + obj.wholeSurfaceArea());
        System.out.println("Cube Volume = " + obj.volume());

        System.out.println("\nEnter radius and height of Cylinder:");
        double r = sc.nextDouble();
        h = sc.nextDouble();
        obj = new Cylinder(r, h);
        System.out.println("Cylinder Surface Area = " + obj.wholeSurfaceArea());
        System.out.println("Cylinder Volume = " + obj.volume());

        System.out.println("\nEnter radius and height of Cone:");
        r = sc.nextDouble();
        h = sc.nextDouble();
        obj = new Cone(r, h);
        System.out.println("Cone Surface Area = " + obj.wholeSurfaceArea());
        System.out.println("Cone Volume = " + obj.volume());

        sc.close();
    }
}