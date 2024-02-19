package Linked_list;

public class sort0_1_2_bruteForce {
    public static Node sortList(Node head) {
        // Write your code here
        Node temp= head;
        int count0=0;
        int count1=0;
        int count2=0;

        while(temp!=null){
            if(temp.data==0){
                count0+=1;
            }else if(temp.data==1){
                count1+=1;
            }else{
                count2+=1;

            }
            temp=temp.next;


        }

        temp =head;
        while(temp!=null){
            while(count0!=0){
                temp.data=0;
                count0--;
                temp=temp.next;
            }
            while(count1!=0){
                temp.data=1;
                count1--;
                temp=temp.next;
            }
            while(count2!=0){
                temp.data=2;
                count2--;
                temp=temp.next;
            }
        }
        return head;
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
