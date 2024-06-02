public class ArrayMinMax {
    public void byUsineMinComparisons(){
        int[] a = {2,6,9,3,5,8,1};
        int min,max,i;

        if(a.length%2==0)
        {
            if(a[0]>a[1]){
                max=a[0];
                min=a[1];
                System.out.println("hey"+min);
                System.out.println("hey"+max);
            }
            else{
                max=a[1];
                min=a[0];
                System.out.println("hi"+min);
                System.out.println("hi"+max);
            }
            i=2;
            System.out.println(i);
        }
        else{
            min=a[0];
            max=a[0];
            System.out.println("helo"+min);
            System.out.println("helo"+max);
            i=1;
            System.out.println(i);
        }
        while(i<a.length){
            if(a[i]>a[i+1]){
                if(a[i]>max){
                    max=a[i];
                    System.out.println("yo"+max);
                }
                if(a[i+1]<min){
                    min=a[i+1];
                    System.out.println("wo"+min);
                }
            }
            else{
                if(a[i+1]>max){
                    max=a[i+1];
                    System.out.println("lo"+max);
                }
                if(a[i]<min){
                    min=a[i];
                    System.out.println("ko"+min);
                }
            }
            i+=2;
            System.out.println("i = "+i);
        }
        System.out.println("min = "+min);
        System.out.println("max = "+max);
    }
}
