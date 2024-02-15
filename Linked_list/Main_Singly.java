package Linked_list;

public class Main_Singly {
    public static void main(String[] args) {
        SinglyLL list= new SinglyLL();
        list.insert_at_beg(3);
        list.insert_at_beg(2);
        list.insert_at_beg(8);
        list.insert_at_beg(17);
        list.display();

        list.insert_at_end(50);// insert at the end of the linked list
        list.display();


        list.insert_mid(99,3);
        list.display();


        list.delete_beg();
        list.display();


        list.delete_end();
        list.display();

        list.delete_mid(2);
        list.display();


        System.out.println(list.Find(3));



    }
}
