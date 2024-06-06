import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public void SetsCommands(){

        Set<String> h = new HashSet<>();

        h.add("3");                                                    //Adding elements in set h
        h.add("Nidhi");
        h.add("Riya");
        h.add("Himanshu");

        for(String x: h)
            System.out.println(x);                                    // Hashset contains unique elements and does not return in sorted manner

        h.remove("3");                                             // Removing elements from set
        for(String x: h)
        System.out.print(x+",");
        System.out.print("\n");

        System.out.println(h.contains("Riya"));                       // Checking if this element is present in the set or not

        System.out.println(h.size());                                 //Check the size of set

        System.out.println(h.isEmpty());                              //Check if set is empty

        Integer[] a = {22, 45, 33, 66, 55, 34, 77, 55};
        Integer[] b = {33, 2, 83, 45, 3, 12, 55};

        Set <Integer> set1 = new HashSet<>();
        Set <Integer> set2 = new HashSet<>();

        System.out.print(Arrays.asList(a));                          //Convert array into a list. List can contain duplicate values
        System.out.println();
        set1.addAll(Arrays.asList(a));                               //Converting list into a set. Set contains only unique values
        set2.addAll(Arrays.asList(b));

        //Finding union of set1 and set2
        Set <Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.print("Union of set1 and set2 is : ");            //Finding union of set1 and set2
        System.out.println(union);

        //Finding intersection of set1 and set2
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.print("Intersection of set1 and set2 is : ");     //Finding intersectiom of set1 and set2
        System.out.println(intersection);

        //Finding difference of set1 and set2
        Set <Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.print("Difference of set1 and set2 : ");
        System.out.println(difference);
    }
}
