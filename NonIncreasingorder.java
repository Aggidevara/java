import java.util.Arrays;
import java.util.Scanner;

public class NonIncreasingorder {
public String noIncreasingOrder(String input){
        String s1 = input;
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

        if(evensum<=15)
            return "sum of even  umbers is less than 15 and Non Increasing number is "+sum;
        else
            return "sum of even  umbers is greater than 15 and Non Increasing number is"+sum;




    }
}
