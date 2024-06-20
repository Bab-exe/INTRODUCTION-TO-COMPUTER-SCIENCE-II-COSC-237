/** Create a Person class. The class should contain 2 fields (both Strings called firstName and lastName)
and the following methods:
Default and alternate constructors.
Two getters (accessors) to return the first and the last name
A method named setName to set the fields to the parameters passed
2 methods to print:
1.  A method named printLastFirst (in this order, use “,” as a separator)
2.  A method called print (should print in order first name and last name)
A method named toString()
A method named equals (pass an object of the Object class)
2 methods named copy and getCopy to make a copy of a Person object into another Person
object
The class Person should serve as the superclass (base class) for a class called Employee. This subclass
(derived class) should contain 3 fields (payRate, hoursWorked,and department).
Continue the implementation for class Employee from here and complete the missing code */

public class Person {
    private String firstName,lastName;


    public Person(){
        firstName = "";
        lastName = "";
    }
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    ///get

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    ///set

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setName(String first,String last){
        this.firstName = first;
        this.lastName = last;
    }

    ///method

    @Override
    public String toString(){        
        return firstName + ", " + lastName;
    } 
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Person)) return false;

        Person other = (Person) obj;

        return (
            this.firstName.equals(other.firstName) &&
            this.lastName.equals(other.lastName)
        );

    }

    //copying

    public void copy(Person from) {
        this.firstName = from.firstName;
        this.lastName = from.lastName;
    }

    public Person getCopy() {
        return new Person(this.firstName, this.lastName);
    }

    //extra
    public void printLastFirst() {
        System.out.print(lastName + ", " + firstName);
    }

    public void print() {
        System.out.print(firstName + ", " + lastName);
    }
}