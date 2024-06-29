package LL;

public class DLLReverse {

    int data;
    DLLReverse next;
    DLLReverse back;

    DLLReverse(int data, DLLReverse next, DLLReverse back){
        this.data = data;
        this.next = next;
        this.back = back;
    }

    DLLReverse(int data){
        this.data = data;
        this.next = null;
        this.back = null;
    }

    public static DLLReverse insertionInDll(int[] a){
        DLLReverse head = new DLLReverse(a[0]);
        DLLReverse prev = head;
        for(int i=1; i<a.length; i++){
            DLLReverse newNode = new DLLReverse(a[i],null,prev);
            prev.next = newNode;
            prev = newNode;
        }
        return head;
    }
    public static DLLReverse reverseDll(DLLReverse head){
        if(head == null || head.next==null){
            return head;
        }
        DLLReverse temp = head;
        DLLReverse prev = null;
        while(temp!=null){
            prev = temp.back;
            temp.back = temp.next;
            temp.next = prev;
            temp = temp.back;
        }
        return prev;
    }

    public static void print(DLLReverse head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }
}
