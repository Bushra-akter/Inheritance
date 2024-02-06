package vechicle;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bicycle b=new Bicycle();
		Car c=new Car();
		
		b.changeGear(2);
		c.changeGear(5);
		
		b.speedUp(2);
		c.speedUp(5);
		
		b.applyBrakes(3);
		c.applyBrakes(6);
		
		b.dispplay();
		c.display();
		
		
		

	}

}
