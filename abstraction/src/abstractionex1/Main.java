package abstractionex1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//classA a = new classA();  //it is not possible because it is abstract class.so object is not create.
		classA a = new classB();
		
		a.show();
		
	}

}
