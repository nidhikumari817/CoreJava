package Array;

public class WordReverseInString {

    public void wordsReversal(String word){
        String[] s = word.split(" ");
        String rev="";

        for(int i=s.length-1;i>=0;i--){
            if(i==0 || i==s.length-1){
                rev = rev+s[i]+" ";
            } else{
                rev = rev+reverseString(s[i])+" ";
            }
        }
        System.out.println(rev);
    }

    public String reverseString(String a){
        String rev="";
        int len=a.length();
        for(int i=len-1;i>=0;i--){
            rev = rev + a.charAt(i);
        }
        return rev;
    }
}
