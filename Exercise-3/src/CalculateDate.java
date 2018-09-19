import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalculateDate {


    public String calculate_day(){
        Calendar cal=Calendar.getInstance();
        SimpleDateFormat date=new SimpleDateFormat("EEE dd/MM/yyyy");
        cal.set(Calendar.DAY_OF_WEEK,Calendar.MONDAY);
        date.format(cal.getTime());
        String str="";
        str=str+date.format(cal.getTime())+"\n";
        for(int i=0;i<6;i++) {
            cal.add(Calendar.DATE, 1);
        }
        str=str+date.format(cal.getTime());
        System.out.println(str);
        return str.trim();
        }
}


