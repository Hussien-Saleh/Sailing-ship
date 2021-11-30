package de.tuhh.diss.ship;

public class Ship {

	private Engine engine;
	private  String name;
	
	  public Ship(String name, double fuelConsumption, double tankVolume, double speed) {
		  
		  this.setEngine(new Engine(fuelConsumption, speed, tankVolume));
       	  this.setName(name);
	  }
	  
	  public double sailForward(double distance) {
		  return this.getEngine().run(distance);
		  
	  }
	  
	  public double fillTank(double amount) {
		  this.getEngine().resetMeter();
		  return this.getEngine().getTank().fill(amount);
		  
	  }
	  
	  public double getTankFillLevel() {
		  return this.getEngine().getTank().getFillLevel();
		  
	  }
	  
	  public double getDistanceTotal() {
		  return this.getEngine().getDistanceTotal();
		  
	  }
	  
	  public double getDistanceSinceFilled() {
		  return this.getEngine().getDistanceSinceFilled();
	  }

	  

	
	public  String getName() {
		return name;
	}

	/**
	 * @return the engine
	 */
	public Engine getEngine() {
		return engine;
	}

	/**
	 * @param engine the engine to set
	 */
	public void setEngine(Engine engine) {
		this.engine = engine;
	}


   public void setName(String name) {
		this.name = name;
	}
	
	
}
