package Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Multiple_Occurrence {
    public String findOccurrence(String input,String regex){
     if(input.length()<=0)return null;
     input=input.toLowerCase();
        Pattern pattern=Pattern.compile(regex);
        Matcher match=pattern.matcher(input);
        String str="Found at:";
        while(match.find()){
            str=str+match.start()+"-"+match.end()+" ";
        }
        return str.trim();
    }
}
