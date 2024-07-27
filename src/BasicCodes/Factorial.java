package BasicCodes;

public class Factorial {

    public void findFactorial (int a){
        int result=1;
        for(int i=1; i<=a; i++){
            result = result*i;
        }
        System.out.print(result);
    }

    public int factorialUsingRecursion(int n){
        if(n==0){
            return 1;
        }
        else{
            return n * factorialUsingRecursion(n-1);
        }
    }
}
