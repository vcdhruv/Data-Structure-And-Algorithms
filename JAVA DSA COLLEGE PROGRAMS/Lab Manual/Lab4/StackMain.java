
import java.util.Scanner;
class StackDemo{
	int top=-1;
	int[] stack=new int[5];
	public void push(int a){
		if(top>=4){
			System.out.println("Stack Overflow");
		}
		else{
			top++;
			stack[top]=a;
		}
	}
	public int pop(){
		if(top<0){
			System.out.println("Stack underflow");
			return 0;
		}
		else{
			return stack[top--];
		}
	}
	public int peek(int a){
		if(top-a+1<0){
			System.out.println("Stack underflow/ Stack overflow");
			return 0;
		}
		else{
			return stack[top-a+1];
		}
	}	
	public void change(int a,int b){
		if(top-a+1<0){
			System.out.println("Stack underflow/ Stack overflow");
		}
		else{
			stack[top-a+1]=b;
		}
	}
	public void display(){
		for(int i=0;i<=top;i++){
			System.out.println(stack[i]);
		}
	}
}
public class StackMain{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		StackDemo stack = new StackDemo();
			while(1==1){
				System.out.println("Enter your choice:\t (1)Push (2)Pop (3)Peek (4)Change (5)Display");
				int choice = input.nextInt();
				if(choice==1){
					System.out.println("Enter the number which u need to enter");
					int a = input.nextInt();
					stack.push(a);
				}
				else if(choice==2){
					int number=stack.pop();
					System.out.println("The element is "+number);
				}
				else if(choice==3){
					System.out.println("Enter the element from top u want to get");
					int a = input.nextInt();
					int number=stack.peek(a);
					System.out.println("The element is "+number);
				}
				else if(choice==4){
					System.out.println("Enter the element from top u want to change");
					int a = input.nextInt();
					System.out.println("Enter the new number");
					int b = input.nextInt();
					stack.change(a,b);
				}
				else if(choice==5){
					stack.display();
				}
				else{
					System.out.println("Enter the valid choice.....");
					break;
				}
			}
	}
}