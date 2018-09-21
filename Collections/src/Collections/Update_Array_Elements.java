package Collections;

import java.util.ArrayList;
import java.util.List;

public class Update_Array_Elements {
    ArrayList<String> input;
    public Update_Array_Elements(ArrayList<String> input) {
        this.input=input;
    }

    public List update_elements(int firstpos, String firstele, int secondpos, String secondele) {
        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<input.size();i++) {
            if(i==firstpos)
                list.add(firstele);
            else if(i==secondpos)list.add(secondele);
            else list.add(input.get(i));
            System.out.println(list.get(i));
        }
        return list;
    }
}
