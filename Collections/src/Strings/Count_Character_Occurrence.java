package Strings;

public class Count_Character_Occurrence {
    public int count_character(String input,char count){
        if(input.length()<=0)return 0;
        return input.length()-input.replace(input,count+"").length();

    }
}