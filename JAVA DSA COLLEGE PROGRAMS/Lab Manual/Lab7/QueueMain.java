import java.util.Scanner;

class Queue{
	int front=-1;
	int rear=-1;
	int [] arr = new int[10];
	public void enque(int x){
		if(rear>10){
			System.out.println("Queue is Full");
		}
		else{
			if(rear==-1){
				front++;
			}
			rear++;
			arr[rear]=x;
		}
	}

	public void deque(){
		
		if(rear==-1){
			System.out.println("Queue is Empty");
		}
		front++;
	}

	public void display(){
		if(front==-1){
			System.out.println("Queue is Empty");
		}
		System.out.println("The element of the Queue is: ");
		for(int i=front;i<=rear;i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
class QueueMain{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		Queue obj = new Queue();
		while(true){
			System.out.println("\n1.Anque\n2.Deque\n3.Display\n4.Exit");
			int c=sc.nextInt();
			switch(c){
				case 1:
				{
					System.out.println("Enter the data to be pushed into the Queue");
					int x=sc.nextInt();
					obj.enque(x);
					break;
				}
				case 2:
					obj.deque();
					break;
				case 3:
					obj.display();
					break;
				case 4:
					System.exit(0);
			}
		}
	}
}