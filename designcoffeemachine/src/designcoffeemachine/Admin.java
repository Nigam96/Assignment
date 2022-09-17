package designcoffeemachine;

import java.util.Scanner;

public class Admin extends Machine{
	
	static Scanner input=new Scanner(System.in);
	
	static int coffee=5;
	static int milk=5;
	static int water=5; 
	
public Admin() {
		super();
		machine_capcity=coffee+milk+water;
	}
public static void startMachine(){
	String s="Would you like to continue Press Y";
	String d="Or refill Press N";
	System.out.println("hey machine has started.The remaining amount is "+Machine.machine_capcity+" litre");
	System.out.println(s+"\n"+d+"\n" );
	if(input.next().equalsIgnoreCase("y")) {
		//customer method activated
		if(machine_capcity>5) {
		Customer.getDrink();
		}else {
			System.out.println("Please ask admin to refill the machine" );
			
			System.out.println(machine_capcity);
			//refillMachine(input.next(),input.nextInt());
		}
	}else {
		System.out.println("Returning to admin");
		Admin.stopMachine();
		
	}
	
}
 static void stopMachine() {
	System.out.println("machine status:stop");
}
 static void stopMachine(String Category, int amount) {
	System.out.println("okay thank you and visit again.........");
	System.out.println("Hey Admin : do you want to stop the coffee machine  : yes or no"+"\n");
	if(!reply(input.next())) {
	Customer.getDrink();
	}else {
		System.out.println("machine status:stop");
	}
}
 
	

  static void refillMachine(String category,int amount) {
	
	System.out.println("please wait for refill...........");
//while (coffee<5 || milk<5 || water<5) {
	
	if(category=="coffee" && amount<=5 ) {
		//refill coffee
		 coffee+=amount;
		if(coffee<=5) {
			System.out.println("The "+category+" refilled to "+coffee);
			System.out.println(" amount of coffee in machine: "+coffee);
			Customer.getDrink();
		}else {
			System.out.println("plz put amount less than or equal to"+(5-coffee));
		}
	}else if (category=="milk" && amount<=5) {
		//refill milk;
		 milk+=amount;
			if(milk<=5) {
				System.out.println("The "+category+" refilled to "+milk);
				Customer.getDrink();
			}else {
				System.out.println("plz put amount less than or equal to"+(5-milk));
			}
	}else {
		//refill water;
		water+=amount;
		if(water<=5) {
			System.out.println("The "+category+" refilled to "+water);
			Customer.getDrink();
		}else {
			System.out.println("plz put amount less than or equal to"+(5-water));
		}
	}

	
}

}

