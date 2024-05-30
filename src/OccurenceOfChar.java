import java.util.ArrayList;

public class OccurenceOfChar {
    int count=0;
    public void using(String s, char c){
        int len= s.length();
        for(int i=0; i<len;i++){
            if(s.charAt(i)==c){
                count++;
            }
        }
        System.out.println("Occurence of "+c+" = "+count);
    }
}
