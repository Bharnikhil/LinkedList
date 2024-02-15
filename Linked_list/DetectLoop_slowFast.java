package Linked_list;

public class DetectLoop_slowFast {
    Node head;
    DetectLoop_slowFast() {
        this.head = null;
    }
    public class Node{
        int data;
        // Pointer to the next node in the list
        Node next;
        // Constructor with only data as
        // a parameter, sets next to null
        public Node(int data){
            this.data=data;
            this.next=null;
        }
        // Constructor with both data
        // and next node as parameters
        public Node(int data , Node next){
            this.data=data;
            this.next=next;
        }

    }
    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public Boolean getLoop(){
        Node slow= head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            if(slow== head){
                return true;
            }
            slow=slow.next;
            fast=fast.next.next;

        }
        return false;
    }

    public static void main(String[] args) {
        DetectLoop_slowFast list = new DetectLoop_slowFast();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        // Forming a loop by connecting the last node to the second node

        Node lastNode = list.head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = list.head.next;


        boolean ans= list.getLoop();
        System.out.println(ans);
    }


}

