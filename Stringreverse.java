import java.util.Scanner;

public class Stringreverse {
    public String reversedString(String input){
        String s1=input;
        String reverse="";
        for(int i=s1.length()-1;i>=0;i--){
            reverse=reverse+s1.charAt(i);
        }
        return "Reversed String is "+reverse;
    }
}
