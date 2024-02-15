package Linked_list;
import java.util.*;

public class Reverse_a_DoublyLinkedList {
    // brute force solution
    // classical approach  of time comp O(2N) and space comp of O(N)
    Node head;
    public Reverse_a_DoublyLinkedList(){
        this.head=null;
    }

    public class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
            this.next = null;
            this.prev = null;


        }


        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

        public void insert_beg(int value) {
            Node node_beg = new Node(value);
            node_beg.next = head;
            node_beg.prev = null;
            if (head != null) {
                head.prev = node_beg;
            }
            head = node_beg;
        }

        public void display_fromBeg() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.value + "->");
                temp = temp.next;
            }
            System.out.println("END");
        }
        public void Reverse_Dll(){
        Node temp = head;
        Stack<Integer> stk = new Stack<>();
        while(temp!=null){
            stk.push(temp.value);
            temp=temp.next;
        }
        Node temp2=head;
        while(temp2!=null && !stk.isEmpty()){
            temp2.value = stk.pop();
            temp2 = temp2.next;

        }



        }

    }

