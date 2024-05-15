package AbstractClass;

public abstract class Car {

    Car(){
        System.out.println("Car Constructor invoked");
    }
    public abstract void drive();
    public void playMusic(){
        System.out.println("Playing Music");
    }
}
