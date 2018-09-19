import java.util.Arrays;

public class SeriesOf7digitsareConsecutive {
    int[] numbers;
    SeriesOf7digitsareConsecutive(int[] num){
        numbers=num;
    }
    public String series_is_Consecutive(){
        if(numbers.length==0)
        return null;
        if(numbers.length>0 && numbers.length<7)
            return "non consecutive numbers";
        Arrays.sort(numbers);
        int num=numbers[0];
        int[] duparray=new int[numbers.length];
        for(int i=1;i<numbers.length;i++){
            if(numbers[i]==num) return "non consecutive numbers";
        }
        for(int i=0;i<numbers.length;i++){
            duparray[i]=num+i;
        }
        boolean value=false;
        for(int i=0;i<numbers.length;i++){
            if(duparray[i]==numbers[i]) value=true;
            else value=false;
            if(!value) return "non consecutive numbers";
        }
        return "consecutive numbers";
    }

}
