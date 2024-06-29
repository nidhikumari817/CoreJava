package LL;

public class LLDeleteLastNElement {
    int data;
    LLDeleteLastNElement next;

    LLDeleteLastNElement(int data, LLDeleteLastNElement next){
        this.data = data;
        this.next = next;
    }
    LLDeleteLastNElement(int data){
        this.data = data;
        this.next = null;
    }

    public static LLDeleteLastNElement insertion(int[] a){
        LLDeleteLastNElement head = new LLDeleteLastNElement(a[0]);
        LLDeleteLastNElement prev = head;
        for(int i=1;i<a.length;i++){
            LLDeleteLastNElement newNode = new LLDeleteLastNElement(a[i]);
            prev.next = newNode;
            prev = prev.next;
        }
        return head;
    }

    public static LLDeleteLastNElement deleteLastNthElement(LLDeleteLastNElement head, int n){
        if(head == null){
            return head;
        }
        LLDeleteLastNElement fast = head;
        LLDeleteLastNElement slow = head;
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        while(fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }
        if(fast==null){
           return head.next;
        }
        LLDeleteLastNElement delNode = slow.next;
        slow.next = slow.next.next;
        delNode.next = null;
        return head;
    }

    public static void print(LLDeleteLastNElement head){
        LLDeleteLastNElement temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
