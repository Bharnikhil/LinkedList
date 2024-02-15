package Linked_list;

import java.util.HashMap;

public class DetectLoopLL_iterative {
    Node head;
    DetectLoopLL_iterative() {
        this.head = null;
    }
    class Node{
        // Data stored in the node
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
        public Node(int data ,Node next){
            this.data=data;
            this.next=next;
        }

    }
    // Function to insert a new node at the end of the linked list
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
        // Initialize a pointer 'temp'
        // at the head of the linked list
        Node temp = head;

        // Create a map to keep track
        // of encountered nodes

        HashMap<Node,Integer> map = new HashMap<>();
        while (temp!=null){
            // If the node is already in
            // the map, there is a loop
          if(map.containsKey(temp)){
              return true;
          }
            // Store the current node in the map
            map.put(temp, 1);
          temp=temp.next;
        }
        return false;
    }

    public static void main(String[] args) {
        DetectLoopLL_iterative list = new DetectLoopLL_iterative();
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
