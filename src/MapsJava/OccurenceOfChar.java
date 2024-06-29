package MapsJava;

import java.util.Map;
import java.util.HashMap;

public class OccurenceOfChar {                                      //Brute Force
    int count=0;
    public void usingBruteForce(String s, char c){
        int len= s.length();
        for(int i=0; i<len;i++){
            if(s.charAt(i)==c){
                count++;
            }
        }
        System.out.println("Occurence of "+c+" = "+count);
    }

    public void usingMaps(String s){                              //Optimised Approach
        Map<Character,Integer> map = new HashMap<>();
        char[] a = s.toCharArray();
        for(char x: a){
            map.put(x, map.getOrDefault(x,0)+1);
        }
        System.out.println(s+":"+map);

    }
}
