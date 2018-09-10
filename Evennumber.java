import java.util.Scanner;
class EvenNumTest{
 static int number;
 EvenNumTest(){
 }
 public static boolean isEven(int n){
     number=n;
     if(number%2==0)return true;
     return false;
 }
}
public class Evennumber {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int num=scr.nextInt();
        EvenNumTest obj= new EvenNumTest();
        boolean val=obj.isEven(num);
        if(val)System.out.println(num+" - is even ");
        else System.out.println(num+" - is not even ");
    }
}
