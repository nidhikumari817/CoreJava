package Array;

import java.util.ArrayList;
import java.util.ListIterator;
public class ExtractFirstLetter {
    public void usingSplit(String s){
        String[] a = s.split(" ");
        int len = a.length;
        for(int i=0;i<len;i++){
            String g = a[i];
            if(g.length()!=0){
                System.out.println(g.charAt(0));
            }
        }
    }
}

