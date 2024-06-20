//Client program for Person/Employee
import java.util.InputMismatchException;
import java.util.Scanner;


public class ClientEmployee {
    /*Enter employee last name: Bond
Enter employee first name: James
Enter department: THEATRE
Enter employee pay rate: 35
Enter employee hours worked: 47
­­­ Record for both employees with overridden .toString from subclass ­­­
The wages for Doe, John from the COSC department are: $1402.50
The wages for Bond, James from the THEATRE department are: $1767.50
­­­ Output with calls to overridden method print from subclass ­­­
The employee John Doe from the COSC department worked 50.0 hours with a pay rate of
$25.50. The wages for John Doe are $1402.50
The employee James Bond from the THEATRE department worked 47.0 hours with a pay
rate of $35.00. The wages for James Bond are $1767.50
­­­ Output with calls to getters from the superclass ­­­
The wages for James Bond from the THEATRE department are $1767.50
­­­ Call to overridden equals/subclass for 2 Employee objects­­­
Couldn't find an employee with same record.
 */
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
       
        Employee prof = new Employee(
            "John", 
            "Doe", 
            25.50, 
            50, 
            "COSC"
        );
            
        //subclass alternate constructor invoked
        Employee iEmployee = Input_Employee(input);
        
        /* 
        //testcase
        Employee iEmployee = new Employee(
            "James", 
            "Bond", 
            35, 
            47, 
            "THEATRE"
        );
        */
       

        System.out.println(prof.toString());
        System.out.println(iEmployee.toString());

        //print calls

        prof.print();
        iEmployee.print();

        prof.printLastFirst();
        iEmployee.printLastFirst();

        //­ Output with calls to getters from the superclass
        System.out.printf(
            "The wages for %s, %s from the %s department are $%.2f", 

            iEmployee.getFirstName(),
            iEmployee.getLastName(),
            iEmployee.getDepartment(),
            iEmployee.calculatePay()
        );

        System.out.println();

        //iEmployee.copy(prof);
        //Call to overridden equalsl
        System.out.println(
            (iEmployee.equals(prof)) 
            ? "Found an employee with same record."
            : "Couldn't find an employee with same record."
        );
        

        input.close();
    }

    static Employee Input_Employee(Scanner input){

        
        
        
        String last, first, dept;
        double pay_rate;
        int hours;

        


        Employee iEmployee = new Employee();

        System.out.print("Enter employee last name: \t");
            last = input.nextLine();
    
        System.out.print("Enter employee first name: \t");
            first = input.nextLine();
    
        System.out.print("Enter department: \t");
            dept = input.nextLine();
            
        {
            boolean bad_input = true;
                while (bad_input){
                    try{
                        System.out.print("Enter employee pay rate: \t");
                            pay_rate = input.nextDouble();
                
                        System.out.print("Enter employee hours worked: \t");
                            hours = input.nextInt();
            
                            bad_input = false;
            
                            iEmployee = new Employee(
                                first, 
                                last, 
                                pay_rate, 
                                hours, 
                                dept
                            );
                    }catch (InputMismatchException e){
                        input.nextLine();
                        System.out.println("Input Error:" + e.getMessage());
                        continue;
                    }
                }
        }
            
        

        return iEmployee;

    }
}