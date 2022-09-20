public class Bubble_sorted_linkedList {
    public List head;

    public class List{
        
        public int data;
        public List next;
        
        public List(int data){
            this.data = data;
        }
    }
    public void insertNode(int data){
        List newNode = new List(data);
        if(head == null){
            head = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }
    public void sortList(){

        if(head == null){
            System.out.print("List is empty");
        }
        else{
            List current = head;
            List temp = null;
            while (current != null) {
                temp = current.next; //temp must be one ahead 
                //ASCENDING ORDER
                while (temp != null) {
                    if (current.data > temp.data) {
                        int replace = current.data;
                        current.data = temp.data;
                        temp.data = replace;
                    }  
                    temp = temp.next;
                }
                current = current.next;
            }
        }
    }
    public void removeDuplicateNodesFromSortedList(){
        if(head == null){
            System.out.println("List is empty");
        }
        else{
            List current = head;
            while(current.next != null){
                if(current.data == current.next.data){
                    current.next = current.next.next;
                }
                current = current.next;
            }
        }
    }

    public void insertNodeInSortedList(int data){
        if(head == null){
            return;
        }
        else{
            List newNode = new List(data);
             List current = head;
             List temp = null; //it wil be previous to head when to insert.
             while (current!=null && current.data < newNode.data) {
                temp = current;
                current = current.next;
             }
             newNode.next = current;
             temp.next = newNode;
        }
    }

    public void display(){
        if(head == null){
            System.out.println("List is empty");
        }
        else{
            List current = head;
            while(current != null){
                System.out.print(current.data + "->");
                current = current.next;
            }
            System.out.print("null");
        }
    }
    public static void main(String[] args) {
        Bubble_sorted_linkedList sl = new Bubble_sorted_linkedList();
        sl.insertNode(1);
        sl.insertNode(1);
        sl.insertNode(5);
        sl.insertNode(3);
        sl.insertNode(2);
        sl.insertNode(0);
        sl.insertNode(0);
        sl.display();
        System.out.println();
        sl.sortList();
        sl.display();
        System.out.println();
        sl.removeDuplicateNodesFromSortedList();
        sl.display();
        System.out.println();
        sl.insertNodeInSortedList(4);
        sl.display();
    }
}
