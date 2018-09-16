import java.util.Scanner;

public class Nthiteration {
        public String iteration(int n){
            int num=n;
            String n1="";
            for(int i=1;i<=num;i++){
                for(int j=1;j<=i;j++){
                    n1=n1+i+" ";
                }
            }
            return n1.trim();
        }
    }

