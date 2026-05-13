interface Mango {
    void showType();   // abstract method
}

// Class Winter implementing Mango
class Winter implements Mango {
    public void showType() {
        System.out.println("Winter Mango: Available in winter season.");
    }
}

// Class Summer implementing Mango
class Summer implements Mango {
    public void showType() {
        System.out.println("Summer Mango: Available in summer season.");
    }
}

public class Main {
    public static void main(String[] args) {

        Mango m1 = new Winter();
        Mango m2 = new Summer();

        m1.showType();
        m2.showType();
    }
}
