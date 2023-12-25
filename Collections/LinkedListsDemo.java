package Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListsDemo {
    
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(10);
        ll.add(20);
        //ll.add(30);
        //ll.add(40);
        // Iterator it = ll.iterator();
        // System.out.println(it);
        ll.offerFirst(100);
        System.out.println(ll.element());
        ll.offerFirst(150);
        System.out.println(ll.peek());
        //ll.remove();
        //ll.poll();

        for(int i=0; i<ll.size(); i++){
            System.out.println(ll.get(i));
        }
    }
}
