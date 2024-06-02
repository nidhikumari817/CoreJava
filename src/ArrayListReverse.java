import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class ArrayListReverse {

    public void usingCollection(){

        ArrayList<String> list = new ArrayList<>();

        list.add("Himanshu");
        list.add("Mohan");
        list.add("Rahul");
        list.add("Manoj");
        list.add("Sailesh");

        Collections.reverse(list);

        ListIterator iter = list.listIterator();
        while(iter.hasNext())
            System.out.println(iter.next());
    }
}
