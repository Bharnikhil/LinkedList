package Linked_list;

public class Main_Reverse_DLL {
    public static void main(String[] args) {
        Reverse_a_DoublyLinkedList list= new Reverse_a_DoublyLinkedList();
        list.insert_beg(5);
        list.insert_beg(6);
        list.insert_beg(7);
        list.insert_beg(8);
        list.insert_beg(9);


        list.display_fromBeg();


        list.Reverse_Dll();
        list.display_fromBeg();

    }
}
