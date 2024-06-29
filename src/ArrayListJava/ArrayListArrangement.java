package ArrayListJava;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListArrangement {

    public void AscendingOrder(){
        ArrayList <String> list = new ArrayList<>();
        list.add("Mohan");
        list.add("Sohan");
        list.add("Raju");
        list.add("Rahul");

        Collections.sort(list);

        System.out.println(list);
    }

    public void DescendingOrder(){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(30);
        list.add(50);
        list.add(40);
        list.add(20);

        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}
