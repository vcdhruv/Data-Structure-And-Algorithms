public class Nth_nodeFromEnd {
    public List head;

    public class List {
        public int data;
        public List next;

        public List(int data) {
            this.data = data;
        }
    }

    public void insertNode(int data) {
        List newnNode = new List(data);
        if (head == null) {
            head = newnNode;
        }
        else{
            List current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newnNode;
        }
    }

    public void display() {
        if (head == null) {
            System.out.print("List is empty");
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

    public void nthNodeFromLast(int position){
        if(head == null){
            System.out.print("List is empty");
        }
        else{
            List current = head;
            int count = 0;
            while (current != null) {
                count++;
                current = current.next;
            }
            if(position == count){
                System.out.print("desired node value is:"+head.data);
            }
            else{
                current = head;
                for(int i=1;i<=(count-position);i++){
                    current = current.next;
                }
                System.out.print("the desired node is:"+current.data);
            }
        }
    }

    public static void main(String[] args) {
        Nth_nodeFromEnd n = new Nth_nodeFromEnd();
        n.insertNode(10);
        n.insertNode(8);
        n.insertNode(1);
        n.insertNode(11);
        n.insertNode(18);
        n.display();
        System.out.println();
        n.nthNodeFromLast(4);
    }
}
