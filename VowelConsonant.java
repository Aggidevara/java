import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String s1 = scr.next();
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
                if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U') {
                    System.out.println(c + "- vowel");
                } else
                    System.out.println(c + "- consonant");
            } else
                System.out.println("Invalid input");

        }
    }
}