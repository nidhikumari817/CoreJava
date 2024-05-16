package MultipleInheritance;

public interface Coloring {
    void color();
    default void watercolor(){
        System.out.println("Water coloring");
    }
}
