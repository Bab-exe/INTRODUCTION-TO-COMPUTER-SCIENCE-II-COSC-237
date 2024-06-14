//main client
public class Abumere_HW_02_01
{
    public static void main(String[] args)
    {     
        ComplexNumber n1 = new ComplexNumber(2.78,3.53948);
        ComplexNumber n2 = new ComplexNumber(4,5);
        
        n1 = new ComplexNumber(1.78,4.50);
        n2 = new ComplexNumber(3.56,8.90);

        n1.subtract(n2);
        System.out.println(n1);
    }


}