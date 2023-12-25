package Queues;

class QueueClient {
    
    public static void main(String[] args) {
        QueueDemo Queue= new QueueDemo(3);

        try{
        //Queue.EnQueue(1);
        Queue.EnQueue(2);
        Queue.EnQueue(3);
        Queue.deQueue();
        Queue.deQueue();

        // Exception came
        Queue.EnQueue(4);

        Queue.deQueue();
        Queue.display();
        }

        catch(Exception e){
            System.out.println(e);
        }
        
    }
}
