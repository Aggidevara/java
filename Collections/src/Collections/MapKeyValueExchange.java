package Collections;

import java.util.*;

public class MapKeyValueExchange {
    public Map<String,String> exchange(Map<String,String> input){

                input.replace("val2",input.get("val1"));
                input.replace("val1"," ");


        return input;
    }
}
