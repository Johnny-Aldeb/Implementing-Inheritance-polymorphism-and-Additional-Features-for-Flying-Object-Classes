

package package1;

import package6.FlyingObject;

/**
 * class Airplane inherited from the class FlyingObject
 * @author johnnyaldeb
 *
 */
public class Airplane extends FlyingObject{
	
	// attributes 
	protected String brand;
	protected double price;
	protected int horsepower;
	
	
	
	/**
	 * default constructor
	 * 
	 * Constructs and Initialized (the brand, price, and horsepower)
	 */
	public Airplane(){
		this.brand = "Boeing";
		this.price = 20.77;
		this.horsepower = 40;
		
	}
	

	/**
	 * copy constructor
	 * 
	 * @param another Airplane object
	 */
	public Airplane(Airplane another) {
		this.brand = another.brand;
		this.price = another.price;
		this.horsepower = another.horsepower;
		
	}
	
	
	/**
	 * parameterized constructor
	 * 
	 * Constructs and Initialized (brand, price, horsepower)
	 * @param brand
	 * @param price
	 * @param horsepower
	 */
	public Airplane(String brand, double price, int horsepower) {
		this.brand = brand;
		this.price = price;
		this.horsepower = horsepower;
	}
	
	
	/**
	 * toString method
	 * 
	 */
	public String toString() {
		
		return "The Brand is: "+ this.brand +", The Price is: "+this.price +", and The horsepower is: "+ this.horsepower;
	}
	
	
	

	

	/**
	 * equals method
	 * 
	 * compare two object from the same class
	 * 
	 * @return True if two object are the same, otherwise False
	 *
	 */
	public boolean equals(Object otherObject) {
		
		if(otherObject == null || this == null || this.getClass() != otherObject.getClass()) {
			return false;
		}else {
			Airplane a = (Airplane) otherObject;
			return (this.brand.equalsIgnoreCase(a.brand) && this.price == a.price && this.horsepower == a.horsepower);
		}
		
	}
	
	
	
	
	//  accessors and mutators
	
	/**
	 * get the brand value
	 *  
	 * @return brand 
	 */
	public String getBrand() {
		return brand;
	}
	
	/**
	 * initialize the brand 
	 * 
	 * @param brand
	 */
	public void setBrand(String brand) {
		this.brand = brand;
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
	 * initialize the price
	 * 
	 * @param price 
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * get the horsepower value
	 * 
	 * @return horsepower
	 */
	public int getHorsepower() {
		return horsepower;
	}
	
	/**
	 * initialized the horsepower
	 * 
	 * @param horsepower
	 */
	public void setHersepower(int horsepower) {
		this.horsepower = horsepower;
	}
	

}
