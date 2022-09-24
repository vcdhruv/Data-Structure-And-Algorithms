import java.util.EmptyStackException;
import java.util.Scanner;

public class Implementation_using_linkedList {

    public Stack top;
    public int length;

    class Stack {
        public int data;
        public Stack next;

        public Stack(int data) {
            this.data = data;
        }
    }

    public Implementation_using_linkedList() {
        top = null;
        length = 0;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int length() {
        return length;
    }

    public void push(int data) {
        Stack node = new Stack(data);
        node.next = top;
        top = node;
        length++;
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            int result = top.data;
            top = top.next;
            length--;
            return result;
        }
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            return top.data;
        }
    }

    public void display() {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            Stack current = top;
            while (current != null) {
                System.out.println("> pushed" + "\t" + current.data);
                current = current.next;
            }
        }
    }

    public int peep(int i) {
        if ((top.data - i) + 1 <= 0) {
            throw new EmptyStackException();
        } else {
            return (top.data - i + 1);
        }
    }

    public void change(int i, int value) {
        if ((top.data - i) + 1 <= 0) {
            throw new EmptyStackException();
        } else {
            int position = 1;
            Stack current = top;
            while (position != i) {
                current = current.next;
                position++;
            }
            current.data = value;
        }
    }

    public static void main(String[] args) {
        Implementation_using_linkedList ll = new Implementation_using_linkedList();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("enter 0 to exit the menu");
            System.out.println("enter 1 to push");
            System.out.println("enter 2 to pop");
            System.out.println("enter 3 to peek");
            System.out.println("enter 4 to display");
            System.out.println("enter 5 to length of stack");
            System.out.println("enter 6 to peep");
            System.out.println("enter 7 to change the desired value" + "\n");
            System.out.print("enter your choice:");
            int choice = sc.nextInt();
            int n;
            switch (choice) {

                case 1:
                    System.out.print("enter value you want to push:");
                    n = sc.nextInt();
                    ll.push(n);
                    break;

                case 2:
                    ll.pop();
                    break;

                case 3:
                    System.out.println("last value of top is:" + ll.peek() + "\n");
                    break;

                case 4:
                    ll.display();
                    System.out.println();
                    break;

                case 5:
                    System.out.println("lenght of stack is:" + ll.length() + "\n");
                    break;

                case 6:
                    int i;
                    System.out.print("index of element you want from " + ll.top.data + ";");
                    i = sc.nextInt();
                    System.out.println("desired element is:" + ll.peep(i));
                    break;

                case 7:
                    System.out.print("enter index of element you want to replace from " + ll.top.data + ":");
                    i = sc.nextInt();
                    System.out.println();
                    System.out.print("enter replacing element value:");
                    int value = sc.nextInt();
                    ll.change(i, value);
                    System.out.println("Changed:");
                    ll.display();
                    
                case 0:
                    System.exit(0);
                    break;
            }
        }
    }
}