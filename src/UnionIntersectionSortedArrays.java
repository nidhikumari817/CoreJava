import java.util.*;

public class UnionIntersectionSortedArrays {
    public void unionBruteForce() {                      //Brute Force Approach
        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = {60, 20, 70, 40};

        int len1 = arr1.length;
        int len2 = arr2.length;

        Set<Integer> s = new TreeSet<>();

        for (int i = 0; i < len1; i++) {
            s.add(arr1[i]);
        }
        for (int i = 0; i < len2; i++) {
            s.add(arr2[i]);
        }
        for (int x : s)
            System.out.println(x);
    }

    public void unionOptimisedApproach() {              //Optimised Approach
        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = {20, 40, 60, 70};

        ArrayList<Integer> list = new ArrayList<>();

        int len1 = arr1.length;
        int len2 = arr2.length;

        int i = 0;
        int j = 0;

        while (i < len1 && j < len2) {
            if (arr1[i] <= arr2[j]) {
                if (list.size() == 0 || list.get(list.size() - 1) != arr1[i]) {
                    list.add(arr1[i]);
                }
                i++;
            }
            else {
                if (list.size() == 0 || list.get(list.size() - 1) != arr2[j]) {
                    list.add(arr2[j]);
                }
                j++;
            }
        }
        while(i<len1) {
            if (list.size() == 0 || list.get(list.size() - 1) != arr1[i]) {
                list.add(arr1[i]);
            }
            i++;
        }
        while(j<len2){
            if(list.size()==0 || list.get(list.size()-1) != arr2[j]){
                list.add(arr2[j]);
            }
            j++;
        }
        for(int x: list)
            System.out.println(x);
    }

    public void optimisedIntersection(){
        int[] a={1,2,2,3,3,4,5,6};
        int b[] = {2,3,3,5,6,6,7};
        ArrayList<Integer> list = new ArrayList<>();

        int len1 = a.length, len2 = b.length;
        int i=0, j=0;

        while(i<len1 && j<len2){
            if(a[i] < b[j]){
                i++;
            } else if (b[j]<a[i]) {
                j++;

            } else {
                list.add(a[i]);
                i++;
                j++;
            }
        }
        for(int x: list)
            System.out.print(x);
    }
}

