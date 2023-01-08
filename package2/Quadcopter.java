

package package2;

/**
 * class Quadcopter inherited from the class Helicopter
 * 
 * @author johnnyaldeb
 *
 */
public class Quadcopter extends Helicopter {
	
	// attribute 
	private int maxFlyingSpeed;




	/**
	 * 
	 * default constructor
	 * 
	 * Constructs and Initialized (the maxFlyingSpeed)
	 */
	 
	public Quadcopter() {
		
		this.maxFlyingSpeed = 600;
		
	}
	

	
	
	/**
	 * copy constructor
	 * 
	 * @param another Quadcopter object
	 */
	public Quadcopter(Quadcopter another) {
		
		setBrand(another.getBrand());
		setPrice(another.getPrice());
		setHersepower(another.getHorsepower());
		setNumberOfCylinders(another.getNumberOfCylinders());
		setCreationYear(another.getCreationYear());
		setPassengerCapacity(another.getPassengerCapacity());
		
		this.maxFlyingSpeed = another.maxFlyingSpeed;
	}
	
	
	/**
	 * parameterized constructor
	 * 
	 * Constructs and Initialized (brand, price, horsepower, number of cylinders, creation year, passenger Capacity, and maxFlyingspeed)
	 * 
	 * @param brand
	 * @param price
	 * @param horsepower
	 * @param numberOfCylinders
	 * @param creationYear
	 * @param passengerCapacity
	 * @param maxFlyingspeed
	 */
	public Quadcopter(String brand, double price, int horsepower, int numberOfCylinders, int creationYear, 
			           int passengerCapacity, int maxFlyingspeed) {
		
		super(brand, price, horsepower, numberOfCylinders, creationYear, passengerCapacity);
		this.maxFlyingSpeed = maxFlyingspeed;
		
		
	}
	
	
	
	/**
	 * toString method
	 * 
	 */
	public String toString() {
		return super.toString() + " The Max flying speed is: " + this.maxFlyingSpeed;
	}
	

	/**
	 * equals method
	 * compare two object from the same class
	 * 
	 * @return True if two object are the same, otherwise False
	 */
	public boolean equals(Object anotherObject) {
		
		if(anotherObject == null || this == null || this.getClass() != anotherObject.getClass()) {
			return false;
		}else {
			Quadcopter q = (Quadcopter) anotherObject;
			return  (this.brand.equalsIgnoreCase(q.brand) && this.price == q.price
					&& this.horsepower == q.horsepower && this.numberOfCylinders == q.numberOfCylinders
					&& this.creationYear == q.creationYear && this.passengerCapacity == q.passengerCapacity 
					&& this.maxFlyingSpeed == q.maxFlyingSpeed);
		}
	}
	
	
	//  accessors and mutators
	/**
	 * get maxFlyingSpeed value
	 * 
	 * @return maxFlyingSpeed
	 */
	public int getMaxFlyingSpeed() {
		return maxFlyingSpeed;
	}
     
	/**
	 * initialized the MaxFlyingSpeed
	 * 
	 * @param maxFlyingSpeed
	 */
	public void setMaxFlyingSpeed(int maxFlyingSpeed) {
		this.maxFlyingSpeed = maxFlyingSpeed;
	}
	
	

}
