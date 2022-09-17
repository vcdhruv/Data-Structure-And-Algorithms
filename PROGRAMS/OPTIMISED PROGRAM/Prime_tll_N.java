import java.util.Scanner;
public class Prime_tll_N
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter lower number:");
        int low = sc.nextInt();
        if(low==1)
        {
            System.out.println("INVALID INPUT");
            //as prime number is always divided by 1 and number itself...
        }
        System.out.print("enter higher number:");
        int high = sc.nextInt();
        for(int i=low;i<high;i++)
        {
            int count=0;
            //code for each element to be checked
            for(int div=2;div*div<=i;div++)
            {
                if(i%div==0)
                {
                    //if it is divided then count increase
                    count++;
                    break;
                    //as soon as it is divided first time loop will break..
                }
            }
            if(count==0)
            {
                System.out.println(i+" is prime");
            }
            /*if(flag==1)
            {
                System.out.println(i+" is prime");
            }*/
            /*else
            {
                System.out.print(i+" is not prime");
            }*/
        }
    }
}