import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayDeleteElement {

    public void DeleteElement(Scanner s){

        int[] arr = new int[3];

        System.out.println("Insert elements in the array: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = s.nextInt();
        }

        ArrayList<Integer> list = new ArrayList<>();

        for(int i: arr)
            list.add(i);

        System.out.println("Enter the index on which you want to remove the element = ");
        int element = s.nextInt();

        list.remove(element);

        System.out.println("Printing modified Array = ");
        System.out.println(list);
    }
}
