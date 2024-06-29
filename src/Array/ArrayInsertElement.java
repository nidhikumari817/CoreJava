package Array;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class ArrayInsertElement {

    public void insertElementInNewArray(Scanner s){
        System.out.println("Enter size of the array = ");
        int size = s.nextInt();                                                                //Taking input of size of Array
        int arr[]= new int[size];
        int[] brr = new int[size+1];

        System.out.println("Enter elements in the array = ");                                 //Taking input of elements in Array
        for(int i=0; i<size; i++){
            arr[i]=s.nextInt();
        }

        System.out.println("Please provide the item you want to insert = ");                 //Taking input of item you want to insert in Array
        int item = s.nextInt();

        System.out.println("Please provide the position you want to insert the item = ");    //Taking input of the position where you want to insert the item in Array
        int pos = s.nextInt();

        for(int i=0;i<size+1;i++){
            if(i<pos-1){
                brr[i]=arr[i];
            }
            else if(i==pos-1){
                brr[i]=item;
            }
            else {
                brr[i]=arr[i-1];
            }
        }
        for(int i= 0; i<size+1; i++){
            System.out.println(brr[i]);
        }
    }

    public void usingArrayList(Scanner s){
        ArrayList<Integer> list = new ArrayList<Integer>(5);
        list.add(10);                                        //Adding elements in Arraylist
        list.add(20);
        list.add(40);

        System.out.println("Initial Array.ArrayMinElement list = ");         //Printing elements of initial Arraylist
        ListIterator iter = list.listIterator();
        for(int i: list){
            if(iter.hasNext())
                System.out.println(iter.next());
        }

        list.add(2,30);                        //Adding 30 at index 2 in the Arraylist

        System.out.println("Final Array.ArrayMinElement list = ");          //Printing elements after adding 30 at index 2 in  Arraylist
        ListIterator iter2 = list.listIterator();
        for(int i: list){
            if(iter2.hasNext())
                System.out.println(iter2.next());
        }
    }
}
