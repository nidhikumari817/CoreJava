package BasicCodes;

//Number BasicCodes.Pallindrome
public class Pallindrome {
    public void pal(int n)
    {
        int num1 = n;
        int num2 = 0;
        while(n>0)
        {
            int r = n%10;
            n = n/10;
            num2 = (num2*10)+r;
        }
        if (num1 == num2){
            System.out.print(num1+" is a pallindrome");
        }
        else{
            System.out.print(num1+" is not a pallindrome");
        }
    }

    //String BasicCodes.Pallindrome
    public void pal(String word){
        int length = word.length();
        int i=0, j=length-1, flag=0;
        while(i<j && flag==0){
            if(word.charAt(i) != word.charAt(j))
            {   flag=1;
                break;
            }
            i++;
            j--;
        }
        if(flag==1){
            System.out.println(word + " is not a pallindrome");
        }
        else{
            System.out.println(word + " is a pallindrome");
        }
    }
}
