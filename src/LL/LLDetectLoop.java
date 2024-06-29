package LL;

public class LLDetectLoop {

    int data;
    LLDetectLoop next;

    LLDetectLoop(int data){
        this.data = data;
        this.next = null;
    }

    public static LLDetectLoop insertion(int[] a){
        LLDetectLoop head = new LLDetectLoop(a[0]);
        LLDetectLoop temp = head;
        for(int i=0; i<a.length; i++){
            LLDetectLoop newNode = new LLDetectLoop(a[i]);
            temp.next = newNode;
            temp = temp.next;
        }
        return head;
    }
    public static boolean detectingLoop(LLDetectLoop head){
        LLDetectLoop fast= head;
        LLDetectLoop slow = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast==slow){
                return true;
            }
        }
        return false;
    }

    public static void print(Boolean result){
        if(result == true){
            System.out.print("Yes , a loop is present");
        }else{
            System.out.print("No, there is no loop present");
        }
    }
}
