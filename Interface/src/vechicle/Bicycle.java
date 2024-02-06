package vechicle;

public class Bicycle implements Vehicle {

	 int speed,gear;

	@Override
	public void changeGear(int a) {
		// TODO Auto-generated method stub
		
		gear=a;
		
		
	}

	@Override
	public void speedUp(int a) {
		// TODO Auto-generated method stub
		
		speed+=a;
		
	}

	@Override
	public void applyBrakes(int a) {
		// TODO Auto-generated method stub
		
		speed-=a;
		
	}
	
	
	public void dispplay() {
		System.out.println("gear"+gear+"speed"+speed);
		}
}
