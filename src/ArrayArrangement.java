import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayArrangement {
    int arr1[] = new int[5];
    public void Ascending(Scanner s){

        int temp;

        System.out.println("Enter Array elements = ");
        for(int i=0; i<arr1.length; i++){
            arr1[i] = s.nextInt();
        }

        Arrays.sort(arr1);

        System.out.println("Array elements in ascending order ....");
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
    }

    public void descending(Scanner s){
        int temp;
        Integer arr2[]= new Integer[5];

        System.out.println("Enter array elements = ");
        for(int i=0; i<arr2.length; i++){
            arr2[i]= s.nextInt();
        }

        Arrays.sort(arr2, Collections.reverseOrder());

        System.out.println("Array elements in descending order ....");
        for(int i=0; i<arr2.length; i++){
            System.out.println(arr2[i]);
        }
    }
}

