import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListReadOnly {

    public void usingCollections()
    {
        ArrayList<String> list = new ArrayList<>();

        list.add("Himanshu");
        list.add("Mohan");
        list.add("Rahul");
        list.add("Manoj");
        list.add("Sailesh");

        List<String> list2 = Collections.unmodifiableList(list);
        list2.add("Nidhi");                                             //Should throw exception
        System.out.println(list2);
    }
}
