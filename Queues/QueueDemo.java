package Queues;

import java.util.concurrent.ExecutionException;

// Insertion at rear, deletion at front

class QueueDemo 
{
    int[] arr;
    int front;
    int rear;

    // constructor: when an object is called to initialise the data members
    public QueueDemo(int capacity)
    {
        arr=new int[capacity];
        front=-1;
        rear=-1;
    }

    boolean isFull()
    {
        if(rear==arr.length-1)
          return true;
        
        return false;
    }

    boolean isEmpty()
    {
        if(front==-1 && rear==-1)
            return true;

        return false;
    }

    void EnQueue(int ele) throws Exception
    {
        if(isFull())
            throw new Exception("Queue is Full, can't enqueue");
        
        if(isEmpty())
        {
            front++;
            //rear++;
        }
        //rear++;
        arr[++rear]=ele;
    }

    int deQueue() throws Exception
    {
        if(isEmpty())
            throw new Exception("Queue is Empty, can't dequeue");
        
        int deletedELe=arr[front];
        front++; // deletion

        if(front>rear)
        {
            front=-1;
            rear=-1;
        }

        return deletedELe;
    }
    
    int getFront() throws Exception
    {
        if(isEmpty())
            throw new Exception("Queue is Empty!!");

        return arr[front];
    }

    void display() throws Exception
    {

        if(isEmpty())
            throw new Exception("Queue is EMptyy !!");
        for(int i=front; i<=rear; i++){
            System.out.println(arr[i]+" ");
        }
    }

}
