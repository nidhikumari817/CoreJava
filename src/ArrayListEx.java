import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx {
    public void useArrayList(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Orange");
        list.add("Mango");
        list.add("Banana");
        list.add("Apple");

        List<Integer> list1 = new ArrayList<>();
        list1.add(60);
        list1.add(40);
        list1.add(10);
        list1.add(20);
        list1.add(50);

        //System.out.println(list);              //Printing the array list object


        /*Iterator itr = list.iterator();        //Traversing array list through iterator
        while(itr.hasNext()){
            System.out.println(itr.next());
        }*/

        /*for(String s: list){                   // Traversal Using For each loop
            System.out.println(s);
        }*/

        /*System.out.println(list.get(2));       // Getting Array List element
        list.set(2,"Mango");                     // Setting Array List element
        System.out.println(list);*/

        /*Collections.sort(list);                //Sorting String Array List through Collections
        System.out.println(list);*/

        /*Collections.sort(list1);               //Sorting Integer Array List through Collections
        System.out.println(list1);*/


        /*ArrayList<String> list2 = new ArrayList<>();       //Sorting Integer Array List through Collections
        list2.add(0,"Ravi");
        list2.add(1,"himanshu");
        System.out.println(list2);

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("Sharda");
        list3.add("Riya");
        System.out.println(list3);

        list3.addAll(list2);
        System.out.println(list3);

        ArrayList<String> list4 = new ArrayList<>();
        list4.add(0,"Table");
        list4.add(1,"Chair");
        System.out.println(list4);

        list4.addAll(1,list3);
        System.out.println(list4);

        list4.remove("Riya");
        System.out.println(list4);

        list4.remove(1);
        System.out.println(list4);*/

        /*list4.removeAll();
        System.out.println(list4);*/

        //System.out.println(list4.isEmpty());       //Check list is empty
    }
}
