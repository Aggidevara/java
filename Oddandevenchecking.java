import java.util.Scanner;

public class Oddandevenchecking {
    public String oddeven(int num){
        int n=num;
        if((n%2==0)&&(n>=20 && n<=30))
       return "Jerry";
        if((n%2!=0)&&(n>=20 && n<=30))
         return "Tom";
        else
          return "number should be between 20 and 30";
    }
}
