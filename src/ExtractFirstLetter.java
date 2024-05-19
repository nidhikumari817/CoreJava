import java.util.ArrayList;
import java.util.ListIterator;

public class ExtractFirstLetter {
    public void usingSplit(String s){
        String[] b = s.split( " ");
        for(int i=0;i<b.length;i++){
            String c= b[i].trim();
            if(c.length()!=0){
                System.out.println(c.charAt(0));
            }
        }
    }
}

