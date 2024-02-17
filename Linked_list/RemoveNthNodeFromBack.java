package Linked_list;

public class RemoveNthNodeFromBack {

        public ListNode removeNthFromEnd(ListNode head, int n) {
        /*
        // brute force approach
         if (head == null) {
            return null;
        }
         int cnt = 0;
        ListNode temp = head;

        // Count the number of nodes in the linked list
        while (temp != null) {
            cnt++;
            temp = temp.next;
        }
        // If N equals the total number of nodes, delete the head


        // modified
        if (cnt == n) {
            head=head.next;
            return head;
        }
        int res = cnt - n;
        temp = head;

        // Traverse to the node just before the one to delete
        while (temp != null) {
            res--;
            if (res == 0) {
                break;
            }
            temp = temp.next;
        }
         ListNode delNode = temp.next;
        temp.next = temp.next.next;
        delNode = null;
        return head;
        */
            // Create two pointers, fastp and slowp
            ListNode fastp = head;
            ListNode slowp = head;

            // Move the fastp pointer N nodes ahead
            for (int i = 0; i < n; i++){
                fastp = fastp.next;
            }
            if (fastp == null){
                return head.next;
            }
            while (fastp.next != null) {
                fastp = fastp.next;
                slowp = slowp.next;
            }
            // Delete the Nth node from the end
            ListNode delNode = slowp.next;
            slowp.next = slowp.next.next;
            delNode = null;
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


