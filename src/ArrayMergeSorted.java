import java.util.Arrays;

public class ArrayMergeSorted {
    public void mergeSortedArrays(){
        int[] a = {1,3,5,7};
        int[] b = {0,2,6,8,9};

        int n = a.length;
        int m = b.length;
        int temp;

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

        for(int i: a)
            System.out.print(i);
        System.out.print("\n");
        for(int i: b)
            System.out.print(i);
    }
}
