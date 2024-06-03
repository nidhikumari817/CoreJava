import java.util.Arrays;

public class ArrayMissingNumber {

    public void usingSum(){
        int[] arr = {1,2,3,5};
        int sum1 = 0;
        int sum2= 0;
        int n = 5;
        ;
        for(int i=0;i<arr.length;i++){
            sum1 = sum1 + arr[i];
        }
        System.out.println("Sum of all the elements = "+sum1);

        sum2 = (n*(n+1))/2;

        int num = sum2-sum1;
        System.out.println("Missing Number = "+num);
    }
    public void usingXOR(){
        int[] arr= {1,3,2,5};
        int allXOR=0;
        int n=5;

        for(int i=1; i<=n; i++){
            allXOR = allXOR ^ i;
        }
        for(int item : arr){
            allXOR = allXOR ^ item;
        }
        System.out.println(allXOR);
    }

    public void twoMissingElement(){
        int[] arr = {1,2,2,3,3,3,5,6,6,6,6,8,8};
        int n=8;
        int brr[] = new int[n+1];

        for(int item: arr)
            brr[item]=1;
        System.out.println("Missing numbers are = ");
        for(int i=1;i<brr.length;i++){
            if(brr[i]==0){
                System.out.println(i);
            }
        }
    }
}
