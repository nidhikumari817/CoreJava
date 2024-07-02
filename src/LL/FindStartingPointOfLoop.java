package LL;

public class FindStartingPointOfLoop {

    int data;
    FindStartingPointOfLoop next;

    FindStartingPointOfLoop(int data,FindStartingPointOfLoop next){
        this.data = data;
        this.next = next;
    }

    /*public static FindStartingPointOfLoop insertion(int[] a){
        FindStartingPointOfLoop head = new FindStartingPointOfLoop(a[0]);
        FindStartingPointOfLoop temp = head;
        for(int i=1; i<a.length; i++){
            FindStartingPointOfLoop newNode = new FindStartingPointOfLoop(a[i]);
            temp.next = newNode;
            temp = temp.next;
        }
        return head;
    }*/

    public static FindStartingPointOfLoop findStartingPoint(FindStartingPointOfLoop head){
        FindStartingPointOfLoop fast = head;
        FindStartingPointOfLoop slow = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast==slow){
                fast = head;

                while(fast!=slow){
                    fast = fast.next;
                    slow = slow.next;
                }
                return fast;
            }

        }
        return null;
    }

    public static void print(FindStartingPointOfLoop fast){
        System.out.print("Starting point is = "+fast.data);
    }
}
