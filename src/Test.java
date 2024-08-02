import LL.DLLRemoveDuplicates;

public class Test {
    int data;
    Test next;

    Test(int data, Test next){
        this.data = data;
        this.next = next;
    }
    Test(int data){
        this.data = data;
        this.next = null;
    }

    public static Test insertion(int[] a){
        Test head = new Test(a[0]);
        Test temp = head;
        for(int i=1; i<a.length; i++){
            Test newNode = new Test(a[i]);
            temp.next = newNode;
            temp = temp.next;
        }
        return head;
    }

    public static Test merge_sort(Test head) {

    }

    public static void print(Test head){
        Test temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}
