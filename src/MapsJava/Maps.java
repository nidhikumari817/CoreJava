package MapsJava;

import java.util.*;

public class Maps {

    public void usingMaps(){
        int[] arr = {10,20,30,40};
        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(1,"Nidhi");
        map.put(2,"Himanshu");
        map.put(3,"Riya");
        map.put(4,"Chiranshu");

        System.out.println(map.keySet());                         //Prints all the keys

        System.out.println(map.entrySet());                       //Prints all the key, value pair

        System.out.println(map.get(4));                           //Prints the value present at key 4

        map.put(1,"Archana");                                     //Replacing the value at key 1
        System.out.println(map.entrySet());

        map.clear();                                              //Removing all the elements in the Map
        System.out.println(map.entrySet());

        boolean val = map.isEmpty();                              //Checks the map is empty or not
        System.out.println(val);

        map.put(3,"Archana");
        map.put(4,"Darshana");
        map.put(2,"Duryodhana");
        System.out.println(map.containsKey(3));                   //Checks if there is any value present at key 3
        System.out.println(map.containsKey(5));                   //Checks if there is any value present at key 5

        System.out.println(map.values());                         //Prints all the values present in the map

        System.out.println("Size = "+map.size());                 //Prints the size of the map

        map.getOrDefault(3, "Active");           //Prints the value present on key=3, or returns default value

        for(Map.Entry<Integer, String> m : map.entrySet()){                            //Iterating over Map elements
            System.out.println("Key: "+ m.getKey()+" , "+"Values: "+m.getValue());
        }
    }
}
