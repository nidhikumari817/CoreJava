import java.lang.Math;
public class Armstrong {
    int count=0;
    public void strong(int num) {
        if(num==0){
            System.out.println("Count of digits = 1");
        }
        else{
            int a= num;
            int count=0;
            while(a>0){
                a=a/10;
                count++;
            }
            System.out.println("Count of digits = "+count);
        }
        int a=num;
        System.out.println("a is "+a);
        int sum=0;
        while(a>0){
            int r=a%10;
            int b=1;
            for(int i=1;i<=count;i++){
                b=b*r;
            }
            sum=sum+b;
            a=a/10;
        }
        if(sum==num){
            System.out.println(num+" is an Armstrong number");
        }
        else{
            System.out.println(num+" is not an Armstrong number");
        }
    }
}
