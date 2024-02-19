package Linked_list;

public class sortLL_MergeSort {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode  middle=Middle(head);
        ListNode  lefthead=head;

        ListNode  righthead= middle.next;
        middle.next=null;

        ListNode  left=sortList(lefthead);
        ListNode  right=sortList(righthead);


        return mergetwoLists(left,right);





    }
    ListNode Middle(ListNode head){
        ListNode slow =head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        return slow;

    }
    ListNode mergetwoLists(ListNode  lefthead,ListNode  righthead){
        ListNode t1= lefthead;
        ListNode t2 = righthead;

        ListNode dummyNode= new ListNode(-1);

        ListNode temp = dummyNode;
        while(t1!=null && t2!=null){
            if(t1.val<=t2.val){
                temp.next=t1;
                temp=t1;
                t1=t1.next;
            }else{
                temp.next=t2;
                temp=t2;
                t2=t2.next;

            }



        }
        if(t1 != null) {
            temp.next = t1;
        }else {
            temp.next = t2;

        }


        return dummyNode.next;



    }
    public class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
