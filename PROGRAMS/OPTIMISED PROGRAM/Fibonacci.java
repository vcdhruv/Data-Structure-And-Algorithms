import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many numbers you want to print:");
        int n = sc.nextInt();
        int a = 0 , b = 1;
        //System.out.print(a+" ");
        //System.out.print(b+" ");
        int sum;
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(a+" ");
            sum = a + b;
            a = b;
            b = sum;
            /*temp = a;
            a = b;
            sum = b;
            b = temp;*/ 
        }
    }
}
