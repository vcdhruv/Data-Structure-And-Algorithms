import java.util.Scanner;
class Factorial{
	public int getFactorial(int number){
		if(number>1){
			return number*getFactorial(number-1);
		}
		else{
			return 1;
		}
	}
}
public class FactorialUsingRec{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number whoose factorial is needed to be find");
		int number=input.nextInt();
		Factorial F = new Factorial();
		int answer = F.getFactorial(number);
		System.out.println("Factorial of given number is"+" "+answer);
	}
}