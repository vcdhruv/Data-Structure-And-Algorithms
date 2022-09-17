/*not totally wrong but you can deal with it... */
import java.util.Scanner;
public class Bar_chart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of bars you need:");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<a.length;i++)
        {
            a[i] = sc.nextInt();
            if(a[i]>0)
            {
                for(int j=0;j<a[i];j++)
                {
                    System.out.println("*");
                }
            }
            else
            {
                System.out.println("");
            }
        }    
    }
}
