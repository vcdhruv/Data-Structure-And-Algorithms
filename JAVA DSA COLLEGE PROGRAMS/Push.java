import java.util.Scanner;
public class Push{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter size of array:");
        Operation p = new Operation();
        int l,t;
        do {
            System.out.println("\n"+"enter 1 to push element");
            System.out.println("enter 2 to display elements");
            System.out.print("\n"+"enter ur choice:");
            t=sc.nextInt();
            switch (t) {
                case 1:p.calculate();
                break;
                case 2:p.display();
                break;
            }
            System.out.print("enter 0 to get to menu:");
            l=sc.nextInt();    
        }while(l==0);
    }
}
class Operation
{
    int top=-1;
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    public void calculate()
    {
        if(top==(n-1))
        {
            System.out.print("top:"+top+" STACK OVERFLOW");
        }
        else
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("enter element:");
            int i = sc.nextInt();
            top++;
            a[top]=i;   
        }
    }
    public void display()
    {
        for(int j=top;j>=0;j--)
        {
            System.out.print("top"+j+":"+a[j]+" "+"\n");
        }
    }
}
