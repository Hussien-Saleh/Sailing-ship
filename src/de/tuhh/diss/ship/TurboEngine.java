package de.tuhh.diss.ship;

public class TurboEngine extends Engine{

	private boolean turboMode;
	private boolean previousMode;
	
	public TurboEngine(double fuelConsumption, double speed, double tankVolume) {
	
		super(fuelConsumption,speed, tankVolume);
     //   this.turnTurbo(turboMode);
	    
		 this.turboMode = false;
         this.previousMode= false;
	}
	
	public void turnTurbo(boolean turboMode)
	{

		if(turboMode && !previousMode) {
			super.setSpeed(getSpeed()*1.5);
			super.setFuelConsumption(getFuelConsumption()*2);
			previousMode = turboMode;
		}
		
		else {
			if (previousMode != turboMode) {
			
			super.setSpeed(getSpeed()/1.5);
			super.setFuelConsumption(getFuelConsumption()/2);
			previousMode = false;
			}
			
		}
		
		
		
	}

	
	
	/**
	 * @return the turboMode
	 */
	public boolean isTurboMode() {
		return turboMode;
	}

	/**
	 * @param turboMode the turboMode to set
	 */
	public void setTurboMode(boolean turboMode) {
		this.turboMode = turboMode;
	}
}
