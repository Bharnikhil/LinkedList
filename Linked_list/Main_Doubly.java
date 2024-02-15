package Linked_list;

public class Main_Doubly {
    public static void main(String[] args) {
        DoublyLL list= new DoublyLL();
         list.insert_beg(3);
         list.insert_beg(2);
         list.insert_beg(8);
         list.insert_beg(17);

         list.display_fromBeg();

         list.display_fromEnd();

         list.insert_end(99);
         list.display_fromBeg();


         list.insert_mid(33,2);
         list.display_fromBeg();


         list.delete_beg();
         list.display_fromBeg();

         list.delete_end();
         list.display_fromBeg();

          list.delete_mid(2);
          list.display_fromBeg();
    }
}
