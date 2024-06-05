import java.util.ArrayList;

public class ArrayArrangeonSigns {
    public void optimalSolution(){                    //1st variety where positives = negatives
        int[] a= {3,1,-2,-5,2,-4};
        int[] b= new int[6];

        int pos=0;
        int neg=1;

        for(int i=0;i<a.length;i++){
            if(a[i]>0){
                b[pos]=a[i];
                pos+=2;
            }
            else{
                b[neg]=a[i];
                neg+=2;
            }
        }
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
    }

    public void secondVariety(){                  //2nd variety where postives != negatives

    }
}
