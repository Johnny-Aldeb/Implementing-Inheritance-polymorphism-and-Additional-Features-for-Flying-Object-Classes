

package package2;

import package1.Airplane;

/**
 * class helicopter inherited from the class Airplane
 * 
 * @author johnnyaldeb
 *
 */
public class Helicopter extends Airplane {
	
	// attributes
	protected int numberOfCylinders;
	protected int creationYear;
	protected int passengerCapacity;
	
	

	/**
	 * default constructor
	 * 
	 * Constructs and Initialized (number of cylinders, creation year, and passenger Capacity)
	 */
	public Helicopter() {
		super();
		this.numberOfCylinders = 6;
		this.creationYear = 2021;
		this.passengerCapacity = 5;
		
		
	}
	
	
	/**
	 *  copy constructor
	 *  
	 * @param another Helicopter object
	 */
	public Helicopter(Helicopter another) {
		
		setBrand(another.getBrand());
		setPrice(another.getPrice());
		setHersepower(another.getHorsepower());
		
		this.numberOfCylinders = another.numberOfCylinders;
		this.creationYear = another.creationYear;
		this.passengerCapacity = another.passengerCapacity;
		
	}
	
		
	/**
	 * parameterized constructor
	 * 
	 * Constructs and Initialized (brand, price, horsepower, number of cylinders, creation year, and passenger Capacity)
	 * 
	 * @param brand
	 * @param price
	 * @param horsepower
	 * @param numberOfCylinders
	 * @param creationYear
	 * @param passengerCapacity
	 */
	public Helicopter(String brand, double price, int horsepower, int numberOfCylinders, int creationYear, int passengerCapacity) {
		
		super(brand, price, horsepower);
		this.numberOfCylinders = numberOfCylinders;
		this.creationYear = creationYear;
		this.passengerCapacity = passengerCapacity;
		
		
	}
	

	/**
	 *  toString method
	 */
	public String toString() {
		return super.toString()+", The number of cylinders is: " + this.numberOfCylinders +", The creation year is: "+ this.creationYear +", The passenger capacity is: "+ this.passengerCapacity;
	}
	
	
	/**
	 * equals method
	 * 
	 * compare two object from the same class
	 * 
	 * @return True if two object are the same, otherwise False
	 */
	public boolean equals(Object anotherObject) {
		
		if(anotherObject == null || this == null || this.getClass() != anotherObject.getClass()) {
			return false;
		} else {
			Helicopter h = (Helicopter) anotherObject;
		    return (this.brand.equalsIgnoreCase(h.brand) && this.price == h.price
					&& this.horsepower == h.horsepower && this.numberOfCylinders == h.numberOfCylinders
					&& this.creationYear == h.creationYear && this.passengerCapacity == h.passengerCapacity);
			
		}
	}
	
	
	
    //  accessors and mutators
	
	/**
	 * get the number of cylinder value
	 * 
	 * @return numberOfCylinder
	 */
	public int getNumberOfCylinders() {
		return numberOfCylinders;
	}

	/**
	 * initialized the number of cylinder 
	 * 
	 * @param numberOfCylinders
	 */
	public void setNumberOfCylinders(int numberOfCylinders) {
		this.numberOfCylinders = numberOfCylinders;
	}
	
    /**
     * get the creation year value
     * 
     * @return creation year
     */
	public int getCreationYear() {
		return creationYear;
	}

	/**
	 * initialized the creation year
	 * 
	 * @param creationYear
	 */
	public void setCreationYear(int creationYear) {
		this.creationYear = creationYear;
	}
    
	/**
	 * get the passenger Capacity value
	 * 
	 * @return passenger capacity
	 */
	public int getPassengerCapacity() {
		return passengerCapacity;
	}
    
	/**
	 * initialized the passenger capacity
	 * 
	 * @param passengerCapacity
	 */
	public void setPassengerCapacity(int passengerCapacity) {
		this.passengerCapacity = passengerCapacity;
	}

}
