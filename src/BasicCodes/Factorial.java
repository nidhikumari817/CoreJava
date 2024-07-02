package BasicCodes;

public class Factorial {

    public void findFactorial (int a){
        int result=1;
        for(int i=1; i<=a; i++){
            result = result*i;
        }
        System.out.print(result);
    }

    public int factorialUsingRecursion(int i){
        if(i==0){
            return 1;
        }
        else{
            return i * factorialUsingRecursion(i-1);
        }
    }
}
