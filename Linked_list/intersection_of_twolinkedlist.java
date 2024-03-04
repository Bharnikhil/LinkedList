public class intersection_of_twolinkedlist {
    int val;
    intersection_of_twolinkedlist next;

    intersection_of_twolinkedlist(int x) {
        val = x;
        next = null;
    }

    public class Solution {
        public intersection_of_twolinkedlist getIntersectionNode(intersection_of_twolinkedlist headA, intersection_of_twolinkedlist headB) {
            while (headB != null) {
                intersection_of_twolinkedlist tempA = headA;
                while (tempA != null) {
                    if (tempA == headB) {
                        return headB;
                    }
                    tempA = tempA.next;
                }
                headB = headB.next;
            }
            return null;


        }
    }
}

