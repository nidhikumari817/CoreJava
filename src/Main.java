import java.util.*;
public class Main {

    //Static Block
    //static{System.out.println("Hi I am static block");}
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
       /* System.out.println("Enter the number of rows = ");
        int rows = s.nextInt();
        StarPattern sp=  new StarPattern();
        sp.LeftTriangle(rows);
        sp.RightTriangle(rows);
        sp.DownwardStar(rows);
        sp.Diamond(rows);
        sp.Pyramid(rows);
        sp.square(rows);*/

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
        /*Lexographicalstring l = new Lexographicalstring();
        l.getSmallestAndLargest("welcometojava",3);*/

        //Anagram
        /*Anagram a = new Anagram();
        a.usingArray("dcaby","abcdx");*/

        //Occurence of a character in a String
        /*OccurenceOfChar oc = new OccurenceOfChar();
        oc.using("welcometojava", 'e');*/

        //Vowels and Consonants
        /*VowelsConsonants vc = new VowelsConsonants();
        vc.vowelsCount("Wlcmtjv");*/

        //Array asc, desc, check if equal, copy array  Elements
        /*ArrayArrangement a = new ArrayArrangement();
        a.Ascending(s);
        a.descending(s);
        a.equal(s);
        a.copyArray(s);*/

        //Array Insert Element
        /*ArrayInsertElement em = new ArrayInsertElement();
        em.insertElementInSameArray(s);
        em.insertElementInNewArray(s);
        em.usingArrayList(s);*/

        /*Array Delete Element
        ArrayDeleteElement de = new ArrayDeleteElement();
        de.DeleteElement(s);*/

        /*ArrayReverse ar = new ArrayReverse();
        ar.usingTwoPointers(s);
        ar.usingTwoArray(s);*/

        //Array Union & Intersection
        /*UnionIntersectionSortedArrays ui = new UnionIntersectionSortedArrays();
        ui.union(s);*/

        /*Matrix tm = new Matrix();
        tm.transposeMatrix(s);
        tm.mirrorMatrix(s);*/

        /*ArrayMinMax mm = new ArrayMinMax();
        mm.byUsineMinComparisons();*/

        /*ArrayMissingNumber mn = new ArrayMissingNumber();
        mn.usingSum();
        mn.usingXOR();
        mn.twoMissingElement();*/

        /*ArrayListComparison lc = new ArrayListComparison();
        lc.usingEqualsMethod();
        lc.usingRemoveAllMethod();
        lc.usingRetainAllMethod();
        lc.usingContainsMethod();*/

        /*ArrayListReverse lr = new ArrayListReverse();
        lr.usingCollection();*/

        /*ArrayListReadOnly lm = new ArrayListReadOnly();
        lm.usingCollections();*/

        /*ArrayListSizeVsArrayLength sl = new ArrayListSizeVsArrayLength();
        sl.calculatingArrayLength();
        sl.calculatingArrayListSize();*/

        /*ArrayListConversion lc = new ArrayListConversion();
        lc.arrayListToArray();
        lc.arrayToArrayList();*/

        /*ArrayListArrangement la= new ArrayListArrangement();
        la.AscendingOrder();
        la.DescendingOrder();*/

        /*ArrayListRemoveDuplicateItems rd = new ArrayListRemoveDuplicateItems();
        rd.removingDuplicateItems();*/

        /*ArrayMergeSorted ms = new ArrayMergeSorted();
        ms.mergeSortedArrays();*/

        /*Maps mp = new Maps();
        mp.usingMaps();*/

        /*subsetOfArray sa = new subsetOfArray();
        String res = sa.findSubset();
        System.out.println(res);*/

        /*PairsWithGivenSum ps = new PairsWithGivenSum();
        int res = ps.findPairsOfGiveSum();
        System.out.println("Count of Pairs = "+res);*/

        //Rotation of arrays
        /*LeftRotateAnArray lr = new LeftRotateAnArray();
        int a[] = {1,2,3,4,5};
        int d = 2;
        int n = 5;
        lr.rotationByDPlaces(a,d,n);
        lr.rotateArrayByReverse(a,d,n);*/

        //Union and Intersection of 2 arrays
        /*UnionIntersectionSortedArrays ui = new UnionIntersectionSortedArrays();
        ui.unionBruteForce();
        ui.unionOptimisedApproach();
        ui.optimisedIntersection();*/

        //Arrange array on the basis of positive and negative
        /*ArrayArrangeonSigns as = new ArrayArrangeonSigns();
        as.firstVariety();
        as.secondApproach();*/

        //Sets
        /*Sets se = new Sets();
        se.SetsCommands();*/

        /*LinkedListOps lo = new LinkedListOps();
        lo.linkedListOps();*/

        int[] a ={30,10,20,40};
        Node head = Node.traversal(a);                                  //Inserting elements into linkedList
        Node temp1 = head;
        int count =0;
        while(temp1!=null){                                             //Traverse a LinkedList
            System.out.print(temp1.data+" ");
            temp1=temp1.next;
            count++;                                                    //Finding Length of Linkedlist
        }
        System.out.println("");
        System.out.println("Length of Linkedlist = "+count);

        int res = Node.checkIfPresent(head, 10);                   //Finding element in Linkedlist
        if(res!=0){
            System.out.println("Found");
        }

        Node head2 = Node.removeHead(head);                             //Deleting head
        System.out.println("Head = "+head2.data);

        Node head3 = Node.removeTail(head);                             //Removing tail
        Node temp2 = head3;
        while(temp2!=null){
            System.out.print(temp2.data+" ");
            temp2 = temp2.next;
        }

        /*Node head4 = Node.removeElementByIndex(head, 3);              //Remove element through index
        Node temp3 = head4;
        while(temp3 != null){
            System.out.print("Removing by Index : "+temp3.data+" ");
            temp3 = temp3.next;
        }

       /*Node head5 = Node.removeElementByValue(head, 40);              //Removing element through value
       Node temp4 = head5;
       while(temp4!=null){
           System.out.print(temp4.data+" ");
           temp4 = temp4.next;
       }*/

    };
}