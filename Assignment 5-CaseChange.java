import java.util.Scanner;

public class Assignment5_CaseChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();

        String result = "";

        for (char ch : str.toCharArray()) {
            if (Character.isLowerCase(ch))
                result += Character.toUpperCase(ch);
            else if (Character.isUpperCase(ch))
                result += Character.toLowerCase(ch);
            else
                result += ch;
        }

        System.out.println("Modified string: " + result);
    }
}
