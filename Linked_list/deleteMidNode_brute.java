package Linked_list;

public class deleteMidNode_brute {
    public ListNode deleteMiddle(ListNode head) {

        if(head==null || head.next==null){
            head=null;
            return head;
        }
        int counter =0;
        ListNode temp=head;
        while(temp!=null){
            counter++;
            temp=temp.next;
        }
        int middle= counter/2;
        ListNode temp2=head;
        ListNode temp3= head.next;
        int count=middle;
        while((count-1)!=0){
            temp2=temp2.next;
            temp3=temp3.next;
            count-=1;
        }
        temp2.next=temp3.next;
        temp3.next=null;


        return head;



    }
    public class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
