import java.util.Scanner;

public class Nthiteration {
public static void main(String[] args) {
    Scanner scr=new Scanner(System.in);
    int num=scr.nextInt();
     for(int i=1;i<=num;i++){
         for(int j=1;j<=i;j++){
             System.out.print(i+" ");
         }
     }
    }
}
