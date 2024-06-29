package LL;

public class LLRemoveDuplicates {
    int data;
    LLRemoveDuplicates next;

    LLRemoveDuplicates(int data, LLRemoveDuplicates next){
        this.data = data;
        this.next = next;
    }
    LLRemoveDuplicates(int data){
        this.data = data;
        this.next = null;
    }
    public static LLRemoveDuplicates insertion(int[] a){
        LLRemoveDuplicates head = new LLRemoveDuplicates(a[0]);
        LLRemoveDuplicates temp = head;
        for(int i=1; i<a.length; i++){
            LLRemoveDuplicates newNode = new LLRemoveDuplicates(a[i]);
            temp.next = newNode;
            temp = temp.next;
        }
        return head;
    }

    public static LLRemoveDuplicates removeDuplicateNodes(LLRemoveDuplicates head){
        LLRemoveDuplicates temp = head;
        while(temp.next!=null){
            if(temp.data == temp.next.data){
                temp.next = temp.next.next;
            }
            else {
                temp = temp.next;
            }
        }
        return head;
    }

    public static void print(LLRemoveDuplicates head){
        LLRemoveDuplicates temp = head;
        while(temp!=null){
            System.out.print(temp.data);
            temp = temp.next;
        }
    }
}
