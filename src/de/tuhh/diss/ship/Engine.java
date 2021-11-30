package de.tuhh.diss.ship;

public class Engine {
	
	private Tank tank;
	private double speed;
	private double fuelConsumption;
	private double distanceTotal;
	private double distanceSinceFilled;
	
	 public Engine(double fuelConsumption, double speed, double tankVolume)
	 {
	   this.setTank (new Tank(tankVolume));
	   this.speed =speed;
	   this.fuelConsumption = fuelConsumption;
	   this.distanceTotal= 0.0;
	   this.distanceSinceFilled =0.0;
	 
}
	 
	
	 public double run(double distance) {
		 
		 double neededFuelAmount = (1/this.speed)* this.fuelConsumption * distance;
		 double consumedFuel = this.tank.consume(neededFuelAmount);
		 if (consumedFuel >= neededFuelAmount) {
			 
			 this.setDistanceTotal(distance);
			 this.setDistanceSinceFilled(distance);
			 return distance;
		 }
		 else {
			 double actualDistance = consumedFuel *this.speed *(1/this.fuelConsumption);
			 this.setDistanceTotal(actualDistance);
			 this.setDistanceSinceFilled(actualDistance);
			 return actualDistance;
		 }
		 
	 }
	 
	 
	 public void resetMeter() {
		 this.distanceSinceFilled=0.0;
	 }
	 
	  
	public double getDistanceTotal() {
		return distanceTotal;
	}

	public void setDistanceTotal(double distanceTotal) {
		this.distanceTotal += distanceTotal;
	}

	public double getDistanceSinceFilled() {
		return distanceSinceFilled;
	}

	public void setDistanceSinceFilled(double distanceSinceFilled) {
		this.distanceSinceFilled += distanceSinceFilled;
	}

	public Tank getTank() {
		return tank;
	}

	public void setTank(Tank tank) {
		this.tank = tank;
	}


	/**
	 * @return the sp
	 */
	public double getSpeed() {
		return speed;
	}


	/**
	 * @param sp the sp to set
	 */
	public void setSpeed(double speed) {
		this.speed = speed;
	}


	/**
	 * @return the fuelConsumptio
	 */
	public double getFuelConsumption() {
		return fuelConsumption;
	}


	/**
	 * @param fuelConsumptio the fuelConsumptio to set
	 */
	public void setFuelConsumption(double fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}
	 
	 
	 
	 
}
	 
