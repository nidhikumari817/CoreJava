package LL;

public class LLFindMiddleNode {
    int data;
    LLFindMiddleNode next;

    LLFindMiddleNode(int data, LLFindMiddleNode next){
        this.data = data;
        this.next = next;
    }
    LLFindMiddleNode(int data){
        this.data = data;
        this.next = null;
    }

    public static LLFindMiddleNode insertion(int[] a){
        LLFindMiddleNode head = new LLFindMiddleNode(a[0]);
        LLFindMiddleNode temp = head;
        for(int i=1; i<a.length; i++){
            LLFindMiddleNode newNode = new LLFindMiddleNode(a[i]);
            temp.next = newNode;
            temp = temp.next;
        }
        return head;
    }

    public static int findMiddleNode(LLFindMiddleNode head){                                    //Brute Force
        LLFindMiddleNode temp = head;
        int count = 0;
        while (temp!=null){
            temp = temp.next;
            count++;
        }
        int midNode = (count/2)+1;
        temp=head;
        while(temp!=null){
            midNode--;
            if(midNode==0)
                break;
            temp = temp.next;
        }
        return temp.data;
    }

    public static int findMidNode(LLFindMiddleNode head){
        LLFindMiddleNode fast = head;
        LLFindMiddleNode slow = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.data;
    }

    public static void print(int mid){
        System.out.print("Middle node is : "+mid);
    }
}
