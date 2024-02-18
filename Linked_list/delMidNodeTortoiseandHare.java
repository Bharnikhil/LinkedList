package Linked_list;

public class delMidNodeTortoiseandHare {
    public ListNode deleteMiddle(ListNode head){
        if(head==null || head.next==null){
            head=null;
            return head;
        }
        ListNode slow= head;
        ListNode fast = head;

        fast=head.next.next;

        while(fast!=null && fast.next!=null){
            slow= slow.next;
            fast = fast.next.next;
        }



        slow.next=slow.next.next;


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
