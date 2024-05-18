import java.util.ArrayList;
import java.util.ListIterator;

public class ExtractFirstLetter {
    public void usingSplit(String s){
        String[] b = s.split( " ");
        for(int i=0;i<b.length;i++){
            System.out.println(b[i].charAt(0));
        }
    }
}

