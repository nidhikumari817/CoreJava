package Array;

import java.util.Scanner;

public class ArrayReverse {

    public void usingTwoPointers(Scanner s){
        int[] arr = new int[5];
        int start= 0;
        int end = arr.length-1;
        int temp;

        System.out.println("Enter array elements = ");
        for(int i=0; i<arr.length; i++){
            arr[i] = s.nextInt();
        }

        while(start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

        for(int i: arr){
            System.out.println(i);
        }
    }

    public void usingTwoArray(Scanner s){
        int[] arr1= new int[5];
        int[] arr2= new int[5];

        System.out.println("Enter array elements = ");
        for(int i=0; i<arr1.length; i++){
            arr1[i] = s.nextInt();
        }

        for(int i=0; i<arr1.length; i++){
            arr2[i] = arr1[arr1.length-i-1];
        }

        for(int i: arr2){
            System.out.println(i);
        }
    }
}
