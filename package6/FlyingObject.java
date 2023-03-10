

package package6;

/**
 * Class FlyingObject is the base class
 * 
 * @author johnnyaldeb
 *
 */
public class FlyingObject {
	
	protected double price;
	
	
	/**
	 * default constructor 
	 */
	public FlyingObject() {
		
	}
	/**
	 * copy constructor
	 * 
	 * @param flyingObject
	 */
	public FlyingObject(FlyingObject flyingObject) {
		
	}


	/**
	 * toString method
	 */
	public String toString() {
		return "This is the Flying Object with price= " +this.price;
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
