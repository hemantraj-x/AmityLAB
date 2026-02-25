import java.util.Scanner;

class MaxThree {
    int a, b, c;

    MaxThree(int x, int y, int z) {
        a = x;
        b = y;
        c = z;
    }

    void findMax() {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        System.out.println("Maximum = " + max);
    }
}

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        MaxThree obj = new MaxThree(a, b, c);
        obj.findMax();
    }
}