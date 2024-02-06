package method_overloading;

public class Multiply_driver {
	public static void main(String[] args)
    {
        
        System.out.println(Multiply_1.mul(2, 4));
        System.out.println(Multiply_1.mul(5.5, 6.3));
        
        Multiply_1 b= new Multiply_1();
        System.out.println(b.mul("BushraAkter"));
       
    }
}
