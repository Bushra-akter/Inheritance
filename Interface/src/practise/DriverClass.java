package practise;

public class DriverClass implements Int2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DriverClass g=new DriverClass();
		int add=g.sum();
		g.display(add);
		
				

	}
   
	
	@Override
	public int sum() {
		// TODO Auto-generated method stub
		
		int c= a+b;
		return c;
	}

	@Override
	public void display(int c) {
		// TODO Auto-generated method stub
		
		System.out.println(c);
		
	}

}
