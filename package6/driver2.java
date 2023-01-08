package package6;

import package1.Airplane;
import package2.Helicopter;
import package2.Quadcopter;
import package3.Multirotor;
import package4.UAV;
import package5.AgriculturalDrone;
import package5.MAV;

public class driver2 {
	
	public static FlyingObject[] copyFlyingObjects(FlyingObject[] fy) {	

		FlyingObject[] fyob = new FlyingObject[fy.length];	
													
		for (int i = 0; i < fyob.length; i++)	
		{
			 fyob [i] = new FlyingObject(fy [i]);		
		} 
		return fyob;
	}

	public static void main(String[] args) {
		
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
		
		
		FlyingObject[] arr5 = { a1,a2,a3,h1,h2,q1,q2,m1,m2,u1,u2,ag1,ag2,ma1,ma2 };
		
		
		System.out.println("\nHere is the information of the copy FlyingObject:\n");
		
		// Called copyFlyingObjects to copy arr4
		FlyingObject[] arrCopy = copyFlyingObjects(arr5);
		for(FlyingObject value: arrCopy) {
			System.out.println("Class "+value.getClass().toString().substring(15)+": "+value);
		}
	

	}

}
