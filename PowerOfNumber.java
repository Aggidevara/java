import java.util.Scanner;

public class PowerOfNumber {
    static Scanner scr = new Scanner(System.in);

    public static void main(String[] args) {
        int input = scr.nextInt();
        boolean status = isPowerofNumber(input);
        if (status)
            System.out.println("power of a number 4");
        else
            System.out.println(" not a power of number 4");

    }

    private static boolean isPowerofNumber(int input) {
        int i = 0;
        if (input == 0) return false;
        while(input!=1)
        {
            if(input%4!=0) return false;
            input=input/4;
        }
        return true;
    }
}