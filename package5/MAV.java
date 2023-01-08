// -----------------------------------------------------
//Written by: Johnny Aldeb
//Student ID: 40187248
//COMP249 Assignment #2
//Due Date: Friday, October 28, 2022
// -----------------------------------------------------

package package5;

import package4.UAV;

/**
 * 
 * class MAV inherited from the class UAV
 * @author johnnyaldeb
 *
 */
public class MAV extends UAV {
	
	// attributes
	private String model;
	private double size;
	
	
	/**
	 * default constructor 
	 * 
	 * Constructs and Initialized (model, size)
	 */
	public MAV() {
		this.model ="Bumble Bee";
		this.size = 4.5;
	}
	
	
	/**
	 * copy constructor 
	 * 
	 * 
	 * @param another MAV object
	 */
	public MAV(MAV another) {
		setWeight(another.getWeight());
		setPrice(another.getPrice());
		this.model = another.model;
		this.size = another.size;
	}
	
	
	/**
	 * parameterized constructor
	 * 
	 * Constructs and Initialized (weight, price, model, size)
	 * 
	 * @param weight
	 * @param price
	 * @param model
	 * @param size
	 */
	public MAV(double weight, double price, String model, double size) {
		super(weight, price);
		this.model = model;
		this.size = size;
		
	}
	
	
	/**
	 * toString method
	 */
	public String toString() {
		return super.toString()+", The model is: "+ this.model +", The size is: "+ this.size;
		
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
			 MAV ma = (MAV) anotherObject;
			return (this.weight == ma.weight && this.price == ma.price && this.model.equalsIgnoreCase(ma.model)
					&& this.size == ma.size);
			}
	}
	
	
	// accessors and mutators
	/**
	 * get the model value
	 * 
	 * @return model
	 */
	public String getModel() {
		return model;
	}

    /**
     * initialized the model
     * 
     * @param model
     */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * get the size value
	 * 
	 * @return size
	 */
	public double getSize() {
		return size;
	}

	/**
	 * initialized the size 
	 * 
	 * @param size
	 */
	public void setSize(double size) {
		this.size = size;
	}

}
