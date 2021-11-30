package de.tuhh.diss.ship;

public class Tank {
	
	private double totalVolume; // the volume in liters the tank is able to store
	private double fillLevel;  // the amount of current fuel in liters 
	
	public Tank(double totalVolume) {
		
		this.setTotalVolume(totalVolume);
		this.setFillLevel(0.0);
	}
	
  public double fill(double amount)
  {
     double remainingVolume = this.getTotalVolume()-this.getFillLevel();
     
	  if (amount <= remainingVolume)
	  {
		  this.fillLevel += amount;
       }
	  else {
		  
		  amount = remainingVolume;
		  this.fillLevel += amount;
		  
	  }
	  return amount;
         
}
  
  
  public double consume(double amount) {
	  
	  if (amount <= this.fillLevel) {
		  this.fillLevel -= amount;
		  return amount;
	  }
	  else {
		  double excessAmount = this.fillLevel;
		  this.fillLevel =0;
		  return excessAmount;
	  }
	  
  }
  
 
   public double getTotalVolume() {
	return totalVolume;
}


  public void setTotalVolume(double totalVolume) {
	this.totalVolume = totalVolume;
}


  public double getFillLevel() {
	return fillLevel;
}


   public void setFillLevel(double fillLevel) {
	this.fillLevel = fillLevel;
}
   
  

}
