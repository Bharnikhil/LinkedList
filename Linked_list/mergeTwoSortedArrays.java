package Linked_list;

public class mergeTwoSortedArrays {
    public  LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
        // Write your code here.
        LinkedListNode<Integer> t1= first;
        LinkedListNode<Integer> t2 = second;

        LinkedListNode<Integer> dummyNode= new LinkedListNode<Integer>(-1);

        LinkedListNode<Integer> temp = dummyNode;

        while(t1!=null && t2!=null){
            if(t1.data<=t2.data){
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
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }
}
