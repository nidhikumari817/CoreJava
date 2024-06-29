import java.util.*;
import AbstractClass.Car;
import AbstractClass.WagonR;
import AbstractClass.Toyota;
import LL.*;

public class Main {

    //Static Block
    //static{System.out.println("Hi I am static block");}
    public static void main(String[] args) {

        //Scanner s = new Scanner(System.in);
        //BasicCodes.Fibonacci series
        /*BasicCodes.Fibonacci f = new BasicCodes.Fibonacci();
        f.fib();*/

        //Prime number
        /*System.out.println("Enter the first number to check = ");
        int start = s.nextInt();
        System.out.println("Enter the second number to check = ");
        int end= s.nextInt();
        BasicCodes.PrimeNumber p = new BasicCodes.PrimeNumber();
        p.prime(start,end);*/

        //Number BasicCodes.Pallindrome
       /*System.out.println("Enter the number = ");
       int num = s.nextInt();
       BasicCodes.Pallindrome p= new BasicCodes.Pallindrome();
       p.pal(num);*/

        //String BasicCodes.Pallindrome
        /*System.out.print("Enter the word = ");
        String word = s.nextLine();
        BasicCodes.Pallindrome p = new BasicCodes.Pallindrome();
        p.pal(word);*/

        //BasicCodes.Armstrong Number
        /*System.out.println("Enter number to check = ");
        int num= s.nextInt();
        BasicCodes.Armstrong arm = new BasicCodes.Armstrong();
        arm.strong(num);*/

        //Star Pattern
       /* System.out.println("Enter the number of rows = ");
        int rows = s.nextInt();
        BasicCodes.StarPatterns sp=  new BasicCodes.StarPatterns();
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
        Array.ArrayMinElement a = new Array.ArrayMinElement(arr);*/

        //Wrapper Class
        //WrapperClass w = new WrapperClass(100,'H',170.8f);

        //ArrayList
        /*ArrayListEx x = new ArrayListEx();
        x.useArrayList();*/

        //Reverse a String
        /*Array.StringReverse sr = new Array.StringReverse();
        sr.StringReverseUsingStringBuilder();                     //String Builder Class
        sr.StringReverseUsingStringBuffer("My name is Nidhi");    //String Buffer Class
        sr.StringReverseUsingArrayList();*/                       // Array.ArrayMinElement List

        //Find max value from Array.ArrayMinElement
        /*Array.LargeValueFromArray la = new Array.LargeValueFromArray();
        la.usingForLoop();
        la.usingArrayList();*/

        //Extract First Letter
        /*Array.ExtractFirstLetter ef = new Array.ExtractFirstLetter();
        ef.usingSplit("My name is  Nidhi");*/

        //Smallest and Largest Substring
        /*Lexographicalstring l = new Lexographicalstring();
        l.getSmallestAndLargest("welcometojava",3);*/

        //ArrayListJava.Anagram
        /*ArrayListJava.Anagram a = new ArrayListJava.Anagram();
        a.usingArray("dcaby","abcdx");*/

        //Occurence of a character in a String
        /*MapsJava.OccurenceOfChar oc = new MapsJava.OccurenceOfChar();
        //oc.usingBruteForce("welcometojava", 'e');
        //oc.usingMaps("Welcometojava");*/

        //Vowels and Consonants
        /*Array.VowelsConsonants vc = new Array.VowelsConsonants();
        vc.vowelsCount("Wlcmtjv");*/

        //Array.ArrayMinElement asc, desc, check if equal, copy array  Elements
        /*Array.ArrayArrangement a = new Array.ArrayArrangement();
        a.Ascending(s);
        a.descending(s);
        a.equal(s);
        a.copyArray(s);*/

        //Array.ArrayMinElement Insert Element
        /*Array.ArrayInsertElement em = new Array.ArrayInsertElement();
        //em.insertElementInNewArray(s);
        //em.usingArrayList(s);*/

        /*Array.ArrayMinElement Delete Element
        Array.ArrayDeleteElement de = new Array.ArrayDeleteElement();
        de.DeleteElement(s);*/

        /*Array.ArrayReverse ar = new Array.ArrayReverse();
        ar.usingTwoPointers(s);
        ar.usingTwoArray(s);*/

        /*String s = "i love algorithms";
        Array.WordReverseInString w = new Array.WordReverseInString();
        w.wordsReversal(s);*/

        //Array.ArrayMinElement Union & Intersection
        /*Array.UnionIntersectionSortedArrays ui = new Array.UnionIntersectionSortedArrays();
        ui.union(s);*/

        /*Array.Matrix tm = new Array.Matrix();
        tm.transposeMatrix(s);
        tm.mirrorMatrix(s);*/

        /*Array.ArrayMinMax mm = new Array.ArrayMinMax();
        mm.byUsingMinComparisons();*/

        /*Array.ArrayMissingNumber mn = new Array.ArrayMissingNumber();
        mn.usingSum();
        mn.usingXOR();
        mn.twoMissingElement();*/

        /*ArrayListJava.ArrayListComparison lc = new ArrayListJava.ArrayListComparison();
        //lc.usingEqualsMethod();
        //lc.usingRemoveAllMethod();
        //lc.usingRetainAllMethod();
        //lc.usingContainsMethod();*/

        /*ArrayListJava.ArrayListReverse lr = new ArrayListJava.ArrayListReverse();
        lr.usingCollection();*/

        /*ArrayListJava.ArrayListReadOnly lm = new ArrayListJava.ArrayListReadOnly();
        lm.usingCollections();*/

        /*ArrayListJava.ArrayListSizeVsArrayLength sl = new ArrayListJava.ArrayListSizeVsArrayLength();
        sl.calculatingArrayLength();
        sl.calculatingArrayListSize();*/

        /*ArrayListJava.ArrayListConversion lc = new ArrayListJava.ArrayListConversion();
        lc.arrayListToArray();
        lc.arrayToArrayList();*/

        /*ArrayListJava.ArrayListArrangement la= new ArrayListJava.ArrayListArrangement();
        la.AscendingOrder();
        la.DescendingOrder();*/

        /*ArrayListJava.ArrayListRemoveDuplicateItems rd = new ArrayListJava.ArrayListRemoveDuplicateItems();
        rd.removingDuplicateItems();*/

        /*Array.ArrayMergeSorted ms = new Array.ArrayMergeSorted();
        ms.mergeSortedArrays();
        ms.mergeSortedArraysByMethods();*/

        /*MapsJava.Maps mp = new MapsJava.Maps();
        mp.usingMaps();*/

        /*MapsJava.subsetOfArray sa = new MapsJava.subsetOfArray();
        String res = sa.findSubset();
        System.out.println(res);*/

        //Find the pairs from the array which equals to sum
        /*MapsJava.PairsWithGivenSum ps = new MapsJava.PairsWithGivenSum();
        int res = ps.findPairsOfGiveSum();
        System.out.println("Count of Pairs = "+res);*/

        //Rotation of arrays
        /*Array.LeftRotateAnArray lr = new Array.LeftRotateAnArray();
        int a[] = {1,2,3,4,5};
        int d = 2;
        int n = 5;
        lr.rotationByDPlaces(a,d,n);
        //lr.rotateArrayByReverse(a,d,n);*/

        //Union and Intersection of 2 arrays
        /*Array.UnionIntersectionSortedArrays ui = new Array.UnionIntersectionSortedArrays();
        ui.unionBruteForce();
        ui.unionOptimisedApproach();
        ui.optimisedIntersection();*/

        //Arrange array on the basis of positive and negative
        /*Array.ArrayArrangeonSigns as = new Array.ArrayArrangeonSigns();
        //as.firstVariety();
        as.secondApproach();*/

        //Sets
        /*Sets se = new Sets();
        se.SetsCommands();*/

        /*LLOperations lo = new LLOperations();
        lo.linkedListOps();*/

        //int[] a ={10,20,30,40};
        //LL.Node head = LL.Node.traversal(a);                                         //Converting array into Singly linkedList

        //LL.Node.findSizeOfLinkedList(head);                                       //Finding Length of Linkedlist

        //LL.Node.print(head);

        /*int res = LL.Node.checkIfPresent(head, 10);                               //Finding element in Linkedlist
        if(res!=0){
            System.out.println("Element Found");
        }*/

        //LL.Node head2 = LL.Node.removeHead(head);                                    //Deleting head
        //System.out.println("Head = "+head2.data);

        //LL.Node head3 = LL.Node.removeTail(head);                                    //Removing tail
        //LL.Node.print(head3);

        //LL.Node head4 = LL.Node.removeElementByIndex(head, 1);                       //Remove element through index
        //LL.Node.print(head4);

        //LL.Node head5 = LL.Node.removeElementByValue(head, 40);                      //Removing element through value
        //LL.Node.print(head5);

        //LL.Node head6 = LL.Node.insertElementAtHead(head, 100);                      //Inserting element at head
        //LL.Node.print(head6);

        //LL.Node head7 = LL.Node.insertElementAtTail(head, 200);                      //Inserting element at tail
        //LL.Node.print(head7);

        //LL.Node head8 = LL.Node.insertElementByIndex(head, 2, 200);                  //Inserting element on the basis of index
        //LL.Node.print(head8);

        //LL.Node head9 = LL.Node.insertElementBeforeValue(head,40,500);               //Inserting element before the value
        //LL.Node.print(head9);

        //int[] b= {10,20,30,40};                                                //Converting Array.ArrayMinElement to Doubly linked List
        //LL.Node1 head = LL.Node1.traversal(b);
        //LL.Node1.print(head);

        //LL.Node1 head2 = LL.Node1.deletingElementByIndex(head, 1);                  //Deleting element by index from Doubly LinkedList
        //LL.Node1.print(head2);

        //LL.Node1 head3= LL.Node1.deletingByValue(head,10);                          //Deleting element by value from Doubly LinkedList
        //LL.Node1.print(head3);*/

        //LL.Node1 head4 = LL.Node1.insertionByValue(head,40, 23);
        //LL.Node1.print(head4);

        /*int[] a = {10,20,30,40,50};
        LL.DLLReverse head = LL.DLLReverse.insertionInDll(a);
        LL.DLLReverse.print(head);

        LL.DLLReverse head1 = LL.DLLReverse.reverseDll(head);
        LL.DLLReverse.print(head1);*/

        //Sum of 2 LL
        /*int[] a = {1,2,3,5};
        int[] b = {4,5,6,7,8,9};
        LL.LLFindSum head1 = LL.LLFindSum.insertion(a);
        LL.LLFindSum head2 = LL.LLFindSum.insertion(b);
        LL.LLFindSum head3 = LL.LLFindSum.sum(head1,head2);
        LL.LLFindSum.print(head3);*/

        //Arrange Odd and Even Index in SLL
        /*int[] a = {1,3,4,2};
        LL.LLOddEvenIndex head = LL.LLOddEvenIndex.insertion(a);
        LL.LLOddEvenIndex head1 = LL.LLOddEvenIndex.oddEvenIndexing(head);
        LL.LLOddEvenIndex head2 = LL.LLOddEvenIndex.oddEvenIndexingg(head);
        LL.LLOddEvenIndex.print(head2);*/

        //Sorting 0,1,2 in SLL
        /*int[] a = {1,0,1,2,0,2,1};
        LL.LLSorting head = LL.LLSorting.insertion(a);
        //LL.LLSorting head1 = LL.LLSorting.sorting(head);
        LL.LLSorting head2 = LL.LLSorting.optimisedSorting(head);
        LL.LLSorting.print(head2);*/

        //Delete Node from SLL
        /*int[] a= {1,2,3,4,5};
        LL.LLDeleteLastNElement head = LL.LLDeleteLastNElement.insertion(a);
        LL.LLDeleteLastNElement head1 = LL.LLDeleteLastNElement.deleteLastNthElement(head,5);
        LL.LLDeleteLastNElement.print(head1);*/

        //Reverse a SLL
        /*int[] a= {1,2,3,4,5};
        LL.LLReverse head = LL.LLReverse.insertion(a);
        //LL.LLReverse head1 = LL.LLReverse.iterationReverse1(head);
        LL.LLReverse head2 = LL.LLReverse.iterationReverse1(head);
        LL.LLReverse.print(head2);*/

        //Check SLL Pallindrome
        /*int[] a= {1,2,3,2,1};
        LL.LLPallindrome head = LL.LLPallindrome.insertion(a);
        Boolean res = LL.LLPallindrome.pallindromeStack(head);
        if(res==false){
            System.out.println("Not a Pallindrome");
        }else {
            System.out.println("Pallindrome");
        }*/

        //Find Intersection point in 2 SLL
        /*int a[] = {3,1,4,6,2};
        int b[] = {1,2,4,5,4,6,2};
        LLIntersectionPoint head1 = LLIntersectionPoint.insertion(a);
        LLIntersectionPoint head2 = LLIntersectionPoint.insertion(b);
        LLIntersectionPoint head = LLIntersectionPoint.findIntersectionPoint(head1,head2);
        LLIntersectionPoint.print(head);*/

        //Detecting Loop in SLL
        /*int[] a = {1,2,3,4,5,6};
        LLDetectLoop head = LLDetectLoop.insertion(a);
        Boolean res = LLDetectLoop.detectingLoop(head);
        LLDetectLoop.print(res);*/

        //Finding middle element in a LinkedList
        /*int a[] = {1,2,3,4,5,6,7,8,9,10};
        LLFindMiddleNode head = LLFindMiddleNode.insertion(a);
        int mid = LLFindMiddleNode.findMiddleNode(head);
        //int mid = LLFindMiddleNode.findMidNode(head);
        LLFindMiddleNode.print(mid);*/

        //Remove Duplicate nodes in Sorted LL
        /*int a[] = {1,2,2,3,4,4,5};
        LLRemoveDuplicates head = LLRemoveDuplicates.insertion(a);
        LLRemoveDuplicates head1 = LLRemoveDuplicates.removeDuplicateNodes(head);
        LLRemoveDuplicates.print(head1);*/

        //Remove duplicate nodes in sorted DLL
        /*int a[] = {1,2,2,3,4,4,5};
        DLLRemoveDuplicates head = DLLRemoveDuplicates.insertion(a);
        DLLRemoveDuplicates head1 = DLLRemoveDuplicates.removeDuplicateNodes(head);
        DLLRemoveDuplicates.print(head1);*/

        //Merge two sorted Linked List
        /*int[] a = {2,4,8,10};
        int[] b = {1,3,3,6,11,14};
        LLMergeSort head1 = LLMergeSort.insertion(a);
        LLMergeSort head2 = LLMergeSort.insertion(b);
        LLMergeSort head = LLMergeSort.mergeSortedLL(head1, head2);
        LLMergeSort.print(head);*/
    };
}