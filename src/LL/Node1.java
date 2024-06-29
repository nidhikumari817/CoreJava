package LL;

public class Node1 {
    int data;
    Node1 next;
    Node1 back;

    Node1(int data, Node1 next, Node1 back){
        this.data = data;
        this.next = next;
        this.back = back;
    }
    Node1(int data){
        this.data = data;
        this.next = null;
        this.back = null;
    }

    public static void print(Node1 head){
        while(head!=null){
            System.out.println(head.data);
            head = head.next;
        }
    }
    public static Node1 traversal(int[] b){                         //Inserting elements in Doubly Linked List
        Node1 head = new Node1(b[0]);
        Node1 prev = head;
        for(int i=1;i<b.length;i++){
            Node1 temp = new Node1(b[i],null,prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    public static Node1 deleteHead(Node1 head){                     //Deleting Head
        if(head==null || head.next==null)
            return null;
        Node1 temp = head;
        head = head.next;
        head.back = null;
        temp.next = null;
        return head;
    }

    public static Node1 deleteTail(Node1 head){                     //Deleting Tail
        if(head == null || head.next == null)
            return null;
        Node1 temp = head;
        while (temp.next!=null){
            temp=temp.next;
        }
        Node1 prev = temp.back;
        prev.next=null;
        temp.back=null;
        return head;
    }

    public static Node1 deletingElementByIndex(Node1 head, int i){       //Deleting Element by index
        if(head==null || head.next==null){
            return head;
        }
        int count = 0;
        Node1 temp = head;
        while(temp!=null){
            count++;
            if(count==i)
                break;
            temp=temp.next;
        }
        Node1 front= temp.next;
        Node1 prev = temp.back;

        if(prev==null && front==null) {
            return null;
        } else if (prev == null) {
            return deleteHead(head);
        } else if (front == null) {//Deleting head
            return deleteTail(head);
        }
        prev.next = front;
        front.back = prev;
        temp.back = null;
        temp.next = null;
        return head;
    }

    public static Node1 deletingByValue(Node1 head, int val){                   //Deleting Element by Value
        if(head==null || head.next==null){
            return head;
        }
        Node1 temp = head;
        while(temp!=null){
            if(temp.data == val)
                break;
            temp = temp.next;
        }
        Node1 prev = temp.back;
        Node1 front = temp.next;

        if(prev==null){
            return deleteHead(head);
        }
        if(front == null){
            return deleteTail(head);
        }
        prev.next = front;
        front.back = prev;
        temp.back = null;
        temp.next=null;
        return head;
    }

    public static Node1 insertionAtHead(Node1 head, int val){                    //Insertion at head by Value
        Node1 temp = head;
        Node1 newNode = new Node1(val);
        head = newNode;
        head.back=null;
        head.next = temp;
        temp.back = head;
        return head;
    }

    public static Node1 insertionAtTail(Node1 head, int el, int val){           //Insertion at tail by Value
        Node1 temp = head;
        while(temp!=null){
            if(temp.data == el){
                Node1 newNode = new Node1(val);
                Node1 prev = temp.back;
                newNode.next = temp;
                newNode.back = prev;
                prev.next=newNode;
                temp.back= newNode;
            }
            temp = temp.next;
        }
        return head;
    }

    public static Node1 insertionByValue(Node1 head, int el, int val ){        //Insertion by Value
        if(head==null){
            return new Node1(val);
        }
        Node1 temp = head;
        while(temp!=null){
            if(temp.data==el)
                break;
            temp = temp.next;
        }
        Node1 prev = temp.back;
        Node1 front = temp.next;

        if(prev==null && front==null){
            return insertionAtHead(head, val);
        }
        if(prev==null){
            return insertionAtHead(head, val);
        }
        if(front==null){
            return insertionAtTail(head, el, val);
        }
        Node1 newNode = new Node1(val);
        newNode.next = temp;
        temp.back = newNode;
        newNode.back = prev;
        prev.next = newNode;

        return head;
    }
}
