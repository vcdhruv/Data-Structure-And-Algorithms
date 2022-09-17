import java.util.Scanner;
public class Count_digits {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (true) {
        System.out.print("enter any digits number:");
        int n = sc.nextInt();
        int count=0,temp;
        temp = n;
        /*NEVER USE FOR LOOP WHEN IT IS UNKNOWN THAT HOW MANY TIMES LOOP WE EXECUTE....
        FOR THAT CASE WE MUST USE WHILE LOOP */
        while (n != 0) {
            n = n / 10;
            count++;
        }   
        /*for(int i=0;i<n;i++)
        {
            n = n /10;
            count++;
        }*/     
        System.out.println("NUMBER OF DIGITS IN "+temp+" IS:"+count);
        System.out.println("enter  0 to exit");
        if(temp==0)
        {
            //System.out.print("1");
            System.exit(0);
        }
        //
    }        
    }
}
