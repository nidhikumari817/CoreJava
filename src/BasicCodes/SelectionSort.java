package BasicCodes;

public class SelectionSort {

    public void selection_sort(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            int mini = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[mini]) {
                    mini = j;
                }
            }
            //swap
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
        print(arr, n);
    }

    public void print(int[] a, int n){
        System.out.print("After applying selection sort: ");
        for(int i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }
    }
}
