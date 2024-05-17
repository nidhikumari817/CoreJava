
public class StringReverse {

    //String Buffer Class
    StringReverse(String a){
        StringBuffer s = new StringBuffer(a);
        System.out.println(s.reverse());
    }

    //String Builder Class
    StringReverse(){
        String s = "My name is Riya";
        StringBuilder s1 = new StringBuilder(s);
        s1=s1.reverse();
        for(int i=0;i<s1.length();i++){
            System.out.print(s1.charAt(i));
        }
    }
}
