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
        for(int i=0;i<arr2.length;i++)
        {
            System.out.print(arr2[i]+" ");
        }
        int[] sum = new int[n1>n2?n1:n2];
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = sum.length - 1;
        int carry = 0;
        while (k>=0) 
        {
            int d = carry;
            if(i >= 0)
            {
                d += arr1[i];
            }
            if(j >= 0)
            {
                d += arr2[j];
            }
            carry = d / 10;
            d = d % 10;
            sum[k] = d;
            i--;
            k--;
            j--;
        }
        System.out.println("\n"+"sum of two array is:");
        /*to know why carry is not equal to zero do sum of 999+1 carry 1 will remain so print 1 carry.... */
        if(carry!=0)
        {
            System.out.print(carry);
        }
        //for each is for array..
        for (int value : sum) {
            System.out.print(value);
        }
    }    
}
