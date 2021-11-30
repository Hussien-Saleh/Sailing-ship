package de.tuhh.diss.ship;

 public class Main {

	
	public static void main(String[]args) {
		
	//	Tank a = new Tank(10.0);
	//    System.out.println(a.fill(9.0));
	//    System.out.println(a.fill(2.0));
		
		TurboEngine a = new TurboEngine(10.0, 5.0, 4.0);
	
		a.turnTurbo(true);	
		System.out.println(a.getSpeed());
		
		a.turnTurbo(true);
		System.out.println(a.getSpeed());
		
		a.turnTurbo(true);
		System.out.println(a.getSpeed());
		
		a.turnTurbo(false);
		System.out.println(a.getSpeed());
		
		
		
		
	}
}

