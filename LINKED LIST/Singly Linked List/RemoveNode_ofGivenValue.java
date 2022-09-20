public class RemoveNode_ofGivenValue {
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
        if (head == null) {
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
    public void display(){
        if (head == null) {
            System.out.println("List is empty");
        } else {
            List current = head;
            while (current != null) {
                System.out.print(current.data + "->");
                current = current.next;
            }
            System.out.print("null");
        }
    }

    public void removeNode(int data){
        if (head == null) {
            System.out.println("List is empty");
        } else {
            List current = head;
            List previous = null;
            if(data == head.data){
                head = head.next;
            }
            else{
                while (current.data != data) {
                    previous = current;
                    current = current.next;
                }
                previous.next = current.next;
            }
        }
    }

    public static void main(String[] args) {
        RemoveNode_ofGivenValue sl = new RemoveNode_ofGivenValue();
        sl.insertNode(1);
        sl.insertNode(2);
        sl.insertNode(3);
        sl.insertNode(4);
        sl.insertNode(5);;
        sl.display();
        System.out.println();
        sl.removeNode(5);
        sl.display();
    }
}
