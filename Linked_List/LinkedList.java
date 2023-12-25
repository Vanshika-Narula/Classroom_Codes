package Linked_List;

class Node {
    
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        this.next=null;

    }
}

public class LinkedList{
    Node head;

    void insertAtHead(int data){
        // check if the head is null
        if(head==null){
            head=new Node(data);
            return;
        }

        //create a new node with the given data and add it in the beginning
        Node newNode = new Node(data);
        newNode.next=head;
        head=newNode;

    }


    void deleteAtHead(){
        // consider head to be constant . and create a variable with the head as a refernce
        Node tmp=head;
        head=head.next;
        tmp.next=null;
    }

    void insertAtKthPosition(int data, int k){

        if(k==0){
            insertAtHead(data);
            return;
        }

        Node tmp = head;
        for(int i=0; i<(k-1); i++){
            tmp=tmp.next;
        }

        Node newNode=new Node(data);
        newNode.next=tmp.next;
        tmp.next=newNode;

    }


    void deleteAtKthPosition(int k){

        if(k==0){
            deleteAtHead();
            return;
        }

        Node tmp=head;
        for(int i=0; i<(k-1); i++){
            if(tmp!=null)
                tmp=tmp.next;
        }

        Node nodeToBeDeleted=tmp.next;
        tmp.next=nodeToBeDeleted.next;
        nodeToBeDeleted.next=null;
    }

    void display(){
        Node tmp=head;
        while(tmp!=null){
            System.out.print(tmp.data+" ");
            tmp=tmp.next;
        }
    }

    
    
    void insertAtTail(int data){

        if(head==null){
            head=new Node(data);
            return;
        }

        Node tmp=head;
        while(tmp.next!=null){
            tmp=tmp.next;
        }

        Node newNode=new Node(data);
        tmp.next=newNode;
    }

    int getKthNode(int k){
        Node tmp = head;
        for(int i=1; i<=k; i++){
            tmp=tmp.next;
        }

        return tmp.data;
    }

    static Node getKthNodeFromLast(Node head, int k){
        Node slow = head;
        Node fast = head;

        for(int i=1; i<=k; i++)
            fast=fast.next;
        
            while(fast!=null){
                slow=slow.next;
                fast=fast.next;
            }

        return slow;
    }

    static Node getMidPt(Node head){
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow;
    }

    int getLength(){
        int cnt=0;

        Node tmp=head;
        while(tmp!=null){
            tmp=tmp.next;
            cnt++;
        }
        return cnt;

    }

}


// kth node from end
// cycle check
// cycle removal
// slow - fast approach
// middle= length/2 approach