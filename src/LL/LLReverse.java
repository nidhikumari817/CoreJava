package LL;

import java.util.Stack;

public class  LLReverse {
    int data;
    LLReverse next;

    LLReverse(int data, LLReverse next){
        this.data = data;
        this.next = next;
    }
    LLReverse(int data){
        this.data = data;
        this.next = null;
    }

    public static LLReverse insertion(int[] a){
        LLReverse head = new LLReverse(a[0]);
        LLReverse prev = head;
        for(int i=1;i<a.length;i++){
            LLReverse newNode = new LLReverse(a[i]);
            prev.next = newNode;
            prev = newNode;
        }
        return head;
    }

    public static LLReverse iterationReverse1(LLReverse head){                               //Brute Force
        Stack<Integer> st = new Stack<>();
        LLReverse temp = head;
        while(temp!=null){
            st.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while (temp!=null){
            temp.data = st.lastElement();
            st.pop();
            temp = temp.next;
        }
        return head;
    }

    public static LLReverse iterationReverse2(LLReverse head){
        if(head==null || head.next==null){
            return head;
        }else {
            LLReverse temp = head;
            LLReverse prev = null;
            while(temp!=null){
                LLReverse front = temp.next;
                temp.next = prev;
                prev = temp;
                temp = front;
            }
            return prev;
        }
    }

    public static LLReverse print(LLReverse head){
        LLReverse temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        return head;
    }
}
