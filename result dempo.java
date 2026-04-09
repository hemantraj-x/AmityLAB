import java.util.Scanner;

public class SwapNos {
    int a, b;

    SwapNos() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of a & b:");
        a = in.nextInt();
        b = in.nextInt();
    }

    SwapNos(int x, int y) {
        a = x;
        b = y;

        int temp = a;
        a = b;
        b = temp;
    }

    void dispNos() {
        System.out.println("Modified Value of a = " + a);
        System.out.println("Modified Value of b = " + b);
    }

    public static void main(String[] args) {
        SwapNos obj1 = new SwapNos();          
        SwapNos obj2 = new SwapNos(obj1.a, obj1.b);
        obj2.dispNos();
    }
}
