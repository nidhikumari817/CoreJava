package SuperKeyword;

public class Child extends Parent{
    public void eat(){
        System.out.println("Child eats");
    }
    public void cry(){
        eat();
        super.eat();  //super keyword to invoke parent method
    }
}
