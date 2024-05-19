import AbstractClass.Toyota;
import AbstractClass.WagonR;
import Aggregation.Address;
import Aggregation.Employee2;
import HierarichalInheritance.Cat;
import HierarichalInheritance.Dog2;
import InstanceOf.Chair;
import InstanceOf.Table;
import Interface.Circle;
import Interface.Draw;
import Interface.Rectangle;
import MethodOverriding.ICICI;
import MethodOverriding.PNB;
import MethodOverriding.SBI;
import MultilevelInheritance.Dog;
import MultipleInheritance.Drawing;
import MultipleInheritance.Triangle;
import SingleInheritance.Employee;
import SingleInheritance.Programmer;
import SuperKeyword.Child;
import SuperKeyword.Employee3;
import SuperKeyword.Rose;
import SuperKeyword.Tiger;
import instanceInitialiserBlock.B1;
import AbstractClass.Car;

import java.util.*;
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

        //Single Inheritance
        /*Programmer p = new Programmer();
        System.out.println("Programmers salary = " + p.salary );
        System.out.println("Programmers bonus = " + p.bonus);*/

        //Multilevel Inheritance
        /*Dog d = new Dog();
        d.eat();
        d.Bark();
        d.roam();*/

        //Hierarchial Inheritance
        /*Cat c= new Cat();
        Dog2 g = new Dog2();
        c.sleep();
        c.meow();
        g.sleep();
        g.bark();*/

        //Aggregation
        /*Address a = new Address("Surya Vihar","Gurgaon","Haryana",122016);
        Employee2 e2 = new Employee2(1,"Nidhi",a);
        e2.display();*/

        //Method Overloading
        /*MethodOverloading mo1 = new MethodOverloading(1,2);
        MethodOverloading mo2 = new MethodOverloading(1,2,3);
        MethodOverloading mo3 = new MethodOverloading(1,10f);
        mo1.display();
        mo2.display();
        mo3.display();*/

        //Method Overriding
        /*ICICI i = new ICICI();
        PNB p = new PNB();
        SBI sb = new SBI();
        System.out.println("ICICI Rate of Interest = "+i.getRateOfInterest());
        System.out.println("PNB Rate of Interest = "+p.getRateOfInterest());
        System.out.print("SBI Rate of Interest = "+sb.getRateOfInterest());*/

        //SuperKeyword for variable
        /*Tiger t = new Tiger();
        t.findTheColor();*/

        //SuperKeyword to invoke parent method
        /*Child ch = new Child();
        ch.cry();*/

        //SuperKeyword to invoke parent class constructor
        //Rose r = new Rose();

        //Real world super keyword usage
        /*Employee3 emp =new Employee3(1,"Nidhi",1000);
        emp.display();*/

        //Instance Initialiser Block
        /*B1 b1 = new B1();
        B1 b2 = new B1(1,"Nidhi");*/

        //Instance of
        /*Table t1= new Table();
        System.out.println(t1 instanceof Table);
        System.out.print(t1 instanceof Chair);*/

        //Abstract Class
        /*Car c1 = new Toyota();
        Car c2 = new WagonR();
        c1.playMusic();
        c1.drive();
        c2.playMusic();
        c2.drive();*/

        //Interface
        /*Draw d = new Circle();
        d.draw();
        Draw d1 = new Rectangle();
        d1.draw();*/

        //Multiple Inheritance
        /*Drawing d = new Triangle();
        d.draw();
        d.color();
        System.out.println(Drawing.cube(3));*/

        //Encapsulation
        /*Account a = new Account();
        a.setAcc_no(1);
        a.setName("Nidhi");
        a.setAmount(1000);
        a.getAcc_no();
        a.getName();
        a.getAmount();
        System.out.println(a.getAcc_no()+" "+a.getName()+" "+a.getAmount());*/

        //Arrays
        /*int arr[]={100,99,85,70,98,101,60};
        Array a = new Array(arr);*/

        //Wrapper Class
        //WrapperClass w = new WrapperClass(100,'H',170.8f);

        //ArrayList
        /*ArrayListEx x = new ArrayListEx();
        x.useArrayList();*/

        //Reverse a String
        /*StringReverse sr = new StringReverse();
        sr.StringReverseUsingStringBuilder();                     //String Builder Class
        sr.StringReverseUsingStringBuffer("My name is Nidhi");    //String Buffer Class
        sr.StringReverseUsingArrayList();*/                       // Array List

        //Find max value from Array
        /*LargeValueFromArray la = new LargeValueFromArray();
        la.usingForLoop();
        la.usingArrayList();*/

        //Extract First Letter
        /*ExtractFirstLetter ef = new ExtractFirstLetter();
        ef.usingSplit("My name is  Nidhi");*/

        //Smallest and Largest Substring
        Lexographicalstring l = new Lexographicalstring();
        l.getSmallestAndLargest("welcometojava",3);
    };
}