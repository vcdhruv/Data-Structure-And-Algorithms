import java.util.Scanner;

public class Grading_system{
    public static void main(String[] args) {
        System.out.print("enter the marks:");
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        if (marks>90) {
            System.out.print("EXCELLENT");
        }
        else if(marks>80 && marks<=90){
            System.out.print("GOOD");
        }
        else if(marks>70 && marks<=80){
            System.out.print("FAIR");
        }
        else if(marks>60 && marks<=70){
            System.out.print("EXPECTATIONS");
        }
        else if(marks<=60){
            System.out.print("BELOW PAR");
        }
    }
}