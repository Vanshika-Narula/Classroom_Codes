package Linked_List;
import java.util.*;
public class LinkedListClient {
    static Node detectCycle(Node head)
    {
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast)
            return fast;
        }
        return null;
    }

    static boolean searchLL(Node head, int value){
        Node tmp=head;
        while(tmp.next!=null){
            tmp=tmp.next;
            if(tmp.data==value){
                return true;
            }
        }

        return false;
    }


    static void removeCycle(Node head,Node meetingNode)
    {
        Node slow=head;
        Node fast=meetingNode;
        Node prev=null;

        while(fast!=slow)
        {
            slow=slow.next;
            prev=fast;
            fast=fast.next;
        }
        prev.next=null;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.insertAtHead(10);
        ll.insertAtHead(20);
        ll.insertAtHead(30);
        ll.insertAtHead(40);
        // 40 30 20 10 null

        //ll.insertAtTail(50);
        // 40 30 20 10 50 null

        //ll.deleteAtHead();
        // 30 20 10 50 null

        //ll.deleteAtKthPosition(2);
        // 30 20 50 null

        //ll.insertAtKthPosition(100,2 );
        // 40 30 100 20 10 50 null

        //System.out.println( ll.getKthNode(3));

        // int value= getKthNodeFromLast(ll.head,2);
        // System.out.println(value);

        // int midValue=getMidPt(ll.head).data;
        // System.out.println(midValue);
        // ll.display();
        // int len=ll.getLength();
        // System.out.println(len);
        

        // ll.head.next.next.next.next=ll.head.next;
        

        // System.out.println(detectCycle(ll.head).data);

        // Node meetingNode=detectCycle(ll.head);

        // //removeCycle(ll.head, meetingNode);


        // System.out.println(" ");
        // System.out.println(searchLL(ll.head, 1));

        //ll.display();


    }  
}
