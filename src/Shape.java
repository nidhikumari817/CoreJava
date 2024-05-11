public class Shape {
    int length;
    int width;

    public void size(int l, int w){
        length = l;
        width = w;
    }
    public void area(){
        System.out.print("Area of rectangle =" +" "+ length*width);
    }
}
