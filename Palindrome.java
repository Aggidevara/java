import java.util.Scanner;

public class Palindrome{
    public String isPalindrome(String input) {

   String s1=input;
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
            return sum + " is a palindrome and even sum is lessthan 25";
             else
                 return sum + " is a palindrome and even sum is morethan 25";
        }
        else
            return n1+" is not a palindrome";
    }
}


