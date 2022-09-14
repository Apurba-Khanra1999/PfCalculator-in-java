import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
         System.out.println("Enter a Name : ");
         String name = sc.next();
 
         System.out.println("Enter a salary : ");
         float salary = sc.nextFloat();
 
         System.out.println("Enter a pf percentage : ");
         float pfpercentage = sc.nextFloat();
 
         FullTimeEmployee obj = new FullTimeEmployee();
         if(obj.validateInput(pfpercentage, salary)){
             obj.setName(name);
             obj.setSalary(salary);
             
             System.out.println("Employee Name :" +  obj.getName());
             System.out.printf("PF Amount :" + "%.2f",obj.getPfamount(pfpercentage, salary));
             System.out.println("");
             System.out.printf("Netsalary: " + "%.2f",obj.calculateNetSalary(pfpercentage, salary));
             System.out.println("");
         }
         else{
             System.out.println("Error!!! Unable to calculate the NetSalary");
         }
     }
}
