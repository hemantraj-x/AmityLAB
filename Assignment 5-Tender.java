import java.util.Scanner;

class Tender {
    double cost;
    String company;

    void input(Scanner sc) {
        System.out.print("Enter company name: ");
        company = sc.next();
        System.out.print("Enter cost: ");
        cost = sc.nextDouble();
    }
}

public class Assignment5_Tender {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tender[] t = new Tender[5];

        for (int i = 0; i < 5; i++) {
            t[i] = new Tender();
            t[i].input(sc);
        }

        double min = t[0].cost;
        String company = t[0].company;

        for (int i = 1; i < 5; i++) {
            if (t[i].cost < min) {
                min = t[i].cost;
                company = t[i].company;
            }
        }

        System.out.println("Company with minimum cost: " + company);
    }
}
