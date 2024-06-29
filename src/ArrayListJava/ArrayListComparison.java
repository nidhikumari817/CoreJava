package ArrayListJava;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListComparison {

    public void usingEqualsMethod(){
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        list1.add("Himanshu");
        list1.add("Mohan");
        list1.add("Rahul");
        list1.add("Manoj");
        list1.add("Sailesh");

        list2.add("Himanshu");
        list2.add("Mohan");
        list2.add("Rahul");
        list2.add("Kumud");
        list2.add("Sailesh");

        boolean val = list1.equals(list2);
        System.out.println(val);
    }

    public void usingRemoveAllMethod(){                     //Finding the missing element
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        list1.add("Himanshu");
        list1.add("Mohan");
        list1.add("Rahul");
        list1.add("Manoj");
        list1.add("Sailesh");

        list2.add("Himanshu");
        list2.add("Mohan");
        list2.add("Rahul");
        list2.add("Kumud");
        list2.add("Sailesh");

        //list2.removeAll(list1);                           //Finding missing element in List2 compared to List1
        //System.out.println("List2 items : "+list2);

        list1.removeAll(list2);                             //Finding missing element in List1 compared to List2
        System.out.println("List1 items : "+list1);
    }

    public void usingRetainAllMethod(){                    //Finding the common elements in both lists
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        list1.add("Himanshu");
        list1.add("Mohan");
        list1.add("Manoj");
        list1.add("Rahul");
        list1.add("Sailesh");

        list2.add("Himanshu");
        list2.add("Mohan");
        list2.add("Rahul");
        list2.add("Kumud");
        list2.add("Sailesh");

        list1.retainAll(list2);                         //Finding the common elements in both lists
        System.out.println(list1);
    }

    public void usingContainsMethod(){
        ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("Good","Night","Friends"));
        ArrayList<String> list2 = new ArrayList<String>(Arrays.asList("Good","Morning","Friends"));
        ArrayList<String> list3 = new ArrayList<>();

        for(String item: list1){
            list3.add(list2.contains(item)? "Yes":"No");
        }
        System.out.println(list3);
    }
}
