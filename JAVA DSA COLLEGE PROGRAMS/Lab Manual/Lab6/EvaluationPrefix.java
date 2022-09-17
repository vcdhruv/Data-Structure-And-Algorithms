import java.util.Scanner;

public class EvaluationPrefix
{
	static EvaluationPrefix obj=new EvaluationPrefix();
	int[] stack=new int[100];
	static int top=-1;
	public void Push(int c)
	{
		if(top>=100)
			System.out.println("Stack Overflow");
		else
		{
			top++;
			stack[top]=c;
		}
	}
	public int Pop()
	{
		if(top==-1)
		{
			System.out.println("Stack Underflow");
			return 0;
		}
		return stack[top--];
	}
	public void opr(int c)
	{
		int op1,op2,value;
		switch(c)
		{
		case 43:
			op2=obj.Pop();
			op1=obj.Pop();
			value=op1+op2;
			obj.Push(value);
			break;
		case 45:
			op2=obj.Pop();
			op1=obj.Pop();
			value=op1-op2;
			obj.Push(value);
			break;
		case 42:
			op2=obj.Pop();
			op1=obj.Pop();
			value=op1*op2;
			obj.Push(value);
			break;
		case 47:
			op2=obj.Pop();
			op1=obj.Pop();
			value=op1/op2;
			obj.Push(value);
			break;
		}
	}
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Postfix Expression:");
	String str=s.next();
	for(int i=str.length()-1;i>=0;i--)
	{
		int c=str.charAt(i);
		if(c==42||c==43||c==45||c==47)
			obj.opr(c);
		else
		{
			int temp=(int)c-48;
			obj.Push(temp);
		}
	}	
	System.out.println(obj.Pop());
	}
}