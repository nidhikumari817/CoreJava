package LL;

public class LLOddEvenIndex {
    int data;
    LLOddEvenIndex next;

    LLOddEvenIndex(int data, LLOddEvenIndex next){
        this.data = data;
        this.next = next;
    }
    LLOddEvenIndex(int data){
        this.data = data;
        this.next = null;
    }

    public static LLOddEvenIndex insertion(int[] a){
        LLOddEvenIndex head = new LLOddEvenIndex(a[0]);
        LLOddEvenIndex prev = head;
        for(int i=1;i<a.length;i++){
            LLOddEvenIndex newNode = new LLOddEvenIndex(a[i]);
            prev.next = newNode;
            prev = newNode;
        }
        return head;
    }

    public static LLOddEvenIndex oddEvenIndexingg(LLOddEvenIndex head){
        if(head == null || head.next==null){
            return head;
        }
        LLOddEvenIndex odd = head;
        LLOddEvenIndex even = head.next;
        LLOddEvenIndex evenhead = head.next;
        while(even!=null && even.next!=null){
            odd.next = odd.next.next;
            even.next = even.next.next;

            odd = odd.next;
            even = even.next;
        }
        odd.next = evenhead;

        return head;
    }

    public static LLOddEvenIndex print(LLOddEvenIndex head){
        LLOddEvenIndex temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        return head;
    }
}
