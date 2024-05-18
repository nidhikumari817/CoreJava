import java.util.ArrayList;

public class LargeValueFromArray {

    int[] a = {10,20,30,40,50};
    //Using Array
    public void usingForLoop(){
        int max = a[0];
        for (int i=0; i<a.length; i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        System.out.println(max);
    }

    //Using ArrayList
    public void usingArrayList(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0,60);
        list.add(1,40);
        list.add(2,50);
        list.add(3,50);
        list.add(4,30);

        int max= list.get(0);
        for(int i: list){
            if(max<i){
                max=i;
            }
        }
        System.out.println(max);
    }
}
