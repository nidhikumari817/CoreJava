package Array;

import java.util.Arrays;

public class ArraySecondLargestandSmallestElement {

    public int printSecondLargest(int a[]){
        int largest =a[0];
        int slargest = -1;
        for(int i=1; i<a.length; i++){
            if(a[i]>largest){
                slargest = largest;
                largest = a[i];
            } else if (a[i]<largest && a[i]>slargest) {
                slargest = a[i];
            }
        }
        return slargest;
    }

    public int printSecondSmallest(int a[]){
        int smallest = a[0];
        int ssmallest = Integer.MAX_VALUE;

        for(int i=1; i<a.length; i++){
            if(a[i]<smallest){
                ssmallest = smallest;
                smallest = a[i];
            } else if (a[i]!=smallest && a[i]<ssmallest) {
                ssmallest = a[i];
            }
        }
        return ssmallest;
    }
}
