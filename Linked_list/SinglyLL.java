package Linked_list;
class SinglyLL {
    private Node head;
    private Node tail;
    private int size;

    public SinglyLL(){
        this.size=0;
    }
    public void insert_at_beg(int value){
        Node node_beg= new Node(value);
        node_beg.next=head;
        head=node_beg;

        if(tail==null){
            tail=head;
        }
        size+=1;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println("END");
    }
    public void insert_at_end(int value){
        Node node_end = new Node(value);
        if(tail==null){
            insert_at_beg(value);
            return;
        }
        tail.next=node_end;
        node_end=tail;
        size++;


    }
    public void insert_mid(int value,int index){
        if(index==0 || tail==null){
            insert_at_beg(value);
            return;
        }
        if(index==size){
            insert_at_end(value);
            return;
        }
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;

        }
        Node node_mid= new Node(value,temp.next);
        temp.next=node_mid;
        size++;

    }
    public void delete_beg(){
        if(head==null && tail==null){
            System.out.println("linked list is empty ");

        }

        head=head.next;
        if(head==null){
            tail=null;
        }



        size--;

    }
    public Node  get(int index){
        Node node= head;
        for (int i = 0; i < index; i++) {
            node=node.next;

        }
        return node;
    }
    public void delete_end(){
        if(size<=1){
            delete_beg();
        }
        Node secondLast=get(size-2);
        tail=secondLast;
        tail.next=null;
        size--;


    }
    public void delete_mid(int index){
        if(index==0){
            delete_beg();
        }
        if(index==size-1){
            delete_end();
        }
        Node temp=head;
        Node temp2=head.next;
        for (int i = 1; i <index ; i++) {
            temp=temp.next;
            temp2=temp2.next;

        }
        temp.next=temp2.next;
        temp2.next=null;
        size--;


    }
    public Node  Find(int value){
        Node node= head;
        int count=0;
        while(node!=null){
            if(node.value==value){
                System.out.println(count);
                return node;

            }
            node=node.next;
            count+=1;

        }
        return null;
    }
    private class Node{
        int value;
        Node next;

        public  Node(int value){
            this.value=value;

        }
        public Node(int value ,Node next){
            this.value= value;
            this.next=next;
        }

    }
}
