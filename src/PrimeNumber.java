public class PrimeNumber {
    public void prime(int a){
        int count = 0;
        for(int i=1;i<=a;i++)
        {
            int res = a % i;
            if (res == 0){
                count++;
            }
        }
        if (count ==2 ){
            System.out.println(a + " is a Prime number");
        }
        else {
            System.out.println(a + " is not a prime number");
        }
    }

    public void prime (int start, int end){

        for (int i = start; i<=end; i++){
            int count=0;
            for(int j=1;j<=i;j++){
                int res = i % j;
                if (res == 0){
                    count++;
                }
            }
            if (count == 2){
                System.out.println(i+" is a prime number");
            }
            else{
                System.out.println(i+" is not a prime number");
            }
        }
    }
}
