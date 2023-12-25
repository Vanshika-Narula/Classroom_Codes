package Collections;

import java.util.Collection;
import java.util.PriorityQueue;
class PriorityQueueDemo {
    
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue= new PriorityQueue<Integer>();
        priorityQueue.add(10);
        priorityQueue.add(20);
        priorityQueue.add(30);
        System.out.println(priorityQueue);
        for(int ele:priorityQueue){
            System.out.println(ele);
        }

    }
}
