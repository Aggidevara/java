package Strings;

import java.util.Arrays;

public class Sort_Arrayofstring {
    public String[] sort(String input){
        if(input.length()<=0)return null;
        String[] sortedlis=input.split(" ");
        Arrays.sort(sortedlis);
        return sortedlis;
    }
}
