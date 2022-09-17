import java.util.Scanner;
public class Differance_of_two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter length of big number:");
        int n1 = sc.nextInt();
        int[] a = new int[n1];
        System.out.println("NOTE:"+"\n"+"FIRST ARRAY NUMBER MUST BE GREATHER THAN SECOND ARRAY...");
        for(int i=0;i<a.length;i++)
        {
            System.out.print("enter "+i+"th element of 1st array:");
            a[i] = sc.nextInt();
        }
        System.out.print("enter length of small number:");
        int n2 = sc.nextInt();
        int[] b = new int[n2];
        if(n2>n1)
        {
            System.out.print("RESET THE PROGRAM");
        }
        for(int i=0;i<b.length;i++)
        {
            System.out.print("enter "+i+"th element of 2nd array:");
            b[i] = sc.nextInt();
        }
        System.out.print("First array number is:");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.print("\n"+"Second array number is:");
        for(int i=0;i<b.length;i++)
        {
            System.out.print(b[i]+" ");
        }
        
    }
}

