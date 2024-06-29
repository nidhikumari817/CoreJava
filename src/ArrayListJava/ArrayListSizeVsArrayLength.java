package ArrayListJava;

import java.util.ArrayList;

public class ArrayListSizeVsArrayLength {

    public void calculatingArrayLength(){
        int[] arr = new int[10];

        System.out.println("Array.ArrayMinElement Lenght = " + arr.length);
    }

    public void calculatingArrayListSize(){
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("ArrayList Size = " + list.size());
    }
}
