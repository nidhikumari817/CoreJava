package MapsJava;

import java.util.Map;
import java.util.HashMap;

public class OccurenceOfChar {

    public void usingMaps(String s){
        Map<Character,Integer> map = new HashMap<>();
        char[] a = s.toCharArray();
        for(char x: a){
            map.put(x, map.getOrDefault(x,0)+1);
        }
        System.out.println(s+":"+map);

    }
}
