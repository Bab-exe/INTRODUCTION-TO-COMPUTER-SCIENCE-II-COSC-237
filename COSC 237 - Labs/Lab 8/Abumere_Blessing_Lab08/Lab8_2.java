//Testing the method scaleByK using the Java ArrayList class
import java.util.ArrayList;
public class Lab8_2 {
public static void main(String[] args) {
ArrayList <Integer> list = new ArrayList <Integer>();
list.add(2);
list.add(4);
list.add(-2);
list.add(5);
list.add(3);
list.add(0);
list.add(7);
System.out.println("The original list is: ");
print(list);
System.out.println("The list after method call is: ");
scaleByK(list);
print(list);
}
public static void scaleByK(ArrayList<Integer> list) {
    java.util.HashSet<Integer> unique = new java.util.HashSet<Integer>();

    for (int i = 0; i < list.size(); i++){
        unique.add(list.get(i));
    }

    Integer[] temp = unique.toArray(new Integer[unique.size()]);

    list.clear();

    for (Integer value: temp){
        for (int i = 0; i < value;i++){
            list.add(value);
        }
    }

}
public static void print(ArrayList <Integer> someList) {
for(Integer i:someList)
System.out.print(i + " ");
System.out.println();
}
}
