import java.util.Scanner;
public class PrimeNumber{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number which is needed to be check:-");
		int number = input.nextInt();
		int flag=0;
		for(int i=2;i<=number/2;i++){
			if(number%i==0){
				flag=1;
				break;
			}
		}
		if(flag==1){
			System.out.println(number+" "+"is not prime");
		}
		else{
			System.out.println(number+" "+"is prime");
		}
	}
}