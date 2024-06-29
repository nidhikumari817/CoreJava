package LL;

public class DLLRemoveDuplicates {
    int data;
    DLLRemoveDuplicates back;
    DLLRemoveDuplicates next;

    DLLRemoveDuplicates(int data, DLLRemoveDuplicates back, DLLRemoveDuplicates next){
        this.data = data;
        this.back = back;
        this.next = next;
    }
    DLLRemoveDuplicates(int data){
        this.data = data;
        this.back = null;
        this.next = null;
    }

    public static DLLRemoveDuplicates insertion(int a[]){
        DLLRemoveDuplicates head = new DLLRemoveDuplicates(a[0]);
        DLLRemoveDuplicates temp = head;
        for(int i=1; i<a.length; i++){
            DLLRemoveDuplicates newNode = new DLLRemoveDuplicates(a[i], temp, null);
            temp.next = newNode;
            temp = temp.next;
        }
        return head;
    }

    public static DLLRemoveDuplicates removeDuplicateNodes(DLLRemoveDuplicates head){
        DLLRemoveDuplicates temp = head;
        while (temp.next!=null){
            if(temp.data == temp.next.data){
                DLLRemoveDuplicates currNode = temp.next;
                temp.next = currNode.next;
                currNode.next.back = temp;
                currNode.back = null;
                currNode.next = null;
                temp = temp.next;
            }
            else{
                temp = temp.next;
            }
        }
        return head;
    }

    public static void print(DLLRemoveDuplicates head){
        DLLRemoveDuplicates temp = head;
        while(temp!=null){
            System.out.print(temp.data);
            temp = temp.next;
        }
    }
}
