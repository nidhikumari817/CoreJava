import java.lang.Math;

public class Armstrong {
    	public void isArmStrong(int num) {
	    if (num < 0){
	        System.out.println("Negative Number can not be Armstrong");
	        return;
	    }
	    int sum = 0;
	    int meta = num;
	    while(meta > 0) {
	        // Getting the Remainder Example: 124 %10 = 4
	        int remainder = meta % 10;
	        sum = sum +  (remainder * remainder * remainder);
	        meta = meta / 10;
	    }
	    if (sum == num){
	        System.out.println("Number is an Armstrong Number");
	    }else System.out.println("Number is not an Armstrong");
	}
}
