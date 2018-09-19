import java.util.Scanner;

public class Main_class_Exception {
    public static void main(String[] args){
        Scanner scr=new Scanner(System.in);
        try {
            int num = scr.nextInt();
            if (num >= 0 && num <= 100) System.out.println(num);
            else
                throw new Exception("number should be in between 0 to 100");
        }
        catch (Exception e) {
            System.out.println(e);
        }
        finally{
            System.out.println("I reached end of the statement");
        }
    }
}
class Exception extends java.lang.Exception {
    Exception(String msg){
        super(msg);
    }
}