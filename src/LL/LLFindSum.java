package LL;

public class LLFindSum {
    int data;
    LLFindSum next;

    LLFindSum(int data, LLFindSum next){
        this.data = data;
        this.next = next;
    }
    LLFindSum(int data){
        this.data = data;
        this.next = null;
    }

    public static LLFindSum insertion(int[] a){
        LLFindSum head = new LLFindSum(a[0]);
        LLFindSum prev = head;
        for(int i=1;i<a.length;i++){
            LLFindSum newNode = new LLFindSum(a[i]);
            prev.next = newNode;
            prev = newNode;
        }
        return head;
    }
    public static LLFindSum sum(LLFindSum head1, LLFindSum head2){
        LLFindSum dummyHead = new LLFindSum(-1);
        LLFindSum current = dummyHead;
        LLFindSum temp1 = head1;
        LLFindSum temp2 = head2;
        int carry = 0;
        while(temp1!=null || temp2!=null){
            int sum = carry;
            if(temp1!=null){
                sum += temp1.data;
            }
            if(temp2!=null){
                sum += temp2.data;
            }
            LLFindSum newNode = new LLFindSum(sum%10);
            carry = sum/10;

            current.next = newNode;
            current = current.next;

            if(temp1!=null){
                temp1 = temp1.next;
            }
            if(temp2!=null){
                temp2 = temp2.next;
            }
        }
        if(carry>0){
            LLFindSum newNode = new LLFindSum(carry);
            current.next = newNode;
        }
        return dummyHead.next;
    }

    public static void print(LLFindSum head){
        LLFindSum temp = head;
        while (temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
