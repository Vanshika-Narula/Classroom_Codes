package Linked_List;

import java.util.List;

class ListNode{
    int data;
    ListNode next;
    ListNode(int x){
        data=x;
        next=null;
    }
}
public class detectCycle {
    public boolean hasCycle(ListNode head){
        if(head==null){
            return false;
        }

        ListNode slow=head;
        ListNode fast=head.next;

        while(slow!=fast){
            if(fast==null || fast.next!=null)
                return false;
            
            slow=slow.next;
            fast=fast.next.next;
        }
        return true;
    }


    public static void main(String[] args) {
        
    }

}
