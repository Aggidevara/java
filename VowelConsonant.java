import java.util.Scanner;

public class VowelConsonant {
    public String[] isVowelConsonant(String input) {

        String s1 = input;
        String[] output= new String[s1.length()];
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
                if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U') {
                    output[i]=c + "- vowel";
                } else
                    output[i]=c + "- consonant";
            } else
                return new String[]{"Invalid input"};

        }
        return output;
    }
}