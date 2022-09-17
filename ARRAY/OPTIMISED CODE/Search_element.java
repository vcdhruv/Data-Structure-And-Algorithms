import java.util.Scanner;
public class Search_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter how many elements you want to enter:");
        int n = sc.nextInt();
        System.out.print("enter a number you wanted to search:");
        int target = sc.nextInt();
        System.out.println("TARGET ELEMENT IS:"+target);
        int[] a = new int[n];
        System.out.print("\nNOTE: DO NOT ENTER SIMILAR VALUES OF TWO INDEXES OR MORE");
        for(int i=0;i<a.length;i++)
        {
            System.out.print("enter "+i+"th element of array:");
            a[i] = sc.nextInt();
        }
        int index = -1;
        for(int j=0;j<a.length;j++)
        {
            if(a[j]==target)
            {
                index = j;
                break;
                /*logic is not feasible if value of any two or more index is same.... */
            }
        }
        System.out.print("index of matched number is:"+index);
    }    
}
