public class Insertion_Sorted_linkedList{
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
            List current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void display(){
        if(head == null){
            System.out.println("List is empty");
        }
        else{
            List current = head;
            while (current != null) {
                System.out.print(current.data + "->");
                current = current.next;
            }
            System.out.print("null");
        }
    }

    public void insertionSort(){
        if(head == null){
            System.out.println("List is empty");
        }
        else{
            List current = head;
            List previous = null;
            int replace;
            while (current.next != null) {
                previous = current;
                    while (previous != current) {
                        if(current.next.data < current.data){
                            replace = current.data;
                            current.data = current.next.data;
                            current.next.data = replace;
                        }                        
                        previous = previous.next;
                    }
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {
        Insertion_Sorted_linkedList isl = new Insertion_Sorted_linkedList();
        isl.insertNode(4);
        isl.insertNode(5);
        isl.insertNode(2);
        isl.insertNode(14);
        isl.insertNode(0);
        isl.insertNode(3);
        isl.display();
        System.out.println();
        isl.insertionSort();
        isl.display();
    }
}