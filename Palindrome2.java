import java.util.Scanner;
public class Palindrome2 {
    public static boolean isPalindrome(String input) {
        String str = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            str = str + input.charAt(i);
        }
        if (str.equals(input)) {
            return true;
        }
        return false;
    }
}
/*public static void main(String[] args){
        Scanner scr=new Scanner(System.in);
         String input=scr.next();
         boolean value=isPalindrome(input);
         if(value)System.out.println("given input is - true");
         else System.out.println("given input is - false");

    }
   */

