package Collections;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class ArrayOfStringsAsInput {

    public Map<String, Boolean> count(String[] input) {
      //  if (input.length() <= 0) return null;
       // input = input.toLowerCase();
        int count = 0;
        Map<String, Boolean> list = new TreeMap<>();

        System.out.println(Arrays.toString(input));
        for (int i = 0; i < input.length - 1; i++) {
            String in = input[i];
            count = 0;
            for (int j = 0; j < input.length; j++) {
                if (in.equals(input[j])) {
                    count++;
                }
            }
            if(in.length()>=1){
                if(count>=2)
                list.put(input[i], true);
                else
                    list.put(input[i],false);
            }
        }
        return list;

    }

}
