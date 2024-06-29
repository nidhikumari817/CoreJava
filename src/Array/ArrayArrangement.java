package Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayArrangement {

    //Ascending order
    public void Ascending(Scanner s){
        int arr1[] = new int[5];
        int temp;

        System.out.println("Enter Array.ArrayMinElement elements = ");
        for(int i=0; i<arr1.length; i++){
            arr1[i] = s.nextInt();
        }

        Arrays.sort(arr1);

        System.out.println("Array.ArrayMinElement elements in ascending order ....");
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
    }

    //Descending order
    public void descending(Scanner s){
        int temp;
        Integer arr2[]= new Integer[5];

        System.out.println("Enter array elements = ");
        for(int i=0; i<arr2.length; i++){
            arr2[i]= s.nextInt();
        }

        Arrays.sort(arr2, Collections.reverseOrder());

        System.out.println("Array.ArrayMinElement elements in descending order ....");
        for(int i=0; i<arr2.length; i++){
            System.out.println(arr2[i]);
        }
    }

    //Array.ArrayMinElement.Equals method
    public void equal(Scanner s){
        int a[]= new int[5];
        int b[]= new int[5];

        System.out.println("Enter Elements of First Array = ");
        for(int i=0; i<a.length; i++){
            a[i] = s.nextInt();
        }
        System.out.println("Enter Elements of Second Array = ");
        for(int i=0; i<b.length; i++){
            b[i] = s.nextInt();
        }
        boolean c =Arrays.equals(a,b);
        if(c){
            System.out.println("Both arrays are equal ");
        }
        else{
            System.out.println("Both arrays are not equal ");
        }
    }

    //copyOf() method
    public void copyArray(Scanner s){
        int c[]= new int[5];

        System.out.println("Enter Elements of First Array= ");
        for(int i=0; i<c.length; i++){
            c[i] = s.nextInt();
        }
        int[] d = Arrays.copyOf(c,5);
        System.out.println("Printing Elements of Second Array = ");
        for(int i=0; i<d.length; i++){
            System.out.println(d[i]);
        }
    }
}

