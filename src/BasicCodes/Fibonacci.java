package BasicCodes;

public class Fibonacci {
public void fib(int n){
    int a = 0;
    int b = 1;
    for (int i=0;i<n;i++){
        int c = a + b;
        System.out.println(c);
        a = b;
        b = c;
    }
}

public int fibonacci(int n){
    if(n<2){
        return n;
    }
    else {
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
}

