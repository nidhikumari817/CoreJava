package Array;

public class ArrayMinMax {
    public void byUsingMinComparisons(){
        int[] a = {2,6,9,3,5,8,1};
        int min,max,i;

        if(a.length%2==0)
        {
            if(a[0]>a[1]){
                max=a[0];
                min=a[1];
            }
            else{
                max=a[1];
                min=a[0];
            }
            i=2;
        }
        else{
            min=a[0];
            max=a[0];
            i=1;
        }
        while(i<a.length){
            if(a[i]>a[i+1]){
                if(a[i]>max){
                    max=a[i];
                }
                if(a[i+1]<min){
                    min=a[i+1];
                }
            }
            else{
                if(a[i+1]>max){
                    max=a[i+1];
                }
                if(a[i]<min){
                    min=a[i];
                }
            }
            i+=2;
        }
        System.out.println("min = "+min);
        System.out.println("max = "+max);
    }
}
