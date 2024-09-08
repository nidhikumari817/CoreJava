package LL;

public class LLSorting {

    int data;
    LLSorting next;

    LLSorting(int data, LLSorting next){
        this.data = data;
        this.next = next;
    }
    LLSorting(int data){
        this.data = data;
        this.next = null;
    }

    public static LLSorting insertion(int[] a){
        LLSorting head = new LLSorting(a[0]);
        LLSorting prev = head;
        for(int i=1;i<a.length;i++){
            LLSorting newNode = new LLSorting(a[i]);
            prev.next = newNode;
            prev = newNode;
        }
        return head;
    }

    public static LLSorting optimisedSorting(LLSorting head){
        LLSorting temp = head;
        LLSorting zeroHead = new LLSorting(-1);
        LLSorting oneHead = new LLSorting(-1);
        LLSorting twoHead = new LLSorting(-1);
        LLSorting zero = zeroHead;
        LLSorting one = oneHead;
        LLSorting two = twoHead;
        while(temp!=null){
            if(temp.data==0){
                zero.next = temp;
                zero=zero.next;
            } else if (temp.data==1) {
                one.next = temp;
                one=one.next;
            }else if (temp.data==2){
                two.next = temp;
                two=two.next;
            }
            temp = temp.next;
        }
        if(oneHead.next!=null){
            zero.next = oneHead.next;
        }else {
            zero.next = twoHead.next;
        }
        one.next = twoHead.next;
        two.next = null;

        return zeroHead.next;
    }

    public static LLSorting print(LLSorting head){
        LLSorting temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        return head;
    }
}
