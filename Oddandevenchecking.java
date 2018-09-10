import java.util.Scanner;

public class Oddandevenchecking {
    public static void main(String[] args){
        Scanner scr=new Scanner(System.in);
        int n=scr.nextInt();
        if((n%2==0)&&(n>=20 && n<=30))
        System.out.println("Jerry");
        if((n%2!=0)&&(n>=20 && n<=30))
            System.out.println("Tom");
        else
            System.out.println("number should be between 20 and 30");
    }
}
