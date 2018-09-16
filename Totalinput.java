import java.util.Scanner;

public class Totalinput {
    public int totalInput(int[] input){
        int[] s1=input;
        int sum=0;
        for(int i=0;i<s1.length;i++){
            sum=sum+s1[i];
        }
        return sum;
    }
}
