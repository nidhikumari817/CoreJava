package LL;

import java.util.Stack;

public class LLPallindrome {
    int data;
    LLPallindrome  next;

    LLPallindrome (int data, LLPallindrome  next){
        this.data = data;
        this.next = next;
    }
    LLPallindrome (int data){
        this.data = data;
        this.next = null;
    }

    public static LLPallindrome insertion(int[] a){
        LLPallindrome head = new LLPallindrome (a[0]);
        LLPallindrome prev = head;
        for(int i=1;i<a.length;i++){
            LLPallindrome newNode = new LLPallindrome(a[i]);
            prev.next = newNode;
            prev = newNode;
        }
        return head;
    }


    public static boolean pallindrome(LLPallindrome head){
        LLPallindrome fast = head;
        LLPallindrome slow = head;

        while(fast.next!=null && fast.next.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        LLPallindrome newHead = reverse(slow.next);
        LLPallindrome first = head;
        LLPallindrome second = newHead;

        while(second!=null){
            if(first.data != second.data){
                reverse(newHead);
                return false;
            }
                first = first.next;
                second = second.next;
        }
        reverse(newHead);
        return true;
    }

    public static LLPallindrome reverse(LLPallindrome head){
        LLPallindrome temp = head;
        LLPallindrome prev = null;

        while(temp.next!=null){
            LLPallindrome front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }

    public static LLPallindrome print(LLPallindrome head){
        LLPallindrome temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        return head;
    }
}
