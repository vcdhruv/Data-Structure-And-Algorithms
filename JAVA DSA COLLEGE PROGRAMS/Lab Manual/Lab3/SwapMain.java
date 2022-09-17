import java.util.Scanner;
class SwapDemo{
	int temp=0;
public void swap(int a, int b)
	{
		temp=a;
		b=temp;
		a=b;
		System.out.println("The numbers after swapping are: "+a+" and "+b);
	}
}
public class SwapMain
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two nunmber to swap them:");
		int a=s.nextInt();
		int b=s.nextInt();
		SwapDemo sd = new SwapDemo();
		sd.swap(a,b);	
	}
}