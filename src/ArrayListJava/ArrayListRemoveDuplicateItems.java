package ArrayListJava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrayListRemoveDuplicateItems {

    public void removingDuplicateItems(){

        ArrayList<String> list = new ArrayList<String>();

        list.add("Himanshu");
        list.add("Mohan");
        list.add("Manoj");
        list.add("Manoj");
        list.add("Sailesh");

        System.out.println(list.toString());
        Set<String> s = new HashSet<String>(list);
        System.out.println(s);
    }
}
