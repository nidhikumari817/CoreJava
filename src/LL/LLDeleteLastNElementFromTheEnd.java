package LL;

public class LLDeleteLastNElementFromTheEnd {
    int data;
    LLDeleteLastNElementFromTheEnd next;

    LLDeleteLastNElementFromTheEnd(int data, LLDeleteLastNElementFromTheEnd next){
        this.data = data;
        this.next = next;
    }
    LLDeleteLastNElementFromTheEnd(int data){
        this.data = data;
        this.next = null;
    }

    public static LLDeleteLastNElementFromTheEnd insertion(int[] a){
        LLDeleteLastNElementFromTheEnd head = new LLDeleteLastNElementFromTheEnd(a[0]);
        LLDeleteLastNElementFromTheEnd prev = head;
        for(int i=1;i<a.length;i++){
            LLDeleteLastNElementFromTheEnd newNode = new LLDeleteLastNElementFromTheEnd(a[i]);
            prev.next = newNode;
            prev = prev.next;
        }
        return head;
    }

    public static LLDeleteLastNElementFromTheEnd LLDeleteLastNElement(LLDeleteLastNElementFromTheEnd head, int n){
        if(head == null){
            return head;
        }
        LLDeleteLastNElementFromTheEnd fast = head;
        LLDeleteLastNElementFromTheEnd slow = head;
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        if(fast==null){
            return head.next;
        }
        while(fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }
        LLDeleteLastNElementFromTheEnd delNode = slow.next;
        slow.next = slow.next.next;
        delNode.next = null;
        return head;
    }

    public static void print(LLDeleteLastNElementFromTheEnd head){
        LLDeleteLastNElementFromTheEnd temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
