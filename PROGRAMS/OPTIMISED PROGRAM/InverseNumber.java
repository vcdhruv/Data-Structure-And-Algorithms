import java.util.Scanner;
public class InverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter any number:");
        int n = sc.nextInt();
        int temp,flag=0;
        temp = n;
        int count_digit=0,k;
        /*for(int i=1;i<=n;i++)
        {
            n = n/10;
            count_digit++;
        }*/
        while (n!=0) {
            n = n/10;
            count_digit++;
        }
        System.out.println("no. of digits in entered number is:"+count_digit);
        n = temp;
        for(int j=1;j<=count_digit;j++)
        {
            k = n%10;
            n = n/10;
            if(k>count_digit || k==n)
            {
                flag = 1;
            }
            
        }
        if(flag==1)
        {
            System.out.println("INVALID NUMBER");
            /*for inverse number number entered must of following type:
             * four digit no. must contain  1 2 3 4 only
             * five ""    ""   ""    ""     1 2 3 4 5 only eg:52143 valid and 65213 not valid
             */
        }
        else
        {
            System.out.println("VALID NUMBER");
            n = temp;
            int pos=0,dig,sum=0;
            for(int l=0;l<count_digit;l++)
            {
                dig = n%10;
                pos++;
                System.out.println("digit at position "+pos+" is:"+dig);
                sum = (int)(sum + pos*Math.pow(10,(dig-1)));
                System.out.println("sum is :"+sum);
                //System.out.print(pos);
                n = n/10;
            }   
            System.out.print("number:"+sum);
        }             
    }
}
