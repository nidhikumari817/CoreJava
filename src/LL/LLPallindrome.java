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

    public static boolean pallindromeStack(LLPallindrome head) {                              //Brute Force
        if (head == null) {
            return false;
        }
        if (head.next == null) {
            return true;
        }
        LLPallindrome temp = head;
        Stack<Integer> st = new Stack<>();
        while (temp != null) {
            st.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while (temp != null) {
            if (temp.data != st.lastElement()) {
                return false;
            }
            st.pop();
            temp = temp.next;
        }
        return true;
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
