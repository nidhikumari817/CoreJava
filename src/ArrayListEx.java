import java.util.*;

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

        /*System.out.println(list);                           //Printing the array list object
        ListIterator li1= list.listIterator();                //Printing the array list using ListIterator
        while(li1.hasNext())
            System.out.print(li1.next()+" ");*/

        /*for(String s: list){                                // Traversal Using For each loop
            System.out.println(s);
        }*/

        /*System.out.println(list.get(2));                    // Getting Array List element
        list.set(2,"Mango");                                  // Setting Array List element
        System.out.println(list);*/

        /*Collections.sort(list);                             //Sorting Array List
        System.out.println(list);*/

        /*Collections.sort(list1);                            //Sorting Array List
        System.out.println(list1);*/


        /*ArrayList<String> list2 = new ArrayList<>();
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

        list4.addAll(1,list3);                                 //Merging two array lists
        System.out.println(list4);

        list4.remove("Riya");                                  //Removing elements from Array List
        System.out.println(list4);

        list4.remove(1);                                       //Removing elements from Array List
        System.out.println(list4);*/

        /*list4.removeAll();                                   //Removing all elements from Array List
        System.out.println(list4);*/

        //System.out.println(list4.isEmpty());                 //Check list is empty
    }
}
