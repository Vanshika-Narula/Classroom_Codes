package Queues;

import java.security.DrbgParameters.Capability;

public class CircularQueue {
    
    int[] arr;
    int front;
    int size;

    public CircularQueue(int capacity)
    {
        arr= new int[capacity];
        front=0;
        size=0;

    }

    boolean isEmpty()
    {
        if(size==0)
            return true;
        
        return false;
    }

    boolean isFull()
    {
        if(size==arr.length)
            return true;
        
        return false;

    }

    void EnQueue(int ele) throws Exception
    {
        if(isFull())
            throw new Exception("Queue is Full. Can't enQueue");
        
        int idx = (front+size)%arr.length;
        arr[idx]=ele;
        size++;

    }

    int deQueue() throws Exception
    {
        if(isEmpty())
            throw new Exception("Queue is Empty. Can't deQueue anymore");
        
        int deletedELe=arr[front];
        front++;
        if(front==arr.length)
            front=0;

        return deletedELe;
        
    }

    int getFront() throws Exception
    {
        if(isEmpty())
            throw new Exception("Queue is Emptyy !!");
            
        return arr[front];
    }

}
