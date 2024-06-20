/** should contain 3 fields (payRate, hoursWorked,and department) */

//Class Employee: subclass of Person
public class Employee extends Person {
    private double payRate;
    private double hoursWorked;
    private String department;
   
    public final int HOURS = 40;
    public final double OVERTIME = 1.5;
   
     //default constructor
     public Employee() {
        super();
        payRate = 0.00;
        hoursWorked = 0.00;
        department = "";
     }
 
     //add an alternate constructor with parameters
     public Employee(
        String first,
        String last,
        double rate,
        double hours,
        String department
    ){
        super(first, last);
        this.payRate = rate;
        this.hoursWorked = hours;
        this.department = department;
    }
     
    //set

    public void setPayRate(double rate) {
        this.payRate = (rate < 0.00) ? 0.00 : rate;
    }

    public void setHoursWorked(double hours) {
        this.hoursWorked = (hours < 0.00) ? 0.00 : hours;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    @Override
     public String toString() {
         //should return a String like this:
         //The wages for xxxx from the xxxx department are: $xxxxx.xx"
        
        
        return String.format(
            "The wages for %s, %s from the %s department are: $%.2f",

            super.getLastName(),
            super.getFirstName(),
            this.department,
            calculatePay()
        );
    
     }
 
    public void print() {
        //Should print output like this (same line):
        //The employee xxxx from the xxxx department worked xx hours
        //with a pay rate of $xxx.xx. The wages for this employee are $xxxxx.xx
    
        System.out.printf(
            "The employee %s from the %s department worked " + this.hoursWorked + " hours with a pay rate of $%.2f. The wages for %s are $%.2f",

            super.toString(),
            this.department,

            this.payRate,
            super.toString(),
            calculatePay()
        );

        System.out.println();

    }
 
    public void printLastFirst() {
        
        System.out.printf(
            "The employee %s, %s from the %s department worked " + this.hoursWorked + " hours with a pay rate of $%.2f. The wages for %s are $%.2f",

            super.getLastName(),
            super.getFirstName(),
            this.department,
            this.payRate,
            super.toString(),
            calculatePay()
        );

        System.out.println();
    }
    
    public double calculatePay() {
        //Method to calculate and return the wages
        //handle both regular and overtime pay

        final double PAY = this.payRate * this.HOURS;
        final double OVERTIME_PAY = (this.payRate * this.OVERTIME) * (this.hoursWorked-HOURS);
        
        return PAY + OVERTIME_PAY; 
    }

    
    

 
    public void setAll(String first, String last, double rate, double hours,
String dep){
        super.setName(first, last);


        setPayRate(rate);
        setHoursWorked(hours);
        setDepartment(dep);
    }
 
    public double getPayRate() {
        return payRate;
    }
 
    
    public double getHoursWorked() {
        return hoursWorked;   
    }
    
    
    public String getDepartment() {
        return department;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Employee)) return false;
        
        Employee other = (Employee) o;

        return (
            super.equals(other) &&
            this.payRate == other.payRate &&   
            this.hoursWorked == other.hoursWorked &&
            this.department.equals(other.department)
        );
    }
    
    public Employee getCopy() {
        return new Employee(
            super.getFirstName(),
            super.getLastName(),
            this.payRate,
            this.hoursWorked,
            this.department
        );
    }
    
    public void copy(Employee e) {
        
        super.setName(e.getFirstName(), e.getLastName());

        this.payRate = e.payRate;
        this.hoursWorked = e.hoursWorked;
        this.department = e.department;
    }
      
}
 