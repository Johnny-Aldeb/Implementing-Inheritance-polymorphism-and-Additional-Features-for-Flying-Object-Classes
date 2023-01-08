// -----------------------------------------------------
//Written by: Johnny Aldeb
//Student ID: 40187248
//COMP249 Assignment #2
//Due Date: Friday, October 28, 2022
// -----------------------------------------------------

package package5;

import package4.UAV;

/**
 * Class AgriculaturalDron inhertied from UAV
 * 
 * @author johnnyaldeb
 *
 */
public class AgriculturalDrone extends UAV {
	
	// attributes
	private String brand;
	private int carryCapacity;
	
	
	/**
	 * default constructor
	 * 
	 * Constructs and Initialized (brand, carryCapacity)
	 */
	public AgriculturalDrone() {
		this.brand= "DJI Agras MG-1";
		this.carryCapacity = 2;
	}
	
	
	/**
	 * copy constructor
	 * 
	 * @param another AgriculaturalDron object
	 */
	public AgriculturalDrone(AgriculturalDrone another) {
		setWeight(another.getWeight());
		setPrice(another.getPrice());
		this.brand = another.brand;
		this.carryCapacity = another.carryCapacity;
	}
	
	
	/**
	 * parameterized constructor
	 * 
	 * Constructs and Initialized (weight, price, brand, carryCapacity)
	 * 
	 * @param weight
	 * @param price
	 * @param brand
	 * @param carryCapacity
	 */
	public AgriculturalDrone(double weight, double price, String brand, int carryCapacity){
		super(weight, price);
		this.brand = brand;
		this.carryCapacity = carryCapacity;
		
	}
	
	
	/**
	 * toString method
	 */
	public String toString() {
		return super.toString()+", The brand is: "+ this.brand +", The carry capacity is: "+ this.carryCapacity;
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
			AgriculturalDrone a = (AgriculturalDrone) anotherObject;
			return (this.weight == a.weight && this.price == a.price && this.brand.equalsIgnoreCase(a.brand)&& 
					this.carryCapacity == a.carryCapacity);
			}
	}
	
	
	// accessors and mutators
	
	/**
	 * get the brand value
	 * 
	 * @return brand
	 */
	public String getBrand() {
		return brand;
	}
	
 
	/**
	 * initialized the brand
	 * 
	 * @param brand
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * get the carryCapacity value
	 * 
	 * @return carryCapacity 
	 */
	public int getCarryCapacity() {
		return carryCapacity;
	}

	/**
	 * initialized the carryCapacity 
	 * 
	 * @param carryCapacity
	 */
	public void setCarryCapacity(int carryCapacity) {
		this.carryCapacity = carryCapacity;
	}

}
