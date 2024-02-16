import java.util.Stack;
public class palindromeLLBruteF {
// Node class represents a
// node in a linked list
        static class Node {
            // Data stored in the node
            int data;
            // Pointer to the next
            // node in the list
            Node next;

            // Constructor with both data
            // and next node as parameters
            Node(int data, Node next) {
                this.data = data;
                this.next = next;
            }

            // Constructor with only data as
            // a parameter, sets next to null
            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }


        public static boolean isPalindrome(Node head) {
            Node temp = head;
            Stack<Integer> stack = new Stack<Integer>();
            while(temp!=null){
                stack.push(temp.data);
                temp=temp.next;

            }

            Node temp2= head;
            while(temp2!=null && !stack.isEmpty()){
                if(temp2.data==stack.pop()){
                    temp2=temp2.next;

                }else{
                    return false;
                }
            }
            return true;
        }



        // Function to print the linked list
        public static void printLinkedList(Node head) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        public static void main(String[] args) {
            // Create a linked list with
            // values 1, 5, 2, 5, and 1 (15251, a palindrome)


            Node head = new Node(1);
            head.next = new Node(5);
            head.next.next = new Node(2);
            head.next.next.next = new Node(5);
            head.next.next.next.next = new Node(1);

            // Print the original linked list
            System.out.print("Original Linked List: ");
            printLinkedList(head);

            // Check if the linked list is a palindrome
            if (isPalindrome(head)) {
                System.out.println("The linked list is a palindrome.");
            } else {
                System.out.println("The linked list is not a palindrome.");
            }
        }

    }


