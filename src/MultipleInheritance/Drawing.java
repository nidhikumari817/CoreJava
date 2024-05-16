package MultipleInheritance;

public interface Drawing extends Coloring{
    void draw();
    static int cube(int x){
        return x*x*x;
    }
}
