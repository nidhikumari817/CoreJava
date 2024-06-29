package MapsJava;

import java.util.HashMap;

public class PairsWithGivenSum {
    public int findPairsOfGiveSum() {
        int[] arr = {1, 5, 7, 1};
        int sum = 6;
        int secondVal;
        int res=0;

        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for(int i=0; i<arr.length;i++){
            if(arr[i]>sum){
                continue;
            }
            secondVal = sum - arr[i];
            res += freqMap.getOrDefault(secondVal,0);
            freqMap.put(arr[i],freqMap.getOrDefault(arr[i],0)+1);
        }
        return res;
    }
}
