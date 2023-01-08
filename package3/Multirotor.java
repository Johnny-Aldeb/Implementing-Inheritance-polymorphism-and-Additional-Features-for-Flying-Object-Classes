

package package3;

import package2.Helicopter;

/**
 * class Multirotor inherited from the class Helicopter
 * 
 * @author johnnyaldeb
 *
 */
public class Multirotor extends Helicopter{
	
	// attribute 
	private int numberOfRotors;
	

	
	/**
	 *  default constructor
	 *  
	 *  Constructs and Initialized (numberOfRotors)
	 */
	public  Multirotor() {
		this.numberOfRotors = 2;
	}
	
	
	/**
	 * copy constructor
	 * 
	 * @param another Multirotor object
	 */
	public Multirotor(Multirotor another) {
		setBrand(another.getBrand());
		setPrice(another.getPrice());
		setHersepower(another.getHorsepower());
		setNumberOfCylinders(another.getNumberOfCylinders());
		setCreationYear(another.getCreationYear());
		setPassengerCapacity(another.getPassengerCapacity());
		
		this.numberOfRotors = another.numberOfRotors;
	}
	
	
	/**
	 * parameterized constructor
	 * 
	 * Constructs and Initialized (brand, price, horsepower, number of cylinders, creation year, passenger Capacity, and numberOfrotors)
	 * 
	 * @param brand
	 * @param price
	 * @param horsepower
	 * @param numberOfCylinders
	 * @param creationYear
	 * @param passengerCapacity
	 * @param numberOfRotors
	 */
	public Multirotor(String brand, double price, int horsepower, int numberOfCylinders, int creationYear, 
	                  int passengerCapacity, int numberOfRotors) {

           super(brand, price, horsepower, numberOfCylinders, creationYear, passengerCapacity);
           this.numberOfRotors = numberOfRotors;


    }
	
	
	/**
	 * toString method
	 * 
	 */
	public String toString() {
		return super.toString() + ", The Number of Rotors is: " + this.numberOfRotors;
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
				Multirotor m = (Multirotor) anotherObject;
				return  (this.brand.equalsIgnoreCase(m.brand) && this.price == m.price
						&& this.horsepower == m.horsepower && this.numberOfCylinders == m.numberOfCylinders
						&& this.creationYear == m.creationYear && this.passengerCapacity == m.passengerCapacity 
						&& this.numberOfRotors == m.numberOfRotors);
			}
	}
	
	
	// accessors and mutators
	/**
	 * get numberOfRotors value
	 * 
	 * @return numberOfRotors
	 */
	public int getNumberOfRotors() {
		return numberOfRotors;
	}

	/**
	 * initialized numberOfRotors 
	 * 
	 * @param numberOfRotors
	 */
	public void setNumberOfRotors(int numberOfRotors) {
	    this.numberOfRotors = numberOfRotors;
	}
	
	

}
