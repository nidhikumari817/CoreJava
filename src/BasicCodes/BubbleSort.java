package BasicCodes;

public class BubbleSort {
    public void bubble_sort(int[] arr, int n){
        for(int i=n-1; i>=0; i--){
            for(int j=0; j<=i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        print(arr);
    }

    public void print(int[] arr){
        System.out.print("After applying Bubble Sort = ");
        for(int i=0;i< arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
