public class Lexographicalstring {
    public void getSmallestAndLargest(String s, int k){
        String smallest= s.substring(0,k);
        String largest= s.substring(0,k);

        for(int i=1;i<=s.length()-k;i++){
            String substr = s.substring(i,i+k);
            System.out.println(substr);
            if(substr.compareTo(smallest)<0){
                smallest=substr;
            }
            else if(substr.compareTo(largest)>0){
                largest=substr;
            }
        }
        System.out.println(smallest+"\n"+largest);
    }
}
