package LL;

public class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    public static Node traversal(int a[]) {                                     //Converting array into Singly linkedList
        Node head = new Node(a[0]);
        Node mover = head;
        for (int i = 1; i < a.length; i++) {
            Node temp = new Node(a[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public static void findSizeOfLinkedList(Node head){                        //Finding Length of Linkedlist
        int count=0;
        Node temp = head;
        while(temp!=null) {
            count++;
            temp = temp.next;
        }
        System.out.println("Size of Linked List = "+count);
    }

    public static int checkIfPresent(Node head, int val){                      //Finding element in Linkedlist
        Node temp = head;
        while(temp!=null){
            if(temp.data==val)
                return 1;
            temp=temp.next;
        }
        return 0;
    }

    public static Node removeHead(Node head){                                   //Deleting head
        Node temp = head;
        head = head.next;
        return head;
    }

    public static Node removeTail(Node head){                                   //Removing tail
        if(head == null || head.next==null){
            return null;
        }
        Node temp = head;
        while(temp.next.next!=null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    public static Node removeElementByIndex(Node head, int k){                 //Remove element through index
        //Deleting kth element
        if(head==null){
            return head;
        }
        if(k==1) {
            return removeHead(head);                                          //Remove head
        }else{
            Node temp = head;
            Node prev = null;
            int counter=0;
            while(temp!=null){
                counter ++;
                if(counter == k){
                    prev.next = temp.next;
                    break;
                }
                prev = temp;
                temp = temp.next;
            }
        }
        return head;
    }

    public static Node removeElementByValue(Node head, int val){                //Removing element through value
        if(head == null){
            return head;
        }
        if(head.data == val){
            Node temp = head;
            head = head.next;
        }
        else{
            Node temp = head;
            Node prev = null;
            while(temp!=null){
                if(temp.data == val){
                    prev.next = temp.next;
                    break;
                }
                prev = temp;
                temp = temp.next;
            }
        }
        return head;
    }

    public static Node insertElementAtHead(Node head, int val){                     //Inserting element at head
        if(head == null){
            return new Node(val);
        }
        Node temp = new Node(val, head);
        return temp;
    }

    public static Node insertElementAtTail(Node head, int val){                     //Inserting element at tail
        if(head == null){
            return new Node(val);
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        Node newNode = new Node(val);
        temp.next = newNode;
        return head;
    }

    public static Node insertElementByIndex(Node head, int i, int val){             //Inserting element on the basis of index
        if(head==null){
            if(i==1){
                return new Node(val);
            }
            else{
                System.out.println("No");
            }
        }else if (i == 1) {
            return new Node(val, head);
        }
        else {
            int count=0;
            Node temp = head;
            while(temp!=null){
                count++;
                if(count == i-1){
                    Node n = new Node(300);
                    n.next= temp.next;
                    temp.next = n;
                    break;
                }
                temp = temp.next;
            }
        }
        return head;
    }

    public static Node insertElementBeforeValue(Node head, int el, int val){            //Inserting element before the value
        if(head == null){
            return null;
        } else if (head.data == el) {
            return new Node(val,head);
        }
        else{
            Node temp = head;
            Node prev = null;
            while(temp!=null){
                if(temp.data==el)
                {
                    Node current = new Node(val);
                    current.next = prev.next;
                    prev.next = current;
                }
                prev = temp;
                temp = temp.next;
            }
        }
        return head;
    }
}
