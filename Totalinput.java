import java.util.Scanner;

public class Totalinput {
    public static void main(String[] args){
        Scanner scr=new Scanner(System.in);
        String s1=scr.nextLine();
        int sum=0;
        String s2[]=  s1.split(" ",0);
        for(int i=0;i<s2.length;i++){
            int n=Integer.parseInt(s2[i]);
            sum=sum+n;
        }
        System.out.println(sum);
    }
}
