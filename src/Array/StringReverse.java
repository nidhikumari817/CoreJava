package Array;

import java.util.*;

public class StringReverse {

    //String Buffer Class
    public void StringReverseUsingStringBuffer(String a){
        StringBuffer s = new StringBuffer(a);
        System.out.println(s.reverse());
    }

    //String Builder Class
    public void StringReverseUsingStringBuilder(){
        String s = "My name is Riya";
        StringBuilder s1 = new StringBuilder(s);
        s1=s1.reverse();
        for(int i=0;i<s1.length();i++){
            System.out.print(s1.charAt(i));
        }
    }

    //Using ArrayList
    public void StringReverseUsingArrayList() {
        String a = "My name is Himanshu";
        char b[] = a.toCharArray();
        List<Character> list = new ArrayList<>();

        for (char c: b)
            list.add(c);
        Collections.reverse(list);
        ListIterator li = list.listIterator();
        while(li.hasNext()){
            System.out.print(li.next());
        }
    }
}
