import java.util.*;

public class subsetOfArray {

    public String findSubset(){
        long[] a = {11,7,1,13,21,3,7,3};
        long[] b = {11,3,7,1,7};

        Map<Long,Integer> freqMap = new HashMap<>();

        for(int i=0;i<a.length;i++){
            int prevFreq = freqMap.getOrDefault(a[i],0);
            freqMap.put(a[i],prevFreq+1);
        }
        for(long element: b) {
            if (!freqMap.containsKey(element)) {                   //Checking if element is present in map or not
                return "No";
            }
            if (freqMap.get(element) < 0){                         //Checking if the value returned for the element is <0
                return "No";
            }
            int currentFreq = freqMap.get(element);               //if value returned for element is >=0
            freqMap.put(element, currentFreq - 1);
        }
        return "Yes";
    }
}
