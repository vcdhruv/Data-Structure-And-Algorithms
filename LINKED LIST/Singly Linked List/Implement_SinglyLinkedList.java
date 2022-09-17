public class Implement_SinglyLinkedList {

    private ListNode head;

    private static class ListNode{
        private int data;   //can be any generic type
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            //whenever we create a new node next will by default point to null.
            this.next = null; 
        }
    }
}