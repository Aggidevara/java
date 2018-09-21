package Collections;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Number_of_counts_Map {

    public Map<String, Integer> count(String input) {
        if (input.length() <= 0) return null;
        input = input.toLowerCase();
        int count = 0;
        Map<String, Integer> list = new TreeMap<>();
        String[] split = input.split("[^a-zA-Z]");
       System.out.println(Arrays.toString(split));
        for (int i = 0; i < split.length - 1; i++) {
            String in = split[i];
            count = 0;
                for (int j = 0; j < split.length; j++) {
                    if (in.equals(split[j])) {
                        count++;
                    }
                }
                if(in.length()>=1){
                    list.put(split[i], count);
                }
        }
        return list;

    }
}
