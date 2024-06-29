package LL;

import java.rmi.UnexpectedException;

public class LLIntersectionPoint {
    int data;
    LLIntersectionPoint next;

    LLIntersectionPoint(int data, LLIntersectionPoint next){
        this.data = data;
        this.next = next;
    }
    LLIntersectionPoint(int data){
        this.data = data;
        this.next = null;
    }

    public static LLIntersectionPoint insertion(int[] a){

        LLIntersectionPoint head = new LLIntersectionPoint(a[0]);
        LLIntersectionPoint temp = head;

        for(int i=1; i<a.length; i++){
            LLIntersectionPoint newNode = new LLIntersectionPoint(a[i]);
            temp.next = newNode;
            temp = temp.next;
        }
        return head;
    }
    int a[] = {3,1,4,6,2};
    int b[] = {1,2,4,5,4,6,2};
    public static LLIntersectionPoint findIntersectionPoint(LLIntersectionPoint head1, LLIntersectionPoint head2){
        LLIntersectionPoint temp1 = head1;
        LLIntersectionPoint temp2 = head2;

        while (temp1!=temp2){
            temp1 = temp1.next;
            temp2 = temp2.next;

            if(temp1==temp2){
                return temp1;
            }
            if(temp1==null)
                temp1 = head2;
            if(temp2==null)
                temp2 = head1;
        }
        return temp1;
    }

    public static void print(LLIntersectionPoint head){
        LLIntersectionPoint temp = head;
        while(temp!=null){
            System.out.print(temp.data);
            temp = temp.next;
        }
    }
}
