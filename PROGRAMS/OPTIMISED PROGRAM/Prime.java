import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        System.out.print("HOW MANY NUMBER YOU WANT TO CHECK:");
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++)
        {
            System.out.print("enter desired number:");
            int n = sc.nextInt();
            int count=0;
            for(int div=2;div*div<=n;div++) //square root of n
            {
                if(n%div==0)
                {
                    count++;
                    break;
                }
            }
            if(count==0)
            {
                System.out.println("PRIME");
            }
            else
            {
                System.out.println("NOT PRIME");
            }
        }
    }
}
