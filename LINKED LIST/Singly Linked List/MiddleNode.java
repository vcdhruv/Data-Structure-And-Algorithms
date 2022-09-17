import java.util.Scanner;

public class MiddleNode {
    public List head;
    class List{
        private int data;
        private List next;
        public List(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public void insertNode(int data)
    {
        List newNode = new List(data);
        if (head == null) {
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
        List current = head;
        while(current != null){
            System.out.print(current.data+"->");
            current = current.next;
        }
        System.out.print("null");
    }

    public void fin_middleNode(){
            List slowPtr = head;
            List fastPtr = head;
            while(fastPtr != null && fastPtr.next != null)
            {
                slowPtr = slowPtr.next;
                fastPtr = fastPtr.next.next;
            }
            System.out.print(slowPtr.data);   
        }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        MiddleNode m = new MiddleNode();
        while (true) {
            System.out.println("enter 1 to insert");
            System.out.println("enter 2 to find miidle node");
            System.out.println("enter 3 to display");
            System.out.println("enter 4 to exit");
            System.out.println();
            System.out.print("enter your choice:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("enter value of node:");
                    int n = sc.nextInt();
                    m.insertNode(n);
                    break;
            
                case 2:System.out.print("middle node is:");
                        m.fin_middleNode();
                        System.out.println();
                        break;
                
                case 3:m.display();
                System.out.println();
                break;

                case 4:System.exit(0);
            }
        }
    }
}
