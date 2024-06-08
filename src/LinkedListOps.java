import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListOps{
    public void linkedListOps(){

        LinkedList <String> list1 = new LinkedList<>();
        list1.add("Himanshu");
        list1.add("Riya");
        list1.add("Archana");
        list1.add(3,"Manoj");                  //Adding elements by providing index
        list1.add("Archana");                                //Duplicate elements are allowed in FirstLinkedlist

        System.out.print(list1);                             //Returns elements of linkedlist in array format
        System.out.println();

        Iterator iter = list1.iterator();
        System.out.print("list1 elements : ");
        while(iter.hasNext())
            System.out.print(iter.next()+" ");               //Returns elements of linkedlist in a list format

        LinkedList <String> list2 = new LinkedList<>();
        list2.addFirst("Chiranshu");                     //Adding element on first index
        list2.addAll(1,list1);                        //Appending list1 to list2 from 2nd index
        list2.addLast("Rahul");                          //Adding element on last index

        Iterator iter2 = list2.listIterator();              //Printing list2 elements
        System.out.println();
        System.out.print("list2 elements : ");
        while(iter2.hasNext())
            System.out.print(iter2.next()+" ");

        Iterator iter3 = list2.descendingIterator();        //Printing list2 elements in reverse order
        System.out.println();
        System.out.print("Reversed list2: ");
        while(iter3.hasNext())
            System.out.print(iter3.next()+" ");

        list2.remove("Riya");                           //Removing element from list2
        list2.removeFirst();                               //Removing first element
        list2.removeLast();                                //Removing last element
        System.out.println();
        System.out.print(list2);                           //Printing list2 elements

        list2.clear();                                     //Clearing all elements from list2
        System.out.println();
        System.out.print(list2);


    }
}
