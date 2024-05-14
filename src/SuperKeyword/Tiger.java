package SuperKeyword;

public class Tiger extends Animal3{
    public String color = "Yellow with black stripes";

    public void findTheColor(){
        System.out.println(color);
        System.out.print(super.color);
    }
}
