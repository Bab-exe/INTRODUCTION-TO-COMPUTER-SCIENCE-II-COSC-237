public class BoxClient {
    public static void main(String[] args) { // the testing client
        Box<Integer> intBox1 = new Box<Integer>();
        intBox1.setSize(50);
        intBox1.setItem(new Integer(237));
        System.out.println("intBox1--size == " + intBox1.getSize());
        System.out.println("intBox1--item == " + intBox1.getItem());
        intBox1.set(20, new Integer(200));
        Box<Integer> intBox2 = new Box<Integer>();
        intBox2.set(10, new Integer(100));
        System.out.println("intBox1.equals(intBox2) == " + intBox1.equals(intBox2));
        System.out.println("intBox1.compareTo(intBox2) == " + intBox1.compareTo(intBox2));
        Box<String> strBox1 = new Box<String>();
        strBox1.setSize(150);
        strBox1.setItem(new String("RAIN"));
        System.out.println("strBox1--size == " + intBox1.getSize());
        System.out.println("strBox1--item == " + intBox1.getItem());
        strBox1.set(5, new String("COSC236"));
        System.out.println(strBox1);
        Box<String> strBox2 = new Box<String>(150, new String("COSC236"));
        System.out.println("strBox1.equals(strBox2) == " + strBox1.equals(strBox2));
        strBox2.set(150, new String("COSC237"));
        System.out.println("strBox1.compareTo(strBox2) == " + strBox1.compareTo(strBox2));
        }
}

