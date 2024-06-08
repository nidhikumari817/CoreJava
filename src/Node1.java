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


}
