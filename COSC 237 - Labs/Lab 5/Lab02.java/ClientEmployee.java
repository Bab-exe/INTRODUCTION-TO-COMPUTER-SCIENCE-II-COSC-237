//Client program for Person/Employee
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
        String last, first, dept;
        double pay_rate;
        int hours;

        Employee prof = new Employee(
            "John", 
            "Doe", 
            25.50, 
            50, 
            "COSC"
        );
            
        //subclass alternate constructor invoked
        Employee newEmp = new Employee(); //subclass default constructor invoked 

        System.out.print("Enter employee last name: \t");
            last = input.nextLine();

        System.out.print("Enter employee first name: \t");
            first = input.nextLine();

        System.out.print("Enter department: \t");
            dept = input.nextLine();

        System.out.print("Enter employee pay rate: \t");
            pay_rate = input.nextDouble();

        System.out.print("Enter employee hours worked: \t");
            hours = input.nextInt();

        Employee iEmployee = new Employee(
            first, 
            last, 
            pay_rate, 
            hours, 
            dept
        );

        System.out.println(prof.toString());
        System.out.println(iEmployee.toString());

        //print calls

        prof.print();
        iEmployee.print();

        prof.printLastFirst();
        iEmployee.printLastFirst();

        input.close();
    }
}