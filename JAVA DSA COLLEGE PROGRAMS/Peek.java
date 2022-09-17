import java.util.Scanner;
public class Peek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array:");
        Calculate_Pop cp = new Calculate_Pop();
        int l;
        do{
            System.out.println("enter 1 to push");
            System.out.println("enter 2 to pop");
            System.out.println("enter 3 to peek");
            System.out.println("enter 4 to display");
            System.out.print("enter your choice:");
            int k = sc.nextInt();
            switch (k) {
                case 1:cp.push();
                break;
                case 2:cp.pop();
                break;
                case 3:cp.peek();
                break;
                case 4:cp.display();
                break;
            }
            System.out.print("enter zero to get back to menu:");
            l=sc.nextInt();
        }while(l==0);        
    }
}
class Calculate_Pop
{
    int top=-1;   
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    public void push()
    {
        if(top==(n-1))
        {
            System.out.print("STACK OVERFLOW");
        }
        else
        {
            System.out.print("enter any element:");
            int i=sc.nextInt();
            top++;
            a[top]=i;
        }
    }
    public void pop()
    {
        if(top==-1)
        {
            System.out.print("STACK UNDERFLOW");
        }
        else
        {
            top--;
        }
    }
    /*public void isEmpty()
    {
        if(top==-1)
        {
            System.out.print("STACK UNDERFLOW");
        }
    }*/
    public void /*int if comment is applied*/  peek()
    {
        /*isEmpty();
        int data;
        data = a[top];
        System.out.print(data);
        return data;*/
        if(top==-1)
        {
            System.out.print("STACK UNDERFLOW");
        }
        else
        {
            System.out.print(a[top]);
        }
    }   
    public void display()
    {
        for(int j=top;j>=0;j--)
        {
            System.out.print(a[j]+" ");
        }
    }
}
