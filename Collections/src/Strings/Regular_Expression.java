package Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular_Expression {
    public String findharry(String input){
        input=input.toLowerCase();
        if(input.length()<=0)return null;
        Pattern pattern=Pattern.compile("harry");
        Matcher match=pattern.matcher(input);
        boolean value=false;
        String str="";
        while (match.find()){
            value=true;
        }
        if(value)return "Is Harry here ? true";
        return "Is Harry here ? false";
    }
}
