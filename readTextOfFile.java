import java.util.Scanner;

public class readTextOfFile {
    public static void main(String[] args){
        Scanner scr=new Scanner(System.in);
        String inputtext=scr.nextLine();
        System.out.println("Before Converting "+inputtext);
        inputtext=inputtext.toUpperCase();
        System.out.println(" After Converting "+inputtext);
    }
}
