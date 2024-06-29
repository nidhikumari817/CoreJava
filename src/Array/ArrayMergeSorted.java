package Array;

import java.util.Arrays;

public class ArrayMergeSorted {
    public void mergeSortedArrays(){
        int[] a = {20,40,80,60};
        int[] b = {50,10,70,90,30};

        int n = a.length;
        int m = b.length;
        int temp;
        int [] c = new int[n+m];

        int left = n-1;
        int right = 0;

        while(left>=0 && right<m){
            if(a[left]>b[right]){
                temp = a[left];
                a[left] = b[right];
                b[right] = temp;
                left--;
                right++;
            }
            else{
                break;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);

       merge(a,b,n,m,c);
    }

    public void mergeSortedArraysByMethods(){
        int[] a = {1,3,5,7};
        int[] b = {0,2,6,8,9};

        int n1 = a.length;
        int n2 = b.length;
        int c[] = new int[n1+n2];

        merge(a,b,n1,n2,c);
    }
    public void merge(int[] a, int[] b, int n1, int n2, int[] c){
        int i=0;
        int j=0;
        int k=0;

        while(i<n1){
            c[k] = a[i];
            i++;
            k++;
        }
        while(j<n2){
            c[k] = b[j];
            k++;
            j++;
        }
        Arrays.sort(c);
        for(int x: c)
            System.out.print(x+" ");
    }
}
