package MapPractice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Student {
    public static void main(String[] args)
    {
        Map<Integer, String> map = new HashMap<>();
        map.put( 1, " Alex ");
        map.put( 2, " John ");
        map.put( 3, " Vincent ");
        map.put( 4, " Mataac ");
        map.put( 5, " Training ");

//        System.out.println(map);
        System.out.println(map.get(1));
    }

}