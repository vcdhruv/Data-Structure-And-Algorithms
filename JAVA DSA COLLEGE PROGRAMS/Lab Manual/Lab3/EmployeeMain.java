import java.util.Scanner;
class Employee_Details{
       int Employee_id;
       String Name;
       String Designation;
       double Salary;

       void readdetail(){
                     Scanner sc=new Scanner(System.in);

                     System.out.println("Enter Employee_id:");
                     Employee_id=sc.nextInt();

                     System.out.println("Enter Name:");
                     Name=sc.next();


                     System.out.println("Enter Designation:");
                     Designation=sc.next();


                     System.out.println("Enter Salary:");
                     Salary=sc.nextDouble();
       }
       void printdetail(){

                     System.out.println("Employee_id: "+Employee_id);
                     System.out.println("Name: "+Name);
                     System.out.println("Designation: "+Designation);
                     System.out.println("Salary: "+Salary);

       }
}
public class EmployeeMain{
       public static void main(String[] args) {
                     Employee_Details e1=new Employee_Details();
                     e1.readdetail();
                     e1.printdetail();
       }
}

