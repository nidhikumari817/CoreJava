import java.util.ArrayList;

public class OccurenceOfChar {
    int count=0;
    public void using(String s, char c){
        char[] arr = s.toCharArray();

        ArrayList<Character> li = new ArrayList<>();

        for(char x: arr)
            li.add(x);
        for(char y:li)
            if(y==c)
                count++;
        System.out.println("Occurence of "+c+" = "+count );
    }
}
