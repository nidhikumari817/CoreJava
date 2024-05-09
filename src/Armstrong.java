import java.lang.Math;

public class Armstrong {

	public int getOrder(int number) {
            int order = 0 ;		
            while(number > 0) {
	        // Getting the Remainder Example: 124 %10 = 4
	        number = number / 10;
		order++;    
	    }
	  return order;	
	}		
    	public void isArmStrong(int num) {
	    if (num < 0){
	        System.out.println("Negative Number can not be Armstrong");
	        return;
	    }
	    int sum = 0;
	    int meta = num;
            int order = getOrder(meta);		
	    while(meta > 0) {
	        // Getting the Remainder Example: 124 %10 = 4
	        int remainder = meta % 10;
	        sum = sum +  Math.pow(remainder,order);
	        meta = meta / 10;
	    }
	    if (sum == num){
	        System.out.println("Number is an Armstrong Number");
	    }else System.out.println("Number is not an Armstrong");
	}
}
