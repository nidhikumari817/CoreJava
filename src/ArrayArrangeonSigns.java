import java.util.ArrayList;

public class ArrayArrangeonSigns {

    public void firstVariety(){                          //postives != negatives
        int[] a= {1,-2,-4,-5,3,6,7,8,-3,-7,-8,-9};
        int[] b= new int[a.length];

        int n= a.length;

        int pos=0;
        int neg=1;

        int i=0;

        while(pos<n && neg<n){
            if(a[i]>0){
                b[pos]=a[i];
                pos+=2;
                i++;
            }
            else{
                b[neg]=a[i];
                neg+=2;
                i++;
            }
        }
        while(pos<n){
            b[pos]=a[i];
            pos+=2;
            i++;
        }
        while(neg<n){
            b[neg]=a[i];
            neg+=2;
            i++;
        }
        for(int j=0;j<b.length;j++){
            System.out.print(b[j]+" ");
        }
    }

    public void secondApproach(){
        int[] a= {1,-2,-4,-5,3,6,7,8,-3,-7,-8,-9};

        int n= a.length;
        int start=0;
        int end = a.length-1;

        while(start<end){
            if(a[start]<0){
                start++;
            } else if (a[end]>0) {
                end--;
            }
            else{
                int temp = a[start];
                a[start]=a[end];
                a[end]=temp;
                start++;
                end--;
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
