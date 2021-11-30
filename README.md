## Sailing Ship

**OOP Classes** for simulating a ship regarding mileage and fuel consumption. The classes Ship, Engine and Tank represent their material equivalents. 

**Class Tank** is described by its total volume, i.e. the volume in liters the tank is able to store at maximum. Tank also has a member fill level, i.e. the amount of fuel in liters which is currently inside the tank.
After instantiation of Tank, the fill level of the tank is zero. Class Tank offers a method to fill a given amount of fuel in liters into the tank. 
Since the given amount might be greater than the remaining volume in the tank, the method returns the volume of fuel which was filled into the tank dependent on the prior fill level.
Additionally, class Tank offers a method to remove a given amount in liters from the tank.
Since the requested amount might be greater than the current fill level, the method returns the amount which was removed.

**Class Engine** is described by its fuel consumption (in liters per hour), the speed (in knots = nautical miles per hour) and the volume (in liters) of the contained tank. 
Every Engine has an object of class Tank with corresponding volume. Apart from its tank and the parameters passed in the constructor, Engine also has a counter for tracking the total distance traveled (in nautical miles) and to track the distance since last filling of its tank (in nautical miles). 
Both counters are set to zero at instantiation.
Class Engine offers a method for resetting the counter of the traveled distance since last filling by calling method resetMeter().
The engine is turned on and set running via method run(...). The method is called with a given distance in nautical miles as input parameter. 
It calculates the needed amount of fuel for traveling the given distance, consumes it from the tank, updates its distance counters and returns the actually traveled distance.

**Class Ship** is described by its name, its fuel consumption (in liters per hour) its tank volume (in liters) and its speed (in knots = nautical miles per hour). 
It has an an object of class Motor, which is created at instantiation of Ship. The attributes for speed, fuel consumption and tank volume are not members of class Ship but are used for creation of its Engine. 
The name of the ship is only set once during object creation and may not be changed.

The method sailForward(...) moves the ship by running the motor for the given distance. 
With the assumption that the ship stops immediately once the motor stops running. Via fill(...), the tank of the motor is filled with the given amount in liters.
Additionally, the counter of the motor for tracking the distance since last filling is reset.
The remaining get*(...) methods only return the value of the members of the owned object (of class Engine).

A test **class ShipTest** is implemented to ensure compatibility, with all public methods and constructors exactly as described above. 
The program is tested at the end via the provided ShipTest class to verify correct behavior.

**Class TurboEngine** is inherited from the Engine class, the TurboEngine is described by its fuel consumption, the speed and the volume of its tank.
Additionally, it offers a Turbo Mode, which can be turned on and off. When the Turbo Mode is turned on, the speed increases by 50% and the fuel consumption by 100%. If the Turbo Mode is turned off, the values of speed and fuel consumption decrease to their original values.
