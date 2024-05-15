package AbstractClass;

public class Toyota extends Car{

    public Toyota(){
        System.out.println("Toyota constructor invoked");
    }
    @Override
    public void drive() {
        System.out.println("Driving Toyota");
    }
}
