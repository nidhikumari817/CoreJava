package Array;

import java.util.ArrayList;

public class VowelsConsonants {
    public void vowelsCount(String s){
        s=s.toLowerCase();
        int count = 0;
        int len = s.length();
        for (int i=0; i<len; i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)== 'o' || s.charAt(i)== 'u'){
                count++;
            }
        }

        System.out.println("Count of vowels = " + count);
        int consonant= len-count;
        System.out.println("Count of consonants = " + consonant);
    }
}
