package Array;

import java.util.ArrayList;

public class VowelsConsonants {
    public void vowelsCount(String s){
        s=s.toLowerCase();
        int vCount = 0;
        int cCount = 0;
        int len = s.length();
        for (int i=0; i<len; i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)== 'o' || s.charAt(i)== 'u'){
                vCount++;
            } else if (s.charAt(i)>='a' && s.charAt(i)<='z') {
                cCount++;
            }
        }

        System.out.println("Count of vowels = " +vCount);
        System.out.println("Count of consonants = " +cCount);
    }
}
