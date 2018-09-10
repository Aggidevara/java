import java.util.Arrays;
import java.util.Scanner;

public class NumberandGrade {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int numofstu = scr.nextInt();
        int avg=0,sum=0;
        int[] grades = new int[numofstu];
        if (numofstu >= 0 && numofstu <= 100) {
            for (int i = 0; i <numofstu; i++) {
                System.out.println("grade of student - "+(i+1));
                grades[i] = scr.nextInt();
                sum=sum+grades[i];
            }
            avg=sum/numofstu;
            Arrays.sort(grades);

            System.out.println("Avg of stude - "+avg);
            System.out.println("Min grade of students - "+grades[0]);
            System.out.println("max grade of students - "+grades[numofstu-1]);
        }
        else System.out.println("Number should be in between 0-100");

    }


}