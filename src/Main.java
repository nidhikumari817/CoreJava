import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Fibonacci series
        /*Fibonacci f = new Fibonacci();
        f.fib();*/

        //Prime number
        /*System.out.println("Enter the first number to check = ");
        int start = s.nextInt();
        System.out.println("Enter the second number to check = ");
        int end= s.nextInt();
        PrimeNumber p = new PrimeNumber();
        p.prime(start,end);*/

        //Number Pallindrome
       /*System.out.println("Enter the number = ");
       int num = s.nextInt();
       Pallindrome p= new Pallindrome();
       p.pal(num);*/

        //String Pallindrome
        /*System.out.print("Enter the word = ");
        String word = s.nextLine();
        Pallindrome p = new Pallindrome();
        p.pal(word);*/

        //Armstrong Number
        /*System.out.println("Enter number to check = ");
        int num= s.nextInt();
        Armstrong arm = new Armstrong();
        arm.strong(num);*/

        //Star Pattern
        System.out.println("Enter the number of rows = ");
        int rows = s.nextInt();
        StarPattern sp=  new StarPattern();
        //sp.LeftTriangle(rows);
        //sp.RightTriangle(rows);
        //sp.DownwardStar(rows);
        //sp.Diamond(rows);
        sp.Pyramid(rows);
        /*System.out.print("Enter length = ");
        int l= s.nextInt();
        System.out.print("Enter width = ");
        int w= s.nextInt();
        new Shape().size(l,w);;
        new Shape().area();*/
    };
}