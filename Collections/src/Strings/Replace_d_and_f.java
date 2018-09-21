package Strings;

public class Replace_d_and_f {
    public String replace(String input){
        if(input.length()<=0)return null;
        String str="";
        str=input.replace('d'+"",'f'+"").replace('l'+"",'t'+"");
        return str;
    }
}
