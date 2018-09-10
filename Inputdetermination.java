import java.util.Scanner;

public class Inputdetermination {
    public static void main(String[] args){
        Scanner scr=new Scanner(System.in);
        String s1=scr.next();
        char c=s1.charAt(0);
        if(c>=65 && c<=90)System.out.println(c+" - capital letter");
        else if(c>=97 && c<=122)System.out.println(c+" - small letter");
        else if(c>=48 && c<=57)System.out.println(c+" - Digit");
        else System.out.println(c+" - special symbol");
    }
}
