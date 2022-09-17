import java.util.Scanner;

// a node in singly linked list can only be deleted if we have previous node to delete a node after it 
// but in doubly we can delete easily
/**
 * DoublyLinkedList_Implementation
 */
public class DoublyLinkedList_Implementation {
    List head; // points to first node and its previous is null
    List tail; // points to last node and its next is null
    int length; // it will hold no. of nodes in doubly linked linked list
    
    public DoublyLinkedList_Implementation(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }
    
    public class List {
        int data;
        List previous;
        List next;
        public List(int data){
            this.data = data;
            this.previous = null;
            this.next = null;
        }
    }
    
    public boolean isEmpty(){
        return length == 0; //head == null;
    }
    
    public int length(){
        return length;
    }

    public void displayForward()
    {
        if(head == null){
            System.out.println("List is empty");
        }
        else{
            List current = head;
            while(current != null){
                System.out.print(current.data+"->");
                current = current.next;
            }
            System.out.print("null"+"\n");
        }
    }

    public void displayBackward(){
        if(head == null){
            System.out.println("list is empty");
        }
        else{
            List temp = tail;
            System.out.print("null");
            while (temp != null) {
                System.out.print("<-"+temp.data);
                temp = temp.previous;
            }
            System.out.println();
        }
    }
 
    public void insertAtBeginning(int data){
        List nNode = new List(data);
        if(head == null && tail == null){
            head = nNode;
            tail = nNode; //this statement is mandatory
        }
        else{
            head.previous = nNode;
            nNode.next = head;
            head = nNode;
        }
        length++;
        System.out.print("head:"+head.data+"\n");
        System.out.print("tail:"+tail.data+"\n");
    }
 
    public void insertAtLast(int data){
        List nNode = new List(data);
        if(head == null && tail == null){
            head = nNode;
            tail = nNode;
        }
        else{
            List current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = nNode;
            tail = nNode;
        }
        length++; //these increases length of node
        System.out.print("head:"+head.data+"\n");
        System.out.print("tail:"+tail.data+"\n");
    }

    public void deleteFirstNode(){
        if(head == null && tail == null){
            System.out.println("List is empty");
            System.out.print("head:"+"null"+"\n");
            System.out.print("tail:"+"null"+"\n");
        }
        else{
            System.out.println("deleted node is:"+head.data);
            head = head.next;
            length--;
            System.out.print("head:"+head.data+"\n");
            System.out.print("tail:"+tail.data+"\n");
        }
    }

    public void delteLastNode(){
        if(head == null && tail == null){
            System.out.println("List is empty");
            System.out.print("head:"+"null"+"\n");
            System.out.print("tail:"+"null"+"\n");
        }
        else{
            System.out.println("deleted node is:"+tail.data);
            tail = tail.previous;
            length--;
            System.out.print("head:"+head.data+"\n");
            System.out.print("tail:"+tail.data+"\n"); 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoublyLinkedList_Implementation dbl = new DoublyLinkedList_Implementation();
        while (true) {
            System.out.println("enter 1 to insert a node at beginning");
            System.out.println("enter 2 to insert a node at last");
            System.out.println("enter 3 to display list from forward direction");
            System.out.println("enter 4 to display list from backward direction");
            System.out.println("enter 5 to check the no. of nodes present in list");
            System.out.println("enter 6 to delete the first node");
            System.out.println("enter 7 to delete the last node");
            System.out.println("enter 8 to exit the menu");
            System.out.println();
            System.out.print("enter your choice:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                System.out.print("enter data of node:"); 
                int n = sc.nextInt();
                dbl.insertAtBeginning(n);    
                break;
            
                case 2:
                System.out.print("enter data of node:"); 
                n = sc.nextInt();
                dbl.insertAtLast(n);
                break;

                case 3:
                dbl.displayForward();
                break;

                case 4:
                dbl.displayBackward();
                break;
                 
                case 5:
                if(dbl.isEmpty()){
                    System.out.println("no. of nodes in a list:"+dbl.length());
                }
                else{
                    System.out.print("no. of nodes in a list:"+(dbl.length)+"\n");                    
                }
                break;

                case 6:
                dbl.deleteFirstNode();
                break;

                case 7:
                dbl.delteLastNode();
                break;

                case 8:
                System.exit(0);
            }
            
        }
    }
}