import java.util.Scanner;

abstract class AbstractProduct {
    int product_id;

    AbstractProduct(int product_id) {
        this.product_id = product_id;
    }

    abstract void display();
}

class TravelGuide extends AbstractProduct {
    String bookName;

    TravelGuide(int product_id, String bookName) {
        super(product_id);
        this.bookName = bookName;
    }

    void display() {
        System.out.println("Travel Guide ID: " + product_id);
        System.out.println("Book Name: " + bookName);
    }
}

class CD extends AbstractProduct {
    String cdName;

    CD(int product_id, String cdName) {
        super(product_id);
        this.cdName = cdName;
    }

    void display() {
        System.out.println("CD ID: " + product_id);
        System.out.println("CD Name: " + cdName);
    }
}

public class ProductTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Travel Guide ID: ");
        int id1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Book Name: ");
        String book = sc.nextLine();

        TravelGuide t = new TravelGuide(id1, book);

        System.out.print("Enter CD ID: ");
        int id2 = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter CD Name: ");
        String cd = sc.nextLine();

        CD c = new CD(id2, cd);

        System.out.println("\n--- Product Details ---");
        t.display();
        c.display();

        sc.close();
    }
}
