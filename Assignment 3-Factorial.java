class Factorial {
    int num = 5;   // constant value

    int calculateFactorial() {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Factorial obj = new Factorial();
        int result = obj.calculateFactorial();
        System.out.println("Factorial = " + result);
    }
}