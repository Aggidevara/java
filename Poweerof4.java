import java.util.Scanner;

public class Poweerof4 {
    public boolean isPowerofNumber(int input) {
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