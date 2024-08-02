package LL;

public class LLDeleteLoop {
    int data;
    LLDeleteLoop next;

    LLDeleteLoop(int data, LLDeleteLoop next){
        this.data = data;
        this.next = next;
    }
    LLDeleteLoop(int data){
        this.data = data;
        this.next = null;
    }

    public static LLDeleteLoop insertion(int[] a){
        LLDeleteLoop head = new LLDeleteLoop(a[0]);
        LLDeleteLoop temp = head;

        for(int i=0; i<a.length; i++){
            LLDeleteLoop newNode = new LLDeleteLoop(a[i]);
            temp.next = newNode;
            temp = temp.next;
        }
        return head;
    }

    public static LLDeleteLoop deleteLoop(LLDeleteLoop head){
        LLDeleteLoop fast = head;
        LLDeleteLoop slow = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast==slow){
                fast = head;
                while(fast!=slow){
                    fast = fast.next;
                    slow = slow.next;
                }
                while(fast.next!=slow){
                    fast = fast.next;
                }
                fast.next = null;
            }
        }
        return head;
    }

    public static void print(LLDeleteLoop head){
        LLDeleteLoop temp = head;
        while(temp!=null){
            System.out.print(temp.data);
            temp = temp.next;
        }
    }
}
