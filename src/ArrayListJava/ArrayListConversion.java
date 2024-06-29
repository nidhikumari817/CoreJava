package ArrayListJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListConversion {

    public void arrayListToArray(){

        ArrayList<String> list = new ArrayList<>();

        list.add("Himanshu");
        list.add("Mohan");
        list.add("Rahul");
        list.add("Manoj");
        list.add("Sailesh");

        String[] arr = list.toArray(new String[list.size()]);                //Converting ArrayList to Array

        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public void arrayToArrayList(){

        String[] arr = {"Himanshu","Mohan","Raul","Sailesh","Manoj"};
        List<String> list = new ArrayList<>();

        list = Arrays.asList(arr);                                          //Converting Array to ArrayList
        System.out.println(list);
    }
}
