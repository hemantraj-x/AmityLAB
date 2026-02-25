import java.util.Scanner;

class NumberCheck {
    int num;

    NumberCheck(int n) {
        num = n;
    }

    void check() {
        if (num >= 0)
            System.out.println("Number is Positive");
        else
            System.out.println("Number is Negative");
    }
}

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        NumberCheck obj = new NumberCheck(n);
        obj.check();
    }
}