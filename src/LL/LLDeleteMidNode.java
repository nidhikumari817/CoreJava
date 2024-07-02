package LL;

public class LLDeleteMidNode {
    int data;
    LLDeleteMidNode next;

    LLDeleteMidNode(int data){
        this.data = data;
        this.next = null;
    }

    public static LLDeleteMidNode insertion(int[] a){
        LLDeleteMidNode head = new LLDeleteMidNode(a[0]);
        LLDeleteMidNode temp = head;
        for(int i=1; i<a.length; i++){
            LLDeleteMidNode newNode = new LLDeleteMidNode(a[i]);
            temp.next = newNode;
            temp = temp.next;
        }
        return head;
    }

    public static LLDeleteMidNode deletingMiddleNode(LLDeleteMidNode head){
        LLDeleteMidNode fast = head;
        LLDeleteMidNode slow = head;
        fast = fast.next.next;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;

        return head;
    }

    public static void print(LLDeleteMidNode head) {
        LLDeleteMidNode temp = head;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}
