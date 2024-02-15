package Linked_list;

public class DoublyLL {
    Node head;
    int size;
    Node tail;

    public DoublyLL() {
        this.size = 0;
        this.head = null;
        this.tail = null;

    }

    public class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
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
        size++;


    }

    public void display_fromBeg() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void display_fromEnd() {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.prev;
        }
        System.out.println("START");


    }

    public void insert_end(int value) {
        Node node_end = new Node(value);
        Node temp = head;
        node_end.next = null;
        if (head == null) {
            node_end.prev = null;
            head = node_end;
            return;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node_end;
        node_end.prev = temp;
        size++;


    }

    public Node Find(int index) {
        Node temp = head;

        for (int i = 1; i < index; i++) {
            if (temp.next != null) {
                temp = temp.next;

            }


        }
        return temp;

    }

    public void insert_mid(int value, int index) {
        Node node_mid = new Node(value);
        Node prev_node = Find(index);
        if (prev_node != null) {
            node_mid.next = prev_node.next;
            prev_node.next = node_mid;
            node_mid.prev = prev_node;
            if (prev_node.next != null) {
                prev_node.next.prev = node_mid;
            } else {
                insert_end(value);
            }


            size++;
        }
    }

    public void delete_beg() {
        if (head == null) {
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
            return;
        }
        Node temp = head;
        head = head.next;
        head.prev = null;
        temp.next = null;
        size--;
    }

    public void delete_end() {
        if (head == null || head.next==null) {
            head= null;
            return;
        }
        if (head == tail) {
            head = tail = null;
            size--;
            return;

        }

        Node tail = head;
        while(tail.next!=null){
            tail=tail.next;

        }
        Node back=tail.prev;
        tail.prev=null;
        back.next=null;
        size--;

    }
    public void delete_mid(int index){
        if(index<1 || index>size){
            System.out.println("give correct index ");
            return;
        }
        if(head==null){
            return;
        }
        if(head==tail){  // edge case 1
            head=null;
            tail=null;
            size--;
        }

        Node temp =head;
        int counter=0;
        while(temp!=null){
            counter+=1;
            if(counter==index){
                break;
            }
            temp=temp.next;
        }
        Node Next=temp.next;
        Node Back = temp.prev;


        if(Back==null){
            delete_beg();
            return;

        }
        if(Next==null){
            delete_end();
            return;

        }
        Back.next=Next;
        Next.prev=Back;
        temp.next=null;
        temp.prev=null;
        size--;

    }
}

