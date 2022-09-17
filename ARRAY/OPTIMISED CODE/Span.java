import java.util.Scanner;
public class Span
{
    public static void main(String[] args) {
        /*span is max - min of any array */
        Scanner sc = new Scanner(System.in);
        System.out.print("enter how many elements you want to enter:");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<a.length;i++)
        {
            System.out.print("enter "+i+"th element of array:");
            a[i] = sc.nextInt();
        }
        int min = a[0];
        int max = a[0];
        for(int j=0;j<a.length;j++)
        {
            if(a[j]<a[0])
            {
                //System.out.print("MINIMUM ELEMENT OF ARRAY IS:"+a[j]);
                min = a[j];
            }
            if(a[j]>a[0])
            {
                //System.out.print("MAXIMUM ELEMENT OF ARRAY IS:"+a[j]);
                max = a[j];
            }
        }
        System.out.print("MINIMUM ELEMENT OF ARRAY IS:"+min);
        System.out.print("MAXIMUM ELEMENT OF ARRAY IS:"+max);
        int span = max - min;
        System.out.print("span of an array is:"+span);
    }
}