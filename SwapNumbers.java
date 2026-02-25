import java.util.Scanner;

class Swap {
    int a, b;

    Swap(int x, int y) {
        a = x;
        b = y;
    }

    void swap(Swap other) {
        int temp = this.a;
        this.a = other.a;
        other.a = temp;
    }
}

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        Swap obj1 = new Swap(x, y);
        Swap obj2 = new Swap(y, x);

        obj1.swap(obj2);

        System.out.println("After Swapping:");
        System.out.println("Object1 a = " + obj1.a);
        System.out.println("Object2 a = " + obj2.a);
    }
}