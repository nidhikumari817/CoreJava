package BasicCodes;

public class QuickSort {
    public int partition(int[] a, int low, int high){
        int pivot = a[high];
        int i = low-1;

        for(int j=low; j<high; j++){
            if(a[j]<pivot){
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int temp = a[i+1];
        a[i+1] = a[high];
        a[high] = temp;

        return i+1;
    }

    public void quick_sort(int[] a, int low, int high){
        if(low<high){
            int pi = partition(a, low, high);

            quick_sort(a, low, pi-1);
            quick_sort(a, pi+1, high);
        }
    }
}
