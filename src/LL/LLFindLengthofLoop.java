package LL;

public class LLFindLengthofLoop {
    int data;
    LLFindLengthofLoop next;

    LLFindLengthofLoop(int data){
        this.data = data;
        this.next = null;
    }

    public static LLFindLengthofLoop insertion(int[] a){
        LLFindLengthofLoop head = new LLFindLengthofLoop(a[0]);
        LLFindLengthofLoop temp = head;
        for(int i=0; i<a.length; i++){
            LLFindLengthofLoop newNode = new LLFindLengthofLoop(a[i]);
            temp.next = newNode;
            temp = temp.next;
        }
        return head;
    }

    public static int findLength(LLFindLengthofLoop head){
        LLFindLengthofLoop fast = head;
        LLFindLengthofLoop slow = head;

        int count=0;

        while(fast.next!=null && fast!=null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                count = findLength(slow,fast);
            }
        }
        return count;
    }

    public static int findLength(LLFindLengthofLoop slow, LLFindLengthofLoop fast){      //Finding length of the loop in linkedlist
        int count=1;
        fast = fast.next;
        while(slow!=fast){
            count ++;
            fast = fast.next;
        }
        return count;
    }

    public static void print(int count){
        System.out.print("Count of loop in Linked List = "+count);
    }
}
