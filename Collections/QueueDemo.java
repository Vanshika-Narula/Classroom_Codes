package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    
    public static void main(String[] args) {
        
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.remove();
        queue.remove();
        System.out.println(queue.peek());
        System.out.println(queue);

    }
}
