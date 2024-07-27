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


    public static boolean pallindromeOptimised(LLPallindrome head){
        LLPallindrome temp = head;

        return true;
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
