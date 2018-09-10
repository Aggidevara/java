import java.util.Arrays;
import java.util.Scanner;

public class NonIncreasingorder {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String s1 = scr.next();
        int num=Integer.parseInt(s1);

        int evensum=0;
        String sum="";
        char[] n =s1.toCharArray();
        Arrays.sort(n);
        while(num!=0)
        {
            int r=num%10;
            if(r%2==0){
                evensum=evensum+r;
            }
             num=num/10;
        }
        for(int i=s1.length()-1;i>=0;i--){
            sum=sum+n[i];
        }
        System.out.println("Non-Increasing number"+sum);

        System.out.println("Sum Of even numbers - "+evensum);
        if(evensum<=15)
            System.out.println("false");
        else
            System.out.println("True");




    }
}
