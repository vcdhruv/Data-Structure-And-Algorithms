import java.util.*;
class AiBiDemo {
    int topa=0;
    int topb=0;
    char a[] = new char[100];
    char b[] = new char[100];
    void push(String str)
    {
        
        for (int i = 0; i <str.length(); i++) {
           if (str.charAt(i)=='a'){
               a[topa] = str.charAt(i);
               topa++;
           }
           else if (str.charAt(i)=='b'){
               b[topb] = str.charAt(i);
               topb++;
           }
           if (topa==topb) {
            System.out.println("Valid String");
           }
           else{
            System.out.println("Invalid String");
           }
        }
	}
}

public class AiBi{    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Stirng");
        String str = sc.nextLine();
        AiBiDemo input = new AiBiDemo();
        input.push(str);
    }
}
