public class intersectionLL_difference_approach {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int A1= 0;
        int B1=0;

        ListNode tempA= headA;
        ListNode tempB = headB;

        while(tempA!=null){
            A1+=1;
            tempA=tempA.next;

        }
        while(tempB!=null){
            B1+=1;
            tempB=tempB.next;

        }
        tempA=headA;
        tempB=headB;


        if(A1>B1){
            return collision(tempA,tempB,A1-B1);
        }else{
            return collision(tempB,tempA,B1-A1);

        }
    }
    public ListNode collision(ListNode A,ListNode B,int D){

        while(D!=0){

            A=A.next;
            D-=1;
        }
        while(A!=B){
            A=A.next;
            B=B.next;
        }
        return A;
    }
}
