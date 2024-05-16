package MultipleInheritance;

public class Triangle implements Drawing{
    public Triangle(){
        System.out.println("Triangle constructor");
    }
    public void draw(){
        System.out.println("Drawing Triangle");
    }
    public void color(){
        System.out.println("Coloring Traingle");
    }
}
