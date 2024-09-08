package Array;

public class LeftRotateAnArray {
    public void rotateArrayByReverse(int arr[], int d, int n){
        d=d%n;
        rotationByReverse(arr, 0, d-1);
        rotationByReverse(arr, d, n-1);
        rotationByReverse(arr, 0, n-1);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }
    public void rotationByReverse(int arr[], int start, int end){
        int temp;
        while (start<end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;
        }
    }

}
