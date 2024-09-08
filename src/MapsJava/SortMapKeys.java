package MapsJava;
import java.util.*;

public class SortMapKeys {
    public void sortKeys(){
        Map<String,Integer> map = new HashMap<>();
        map.put("Nidhi",1);
        map.put("Riya",2);
        map.put("Himanshu",3);
        map.put("Mummy",4);

        ArrayList<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list);

        for(String x: list){
            System.out.print(x+" ");
        }
    }
}
