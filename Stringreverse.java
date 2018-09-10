import java.util.Scanner;

public class Stringreverse {
    public static void main(String[] args){
        Scanner scr=new Scanner(System.in);
        String s1=scr.next();
        String reverse="";
        for(int i=s1.length()-1;i>=0;i--){
            reverse=reverse+s1.charAt(i);
        }
        System.out.println("Reverse string is "+reverse);
    }
}
