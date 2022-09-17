import java.util.Scanner;
public class Bar_chart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many bars you want:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        //for scanning element of an array
        for(int i=0;i<arr.length;i++)
        {
            System.out.print("enter "+i+"th element:");
            arr[i] = sc.nextInt();
        }
        //now to check maximum element of array
        int max = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        System.out.print("\n"+"Largest floor of building is:"+max);
        for(int floor = max ; floor >= 0; floor--)
        {
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]>floor)
                {
                    //if input value is greater than floor(i.e max) than print * else space.... 
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
