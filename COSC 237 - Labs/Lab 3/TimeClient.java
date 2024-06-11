import java.util.Scanner; //???t
/*
Initial time t1 (alternate constructor invoked) ­ military format: 08:15:30
Initial time t1 (alternate constructor invoked) ­ standard format: 8:15:30 AM
Initial time t2 (default constructor invoked) ­ military format: 00:00:00
Initial time t2 (default constructor invoked) ­ standard format: 12:00:00 AM
t2 after call to setTime ­ military format: 09:45:35
t2 after call to setTime ­ standard format: 9:45:35 AM
After call to equals: times are NOT equal.
After call to lessThan: t1 is less than t2.
Enter hours, minutes, and seconds: 10 11 12
New time t1 after call to setTime ­ standard format: 10:11:12 AM
New time t1 after call to advanceSecs ­ standard format: 10:11:13 AM
New t2 after call to copy ­ standard format: 10:11:13 AM
Test toString for t2: 10:11:13 */
public class TimeClient {
    public static void main(String[] args) {
        Time t1 = new Time(8, 15, 30);
        Time t2 = new Time();
        
        System.out.println("Initial time t1 (alternate constructor invoked) ­ military format: " + t1.toMilitary());
        System.out.println("Initial time t1 (alternate constructor invoked) ­ standard format: " + t1.toStandard());

        System.out.println("Initial time t2 (default constructor invoked) ­ military format: " + t2.toMilitary());
        System.out.println("Initial time t2 (default constructor invoked) ­ standard format: " + t2.toStandard());

        t2.setTime(9, 45, 35);
        System.out.println("t2 after call to setTime ­ military format: " + t2.toMilitary());
        System.out.println("t2 after call to setTime ­ standard format: " + t2.toStandard());

        System.out.println("After call to equals: " + 
            (t1.equals(t2) ? "times are equal." : "times are NOT equal.")
        );

        System.out.println(
            "After call to lessThan: " + 
            (t1.lessThan(t2) ? "t1 is less than t2." : "t1 is NOT less than t2.")
        );

        t1.setTime(10, 11, 12);
        
        Scanner Console = new Scanner(System.in);

            System.out.print("Enter hours, minutes, and seconds: ");
                t1.setTime(
                    Console.nextInt(),
                    Console.nextInt(),
                    Console.nextInt()
                );
        

        System.out.println("New time t1 after call to setTime ­ standard format: " + t1.toStandard());
        t1.advanceSecs();
        System.out.println("New time t1 after call to advanceSecs ­ standard format: " + t1.toStandard());
        t2.copy(t1);
        System.out.println("New t2 after call to copy ­ standard format: " + t2.toStandard());
        System.out.println("Test toString for t2: " + t2.toString());

        
        System.out.println();
        System.out.println(
            "Part 1 & 2 Testing done: \nPress Enter for Part 3 "
        );

        Console.nextLine();
        Console.nextLine();
        Console.close();

        Test_Part3(t1, t2,"t1.equals(t2)");

        t2.advanceSecs();
        Test_Part3(t1, t2,"t1 < t2");

        

        t1.copy(t2);
        t1.advanceSecs();
        Test_Part3(t1, t2,"t1 > t2");
        
    }

    static void Test_Part3(Time t1,Time t2,String info){
        System.out.println("\n\nPart 3 Testing: (" + info +
            ")\nt1=  " + t1 +
            "\nt2=  " + t2 
        );
        System.out.println("(<) t1 less than t2: " + t1.lessThan(t2));
        System.out.println("(<=) t1 less or equal to t2: " + t1.lessOrEquals(t2));
        System.out.println("(>) t1 greater than t2: " + t1.greaterThan(t2));
        System.out.println("(>=) t1 greater or equal to t2: " + t1.greaterOrEquals(t2));
        System.out.println("(==) t1 equals t2: " + t1.equals(t2));
        System.out.println("(!=) t1 not equals t2: " + t1.notEquals(t2));
    }
}
