package instanceInitialiserBlock;

public class B1 extends A{
    public B1(){
        System.out.println("B1 invoked");
    }

    public B1(int id, String name){
        System.out.println("B1 parameter invoked");
    }

    {System.out.println("Instance Initialiser Block invoked");}
}
