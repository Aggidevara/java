import java.util.Scanner;

public class Palindrome {
    static Scanner scr=new Scanner(System.in);
    public static void main(String[] args){
        String input=scr.next();
       boolean status=isPalindrome(input);
       if(status)
       System.out.println("palindrome");
       else
           System.out.println(" not a palindrome");
    }

    private static boolean isPalindrome(String input) {
        String reverse = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reverse=reverse+input.charAt(i);
        }
        if(input==reverse) return true;
        return false;
    }
}
