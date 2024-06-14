
public class ClientFigures {

 public static final int MAX = 3;

 public static void main(String[] args) {

  Figure[] fig = new Figure[MAX];

  fig[0] = new Rectangle(37, 20);

  fig[1] = new Triangle(37, 20, 30);

  fig[2] = new Circle(0, 0, 37);

  int sides;

   

  for (int i = 0; i < fig.length; i++) {

   sides = fig[i].getSideCount();

   switch(sides) {

    case 0:

     System.out.print("\nThis is a circle. ");

     break;

    case 3:

     System.out.print("\nThis is a triangle. ");

     break;

    case 4:

     System.out.print("\nThis is a rectangle. ");

   }

   System.out.printf("Area = %.2f", fig[i].getArea());

   System.out.printf(". Perimeter = %.2f\n", fig[i].getPerimeter());

   System.out.println("Output calling the method printInfo - polymorphism at work!");

   printInfo(fig[i]);

  }

 }

  

 //Any object that implements the interface may be passed as parameter to this method.

 public static void printInfo(Figure f) {

  System.out.println("For this figure: " + f);

  System.out.printf("Area = %.2f", f.getArea());

  System.out.printf("; Perimeter = %.2f\n", f.getPerimeter());

 }

}