public class LeftRotateAnArray {

    public void rotationByDPlaces(int a[], int d, int n){                  //Brute Force
        int[] temp = {1,2,3};
        for(int i=d; i<n; i++){
            a[i-d]=a[i];
        }
        for(int i=n-d,j=0;i<n;i++){
            a[i]=temp[j];
            j++;
        }
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]);
        }
    }

    public void rotateArrayByReverse(int arr[], int d, int n){            //Optimised Solution
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
