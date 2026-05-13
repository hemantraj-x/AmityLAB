import java.util.Scanner;

class Item {
    int code;
    double price;

    void input(Scanner sc) {
        System.out.print("Enter code: ");
        code = sc.nextInt();
        System.out.print("Enter price: ");
        price = sc.nextDouble();
    }

    void display() {
        System.out.println(code + "\t" + price);
    }
}

public class Assignment5_Item {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Item[] items = new Item[5];
        double total = 0;

        for (int i = 0; i < 5; i++) {
            items[i] = new Item();
            items[i].input(sc);
            total += items[i].price;
        }

        System.out.println("\nCode\tPrice");
        for (Item item : items) {
            item.display();
        }

        System.out.println("Total Price = " + total);
    }
}
