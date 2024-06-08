public class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    public static Node traversal(int a[]) {
        Node head = new Node(a[0]);
        Node mover = head;
        for (int i = 1; i < a.length; i++) {
            Node temp = new Node(a[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public static int checkIfPresent(Node head, int val){
        Node temp = head;
        while(temp!=null){
            if(temp.data==val)
                return 1;
            temp=temp.next;
        }
        return 0;
    }

    public static Node removeHead(Node head){
        Node temp = head;
        head = head.next;
        return head;
    }

    public static Node removeTail(Node head){
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

    public static Node removeElementByIndex(Node head, int k){
        //Deleting kth element
        if(head==null){
            return head;
        }
        if(k==1){
            Node temp = head;
            head = head.next;
        }
        else{
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

    public static Node removeElementByValue(Node head, int val){
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
}
