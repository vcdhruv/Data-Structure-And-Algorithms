import java.util.Scanner;
public class SinglyLinkedList_Implementation {

    private List head;
    private static class List {
    
        private int data;
        private List next;

        public List(int data){
            this.data = data;
            this.next = null;
        }
    }
    //this is not needed as we have created both insert at first and insert at last.
    /* 
    public void insertNode(int data){
        List newNode = new List(data);
        if(head == null){
            head = newNode;
        }
        else{
            List current = head;
            current.next = newNode;
            current = newNode;
        }
    }
    */

    public void insertNode_at_beginning(int data){
        List newNode = new List(data);
        if(head == null){
            head = newNode;
        }
        else
        {
            newNode.next = head;
            head = newNode;
        }
    }

    public void insert_at_end(int data){
        List newNode = new List(data);
        if(head == null){
            head = newNode;
        }
        else{
            List current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void insert_at_given_position(int data , int position){
        List newNode = new List(data);
        if(head == null){
            head = newNode;
        }
        else if(position == 1)
        {
            newNode.next = head;
            head = newNode;
        }
        else{
            List current = head;
            for(int i=1;i<(position-1);i++){
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
    
        }
    }
     
    public List delete_firstNode(){
        if(head == null){
            return null;
        }
            List current = head;
            head = head.next;
            current.next = null;
            return current;
    }
    //data type has been done from quick solution and it needs to be reamin List because head is referancee of List and not int datatype
    // public List delete_firstNode(){
    //     if(head == null){
    //         System.out.println("NULL");
    //     }
    //     //else is not required otherwise it will give error of return statement and will give quick solution to create a current field whicb is mot reuired.
    //         List current = head;
    //         head = head.next;
    //         current.next = null;
    //        return current;
    // }

    /* 
    public List delete_lastNode(){
        if(head == null){
            return head;
        }
        else{
            List current = head;
            List previous = head;
            while (current.next != null) {
                current = current.next;
            }
            while (previous.next != current) {
                previous = previous.next;
            }
            previous.next = current.next;
        }
        
    }
    */

    public List delete_lastNode(){
        if(head == null || head.next == null){
            return head;
        }
        List current = head;
        List previous = null;
        while(current.next != null){
            previous = current;
            current = current.next;
        }
        previous.next = null;
        return current;
    }
    
    public SinglyLinkedList_Implementation.List delete_aNode_at_given_position(int position){
        List current = head;
        if(position == 1){
            head = head.next;
        }
        else{
            List previous = null;
            int i=1;
            while (i < position) {
                previous = current;
                current = current.next;
                i++;
            }
            previous.next = current.next;
            current.next = null;
        }        
        return current;
    }

    public boolean search_element(int data){
        if (head == null) {
            return false;
        }
        List current = head;
        while(current != null){
            if(current.data == data){
                // System.out.print(current.data);
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void reveseLinkedList(){
        if(head == null){
            System.out.println("EMPTY");;
        }
        // List current = head;
        // List previous = null;
        // List temp = null;
        // while(current != null){
        //     temp = current.next;// now we want to assign null value to first node that is head of without linked list so..
        //     current.next = previous; // this step provides null to head since previous is first null;
        //     previous = current;
        //     current = temp;
        // }
        List previous = null;
        List nextPointer = null;
        while (head != null) {
            nextPointer = head.next;
            head.next = previous;
            previous = head;
            // temp = temp.next;
            head = nextPointer;
        }
        head = previous;
    }

    public void find_middleNode(){
        if(head == null)
        {
            System.out.println("EMPTY");
        }
        else{
            List current = head;
            int count = 0;
            while(current != null)
            {
                count++;
                current = current.next;
            }
            int index = 1;
            if (count % 2 == 0) {
                current = head;
                while(index != ((count/2)+1))
                {
                    current = current.next;
                    index++;
                }
                System.out.println(current.data);
            }
            else
            {
                current = head;
                while (index != ((count/2)+1)) {
                    current = current.next;
                    index++;
                }
                System.out.println(current.data);
            }
        }
    }

    public void printNodes(){
        List current = head;
        System.out.print("NODE :");
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }
    /*
    public void lengthOfNodes(){
        if(head == null){
            System.out.print("List is empty");
        }
        List current = head;
        int length = 0;
        //since referance of last node is null so current.next will not give accurate answer
        while(current != null){
            length++;
            current = current.next;
        }
        System.out.print("TOTAL NODES IN A LIST ARE:"+length);
    }
     */

     public int lengthOfNodes(){
        if(head == null){
            return 0;
        }
        else{
            int count = 0;
            List current = head;
            while (current != null) {
                count++;
                current = current.next;
            }
            return count;
        }
     }

    public static void main(String[] args){
        SinglyLinkedList_Implementation sli = new SinglyLinkedList_Implementation();
        //as head is not static we can access it like this
        Scanner sc = new Scanner(System.in);
        List l;
        // sli.head = new List(1);
        // List first = new List(2);
        // List second = new List(3);
        // List third = new List(4);
        // sli.head.next = first;
        // first.next = second;
        // second.next = third;
        int j,n;
        do {
            System.out.println("enter 1 to print nodes");
            System.out.println("enter 2 to find length of nodes");
            System.out.println("enter 3 to insert node at beginning");
            System.out.println("enter 4 to insert node at end");
            System.out.println("enter 5 to insert node at required position");
            System.out.println("enter 6 to delete first node");
            System.out.println("enter 7 to delete last node");
            System.out.println("enter 8 to delete a node at required position");
            System.out.println("enter 9 to search an element present in a linked list");
            System.out.println("enter 10 to reverse a Singly linked list");
            System.out.println("enter 11 to find middle node of linked list");
            System.out.println();
            System.out.print("ENTER TOUR CHOICE:");
            int choice = sc.nextInt();
            switch (choice) {
                /* 
                case 1: 
                System.out.print("enter value of node:");
                int n = sc.nextInt();
                sli.insertNode(n);
                break;
                */

                case 1:
                sli.printNodes();
                break;

                case 2:
                System.out.println("TOTAL NODES IN A LIST ARE:"+sli.lengthOfNodes());
                break;

                case 3:
                System.out.print("enter value of node:");
                n = sc.nextInt();
                sli.insertNode_at_beginning(n);
                break;

                case 4:
                System.out.print("enter value of node:");
                n = sc.nextInt();
                sli.insert_at_end(n);
                break;

                case 5:
                System.out.print("enter value of node:\n");
                n = sc.nextInt();
                System.out.print("position:");
                int pos = sc.nextInt();
                sli.insert_at_given_position(n, pos);
                break;

                case 6:
                //to display what is deleted we need to write .data
                System.out.println(sli.delete_firstNode().data); 
                break;

                case 7:
                System.out.println(sli.delete_lastNode().data);
                break;

                case 8:
                System.out.print("POSITION:");
                n = sc.nextInt();
                System.out.println(sli.delete_aNode_at_given_position(n).data);

                case 9:
                sli.printNodes();
                System.out.print("enter element that you want:");
                n = sc.nextInt();
                if (sli.search_element(n)) {
                    System.out.println("searched element is found!!");
                } else {
                    System.out.println("NOT FOUND...");
                }
                break;

                case 10:
                sli.printNodes();
                sli.reveseLinkedList();
                sli.printNodes();
                break;

                case 11:
                sli.printNodes();
                System.out.print("MIDDLE NODE IS:");
                sli.find_middleNode();
            }
            System.out.println("enter 0 to exit the menu and 1 to repeat the menu:");
            j = sc.nextInt();
        } while (j != 0 || j == 1 );
            
    }    
}
