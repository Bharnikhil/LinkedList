package Linked_list;

public class sort0_1_2_optimised {
    public  Node sortList(Node head){
        if(head==null || head.next==null){
            return head;

        }
        Node temp= head;
        Node zeroHead= new Node(-1);
        Node oneHead= new Node(-1);
        Node twoHead= new Node(-1);

        Node zero=zeroHead;
        Node one=oneHead;
        Node two=twoHead;

        while(temp!=null){
            if(temp.data==0){
                zero.next=temp;
                zero=zero.next;



            }else if(temp.data==1){
                one.next=temp;
                one=one.next;

            }else{
                two.next=temp;
                two=two.next;

            }
            temp=temp.next;

        }
        zero.next = (oneHead.next != null) ? oneHead.next : twoHead.next;
        one.next=twoHead.next;
        two.next=null;

        Node newHead= zeroHead.next;
        return newHead;


    }
    class Node {
        public int data;
        public Node next;

        Node()
        {
            this.data = 0;
            this.next = null;
        }

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }

        Node(int data, Node next)
        {
            this.data = data;
            this.next = next;
        }
    }

}
