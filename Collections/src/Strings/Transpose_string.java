package Strings;

public class Transpose_string {
    public String transpose(String input){
        if(input.length()<=0)return null;
        String[] str=input.split(" ");
        String reverse="";
        for(int i=0;i<str.length;i++){
            String str1=str[i];
            StringBuffer sbr=new StringBuffer(str1);
            str[i]= String.valueOf(sbr.reverse());
            reverse=reverse+str[i]+" ";
        }
        return reverse.trim();
    }
}
