public class Assignment5_ReverseString {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Provide string as command line argument");
            return;
        }

        String input = String.join(" ", args);
        String[] words = input.split(" ");

        System.out.print("Reversed: ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}
