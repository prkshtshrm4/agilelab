import java.util.Scanner;
public class Lab0q1 {
    public static void main(String [] args){
        float salary;
        double increment;
        float salaryanual;
       double newsalaty;
        Scanner sc=new Scanner(System.in); 
        System.out.print("Enter Your Salary:");

        salary = sc.nextInt();

        if ((salary < 100000))
      
        {
          salaryanual = (salary*12);    
         increment=((salaryanual/100)*15);
         newsalaty = (increment+salaryanual);
         System.out.println("\nCurrent Anual Salary is: " + (salary*12) + "\n");
         System.out.println("\nIncrement amount is: " + increment + "\n");
         System.out.println("\nSalary after increment: " + newsalaty + "\n");
         System.out.println("\nSalary increased by 15%");
        }
        else if ((salary >=100000) && (salary <=200000))
        {
            salaryanual = (salary*12);    
           increment=((salaryanual/100)*10);
           newsalaty = (increment+salaryanual);
           System.out.println("\nCurrent Anual Salary is: " + (salary*12) + "\n");
           System.out.println("\nIncrement amount is: " + increment + "\n");
           System.out.println("\nSalary after increment: " + newsalaty + "\n");
           System.out.println("\nSalary increased by 10%");
          }
        else if ((salary > 200000))
        {
            salaryanual = (salary*12);    
           increment=((salaryanual/100)*5);
           newsalaty = (increment+salaryanual);
           System.out.println("\nCurrent Anual Salary is: " + (salary*12) + "\n");
           System.out.println("\nIncrement amount is: " + increment + "\n");
           System.out.println("\nSalary after increment: " + newsalaty + "\n");
           System.out.println("\nSalary increased by 5%");
          }
        
      


    }
    
}
