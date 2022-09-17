package designcoffeemachine;

public class  Machine {

	
//		Machine capacity is=10L
		
		static int machine_capcity;
		static int each_drink=1;
		static int min=0;
		static int max=5;
		static boolean y=true;
		static boolean n=false;
		
		
		static boolean reply(String answer) {
			if(answer.equalsIgnoreCase("y")) {
			return true;
					} else  {
						return false;
					}
			
			
		}
//				Each Drink-1Litre
		
		
//				Coffee/Milk/Water Individual Capacity=5 Liter->=1 and less=5
		
//
//				Status-start, stop , refill
		
		
		
//
//				Admin can do-
		
//
//				startMachine()
//				stopMachine()
//				refillMachine(Cateogry(Coffee, water,milk)-(nameOfDrink,capacity)
//				Refill only when remainingcapacity<1liter-simple logics
//
//				You can only refill when machine is stopped()
//				After refill startMachine
//
//				Customer Can do-
//
//				getDrink(Category-(Coffee, water,milk))-
//
//				If machineCapacityLeft>1 only then getDrink()
//				Else
//				{
//				syso(“please ask admin to refill machine”)
//				}


	}


