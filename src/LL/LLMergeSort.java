package LL;

public class LLMergeSort {
    int data;
    LLMergeSort next;

    LLMergeSort(int data, LLMergeSort next){
        this.data = data;
        this.next = next;
    }
    LLMergeSort(int data){
        this.data = data;
        this.next = null;
    }

    public static LLMergeSort insertion(int[] a){
        LLMergeSort head = new LLMergeSort(a[0]);
        LLMergeSort temp = head;
        for(int i=1; i<a.length; i++){
            LLMergeSort newNode = new LLMergeSort(a[i]);
            temp.next = newNode;
            temp = temp.next;
        }
        return head;
    }

    public static LLMergeSort mergeSortedLL(LLMergeSort head1, LLMergeSort head2){
        LLMergeSort temp1 = head1;
        LLMergeSort temp2 = head2;
        LLMergeSort dummyNode = new LLMergeSort(-1);
        LLMergeSort currNode = dummyNode;

        while(temp1!=null && temp2!=null){
            if(temp1.data < temp2.data){
                currNode.next = temp1;
                currNode = currNode.next;
                temp1 = temp1.next;
            } else{
                currNode.next = temp2;
                currNode = currNode.next;
                temp2 = temp2.next;
            }
        }
        if(temp1!=null){
            currNode.next = temp1;
        }
        else{
            currNode.next = temp2;
        }
        return dummyNode.next;
    }

    public static void print(LLMergeSort head){
        LLMergeSort temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}

