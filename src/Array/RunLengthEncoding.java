package Array;

public class RunLengthEncoding {
    public void encoding() {
        String s = "wwwwaaadexxxxxxywww";
        int n = s.length();

        for(int i=0; i<n; i++){
            int count=1;
            while (i<n-1 && s.charAt(i)==s.charAt(i+1)) {
                count++;
                i++;
            }
            System.out.print(s.charAt(i)+""+count);
        }
    }
}
