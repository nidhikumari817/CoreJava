import java.util.Scanner;
public class Main {

    //Static Block
    //static{System.out.println("Hi I am static block");}
    public static void main(String[] args) {

        //Scanner s = new Scanner(System.in);
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
        /*System.out.println("Enter the number of rows = ");
        int rows = s.nextInt();
        StarPattern sp=  new StarPattern();
        sp.LeftTriangle(rows);
        sp.RightTriangle(rows);
        sp.DownwardStar(rows);
        sp.Diamond(rows);
        sp.Pyramid(rows);*/

        //Parameterised & Non-Parameterised Constructor
        /*Constructor c1 = new Constructor();
        Constructor c2 = new Constructor(1,"Nidhi");
        c1.display();
        c2.display();*/

        //Copy Consturctor 1
        /*Constructor c1= new Constructor(1,"Nidhi");
        Constructor c2= new Constructor(c1);
        c1.display();
        c2.display();*/

        //Copy Consturctor 2
        /*Constructor c1= new Constructor(1, "Nidhi");
        Constructor c2= new Constructor();
        c2.id = c1.id;
        c2.name = c1.name;
        c1.display();
        c2.display();*/

        //Static variable
        /*StaticKeyword sk1= new StaticKeyword(1,"Nidhi");
        StaticKeyword sk2= new StaticKeyword(2,"Riya");
        StaticKeyword.college="IIT";
        sk1.display();
        sk2.display();*/

        //Static Count Variable
        /*StaticKeyword sk1 = new StaticKeyword(1,"Nidhi");
        sk1.display();
        StaticKeyword sk2 = new StaticKeyword(2,"Riya");
        sk2.display();*/

        //Static Method
        /*StaticKeyword sk1= new StaticKeyword(1,"Nidhi");
        StaticKeyword sk2= new StaticKeyword(2,"Riya");
        sk1.display();
        sk2.display();
        StaticKeyword.change();
        sk1.display();
        sk2.display();*/

        //Testing Static Block
        //System.out.print("Hi I am main block");

        //Invoke instance variable
        /*ThisKeyword tk = new ThisKeyword(1,"Nidhi");
        tk.display();*/

        //Invoke current class method
        /*ThisKeyword tk = new ThisKeyword();
        tk.n();*/

        //Invoke current class constructor
        /*ThisKeyword tk = new ThisKeyword(1,"Nidhi");*/

        //Invoking paramterised constructor from default constructor
        /*ThisKeyword tk = new ThisKeyword();*/

        //Reusing constructor with this
       /* ThisKeyword tk1 = new ThisKeyword(1,"Nidhi","IT");
        ThisKeyword tk2 = new ThisKeyword(2, "Asmita", "CS", 10.25f);
        tk1.display();
        tk2.display();*/

        //this to pass as an argument in method
        /*ThisKeyword tk = new ThisKeyword();
        tk.n();*/

        //Parent Child Inheritance
        /*Programmer p = new Programmer();
        System.out.println("Programmers salary = " + p.salary);
        System.out.println("Programmers bonus = " + p.bonus);*/


    };
}