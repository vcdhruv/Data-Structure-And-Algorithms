import java.util.Scanner;
public class Replace{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of numbers which are need to be entered");
		int length = input.nextInt();
		int[] a = new int[length];
		for(int i=0;i<length;i++){
			System.out.print("Enter number"+(i+1)+":-");
			a[i]=input.nextInt();
		}
		int flag=0;
		System.out.println("Enter the number which is need to be replaced");
		int number1=input.nextInt();
		System.out.println("Enter hte number with which entered number is need be replaced");
		int number2=input.nextInt();
		for(int i=0;i<length;i++){
			if(a[i]==number1){
				a[i]=number2;
				System.out.println("The index of the matched number is "+i);
			}
			else{
				flag++;
			}
		}
		if(flag==length){
			System.out.println("No number found which is equals to first number which is needed to be replaced");
		}
		System.out.println("The final list of number is");
		for(int i=0;i<length;i++){
			System.out.println(a[i]);
		}
	}
}