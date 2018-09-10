import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args) {
   Scanner scr=new Scanner(System.in);
   String s1=scr.next();
   int n=Integer.parseInt(s1);
   int n1=n,sum=0,evensum=0;
   while(n!=0)
   {

       int r=n%10;
       sum=sum*10+r;
       if(r%2==0){
           evensum=evensum+r;
       }
       n=n/10;

   }
        if(sum==n1){
             if(evensum<=25)
            System.out.println(sum + " is a palindrome and even sum is lessthan 25");
             else
                 System.out.println(sum + " is a palindrome and even sum is morethan 25");
        }
        else
            System.out.println(n1+" is not a palindrome");
    }
}


