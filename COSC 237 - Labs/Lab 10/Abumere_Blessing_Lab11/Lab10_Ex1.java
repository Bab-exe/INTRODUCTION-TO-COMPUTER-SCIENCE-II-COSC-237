//Client for user­defined classes
//LinkedStackClass and QueueClass
//Methods (missing here): printStack, printQueue
import java.util.*;
public class Lab10_Ex1 {
static Scanner input = new Scanner(System.in);
public static void main(String[] args) {
LinkedStackClass<Character> s = new LinkedStackClass<Character>();
QueueClass<Character> q = new QueueClass<Character>(10);
Character ch;
for(ch = 'A'; ch <= 'H'; ch++)
s.push(ch);
System.out.println("Initial stack is: ");
printStack(s);
for(int i = 1; i <= 4; i++) {
s.pop();
q.enqueue(s.peek());
s.pop();
q.enqueue(s.peek());
s.push(q.front());
q.dequeue( );
}
System.out.println("\nFinal stack is: ");
printStack(s);
System.out.println("\nThe queue is: ");
printQueue(q);
}
//method definition for printStack
//method definition for printQueue
}