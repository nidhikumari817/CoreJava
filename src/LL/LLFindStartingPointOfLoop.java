package LL;

public class LLFindStartingPointOfLoop {

    int data;
    LLFindStartingPointOfLoop next;

    LLFindStartingPointOfLoop(int data, LLFindStartingPointOfLoop next){
        this.data = data;
        this.next = next;
    }

    /*public static LLFindStartingPointOfLoop insertion(int[] a){
        LLFindStartingPointOfLoop head = new LLFindStartingPointOfLoop(a[0]);
        LLFindStartingPointOfLoop temp = head;
        for(int i=1; i<a.length; i++){
            LLFindStartingPointOfLoop newNode = new LLFindStartingPointOfLoop(a[i]);
            temp.next = newNode;
            temp = temp.next;
        }
        return head;
    }*/

    public static LLFindStartingPointOfLoop findStartingPoint(LLFindStartingPointOfLoop head){
        LLFindStartingPointOfLoop fast = head;
        LLFindStartingPointOfLoop slow = head;

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

    public static void print(LLFindStartingPointOfLoop fast){
        System.out.print("Starting point is = "+fast.data);
    }
}
