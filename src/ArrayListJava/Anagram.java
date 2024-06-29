package ArrayListJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Anagram {
    public void usingArray(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        int len1= a.length();
        int len2= b.length();

        if(len1 == len2){

            char[] arr1 = a.toCharArray();
            char[] arr2 = b.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if(Arrays.equals(arr1,arr2)){
                System.out.println("ArrayListJava.Anagram");
            }
            else
                System.out.println("Not ArrayListJava.Anagram");
        }
        else
            System.out.println("Not ArrayListJava.Anagram");
    }
}
