/*WRONG AFTER 47TH LINE */
import java.util.Scanner;
public class Sum_of_two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many elements you want to enter in first array:");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.print("How many elements you want to enter in second array:");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print("enter "+i+"th element of first array:");
            arr1[i] = sc.nextInt();
            if(arr1[i]<0 || arr1[i]>9)
            {
                System.out.println("Invalid input");
                break;
            }
        } 
        for(int i=0;i<arr2.length;i++)
        {
            System.out.print("enter "+i+"th element of second array:");
            arr2[i] = sc.nextInt();
            if(arr2[i]<0 || arr2[i]>9)
            {
                System.out.println("Invalid input");
                break;
            }
        } 
        System.out.print("First array value is:");
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]+" ");
        }
        System.out.print("\n"+"Second array value is:");
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(arr2[i]+" ");
        }
        int[] sum = new int[n1>n2?n1:n2];
        int x = arr1.length - 1;
        int y = arr2.length - 1;
        int z = sum.length - 1;
        int q = 0;
        System.out.println("sum of two:");
        /*WRONG AFTER 47TH LINE */
        while (z<=0) 
        {
            int lastofn1;
            int lastofn2,s;
            lastofn1 = arr1[x];
            lastofn2 = arr2[y];
            s = lastofn1 + lastofn2 + q; 
            q = s / 10;
            s = s % 10;
            sum[n1>n2?n1:n2] = s;
            System.out.print(sum[n1>n2?n1:n2]);
            x--;
            y--;   
        }
        /*for(int i=0;i<n1 || i<n2;i++)
        {
            System.out.print(sum);
        }*/
    }    
}


