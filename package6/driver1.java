

package package6;

import package1.Airplane;
import package2.Helicopter;
import package2.Quadcopter;
import package3.Multirotor;
import package4.UAV;
import package5.AgriculturalDrone;
import package5.MAV;

public class driver1 {
	
	
	public static void findLeastAndMostExpensiveUAV(FlyingObject[] arr) {
		double max = Integer.MIN_VALUE;
		double min = Integer.MAX_VALUE;
		boolean is = true;
		boolean are = true;
		double price;
		
		for(FlyingObject value: arr) {
			if(value instanceof UAV) {	
				if(value.getPrice() > max) {
					max = value.getPrice();
					
				}
				if(value.getPrice() < min) {
					min = value.getPrice();
					
				}
			}
		}
		
//		for(FlyingObject value: arr) {
		int j = 0;
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] instanceof UAV) {	
				j++;
				if(max == arr[i].getPrice() && min == arr[i].getPrice() ) {
					System.out.println("The most/least expensive from Class "+ arr[i].getClass().toString().substring(15)+" "+ arr[i]);
					break;
				}
				if(max == arr[i].getPrice() && are) {
					System.out.println("The most-expensive from Class "+ arr[i].getClass().toString().substring(15)+" "+ arr[i]);
					are = false;
				
				}
				if(min == arr[i].getPrice() && is) {
					System.out.println("The least-expensive from Class "+ arr[i].getClass().toString().substring(15)+" "+ arr[i]);
					is=false;
				
				}
			}
			
		}
	    if(j == 0) {
			System.out.println("There is no UAV object in this array");
		}
		
		
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		System.out.println("*************************************");
		System.out.println("display all Flying Object information");
		System.out.println("*************************************\n");
		
		
		Airplane a1 = new Airplane("Airbus A330", 1300.4, 30 );
		Airplane a2 = new Airplane("McDonnell" , 12.3, 20);
		Airplane a3 = new Airplane(a1);
		Airplane a4 = new Airplane();
		

		Helicopter h1 = new Helicopter("Bell", 10.7, 15, 4, 2020, 6);
		Helicopter h2 = new Helicopter("Mil Mi", 11.3, 17, 6, 2021, 8);
		Helicopter h3 = new Helicopter(h1);
		Helicopter h4 = new Helicopter();
		

		Quadcopter q1 = new Quadcopter("Parrot Anafi", 1000, 1, 2, 2021, 0, 60);
		Quadcopter q2 = new Quadcopter("Ryze Tello", 2000, 2, 3, 2022, 0, 80);
		Quadcopter q3 = new Quadcopter(q1);
		Quadcopter q4 = new Quadcopter();
		

		Multirotor m1 = new Multirotor("KingKong", 2500, 3, 3, 2022, 0, 4);
		Multirotor m2 = new Multirotor(m1);
		Multirotor m3 = new Multirotor();
		
		
		UAV u1 = new UAV(240.5, 70);
		UAV u2 = new UAV();
		
		
		AgriculturalDrone ag1 = new AgriculturalDrone(24.3, 8, "Parrot", 200);
		AgriculturalDrone ag2 = new AgriculturalDrone(ag1);
		

		MAV ma1 = new MAV(5, 700, "Honeywell",  2.1);	
		MAV ma2 = new MAV(3, 500, "T-Hawk", 1.4);
		
		FlyingObject[] arr = { a1,a2,a3,h1,h2,q1,q2,m1,m2,u1,u2,ag1,ag2,ma1,ma2};
		
		for(FlyingObject value: arr) {
			
			System.out.println("Class "+value.getClass().toString().substring(15)+": "+value);
		}
	
		
        System.out.println();
		System.out.println("***********************************************");
		System.out.println("Test the equality of some of the flying objects");
		System.out.println("***********************************************\n");
		
		
		System.out.println("Test equality of two objects from different classes: ");
		if(h1.equals(q1)) {
			System.out.println("Helicopter h1 & Quadcopter q1 are equal\n");
		}else {
			System.out.println("Helicopter h1 & Quadcopter q1 are NOT equal\n");
		}
		
		
		System.out.println("test equality of two objects from the same class with different values");
		if(a1.equals(a2)) {
			System.out.println("Airplane a1 & Airplane a2 are equal\n");
		}else {
			System.out.println("Airplane a1 & Airplane a2 are NOT equal\n");
		}
		

		System.out.println("test equality of two objects from the same class with similar values");
		if(m1.equals(m2)) {
			System.out.println("Multirotor a1 & Multirotor a2 are equal");
		}else {
			System.out.println("Multirotor a1 & Multirotor a2 are NOT equal");
		}
		//////////////////////////////
		System.out.println();
		System.out.println("***********************************");
		System.out.println("Find Least And Most Expensive UAV:");
		System.out.println("***********************************\n");
		
		// an array of 15 various objects 
		FlyingObject[] array1 = {a1,a2,a3,h1,h2,q1,q2,m1,m2,u1,u2,ag1,ag2,ma1,ma2};
		
		// an array of 15 various objects which not have any UAV objects.
		FlyingObject[] array2 = {a1,a2,a3,a4,h1,h2,h3,h4,q1,q2,q3,q4,m1,m2,m3};
		

		System.out.println("From array1 that consist of 15 various FlyingObjects:");
		findLeastAndMostExpensiveUAV(array1);
		System.out.println("\n");
		System.out.println("From array2 that consist of 15 various FlyingObjects with NO UAV object:");
		findLeastAndMostExpensiveUAV(array2);
		
		
		


		

	}

}


