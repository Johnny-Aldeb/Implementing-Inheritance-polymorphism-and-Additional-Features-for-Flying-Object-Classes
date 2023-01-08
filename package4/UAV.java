// -----------------------------------------------------
//Written by: Johnny Aldeb
//Student ID: 40187248
//COMP249 Assignment #2
//Due Date: Friday, October 28, 2022
// -----------------------------------------------------
package package4;

import package6.FlyingObject;

/**
 * class UAV inherited from the class FlyingObject
 * 
 * @author johnnyaldeb
 *
 */
public class UAV extends FlyingObject {
	
	// attributes
	protected double weight;
	protected double price;
	
	
	/**
	 * default constructor
	 * 
	 * Constructs and Initialized (weight, price)
	 */
	public UAV() {
		this.weight = 300.65;
		this.price = 100;
	}
	
	
	/**
	 * copy constructor
	 * 
	 * @param another UAV object
	 */
	public UAV(UAV another) {
		this.weight = another.weight;
		this.price = another.price;
	}
	
	
	/**
	 * parameterized constructor
	 * 
	 * constructs and Initialized (weight, price)
	 * 
	 * @param weight
	 * @param price
	 */
	public UAV(double weight, double price) {
		this.weight = weight;
		this.price = price;
		
	}
	
	
	/**
	 * toString method
	 */
	public String toString() {
		return "The weight is: "+ this.weight +", The price is: "+ this.price;
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
		}else {
			UAV u = (UAV) anotherObject;
			return (this.weight == u.weight && this.price == u.price);
		}
	}
	
	//  accessors and mutators
	
	/**
	 * get weight value
	 * 
	 * @return weight 
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * initialized the weight
	 * 
	 * @param weight
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * get the price value
	 * 
	 * @return price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * initialized the price
	 * 
	 * @param price
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	

}
