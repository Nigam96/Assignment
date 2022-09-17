package designcoffeemachine;

public class Customer extends Admin {
	
	
	 static void getDrink() {
		 
		 
		
//	do while(true)	{
//		
//	}
//		 while(Machine.reply(ans)) {
			System.out.println("hey buddy,Welcome to Nigam's Coffee Machine !!!!!"
					+ "what would you like today"+"\n"+"1.coffee"+"\n"+"2.water"+"\n"+"3.milk");
			String category = input.next();
			System.out.println("please Enter the amuont: ");
			int amount=input.nextInt();
			
		switch(category) {
		case "coffee":
			//calling coffee method
			coffee(amount);
			break;
			
		case "milk":
			//calling milk method
			milk(amount);
			break;
				
		case "water":
			//calling method
			water(amount);
			break;
		default:
			System.out.println("sorry selected category is not present");
		}
		
		}
	
	
	static void coffee(int amount) {
		String ans;
		
		if(amount<=coffee ) {
			System.out.println("your "+amount+" liter coffee is available");
			coffee=coffee-amount;
			System.out.println("the remaining coffee left in machine: "+coffee);
			System.out.println("Would you like to have something else | if yes type 'y' or type 'n' ");//condition
			ans =input.next();
		//	while (reply(ans)) {
			
			if(coffee<max && ans.equalsIgnoreCase("y")) {
				System.out.println("wait ........for filling");
				refillMachine("coffee",max-coffee);			
			}else if(coffee<=max && ans.equalsIgnoreCase("n")){
				System.out.println("machine will now goes to admin control");
				stopMachine("coffee",max-coffee);
				
			}else {
				getDrink();
			}
			
			}else {
			System.out.println("the entered amount is not avialble");
			System.out.println("please waqit for refill...........");
			refillMachine("coffee",max-coffee);
		}
		
}
	static void milk(int amount) {String ans;
	
	if(amount<=milk ) {
		System.out.println("your "+amount+" liter coffee is available");
		milk=milk-amount;
		System.out.println("the remaining milk left in machine: "+milk);
		System.out.println("Would you like to have something else | if yes type 'y' or type 'n' ");//condition
		ans =input.next();
	//	while (reply(ans)) {
		
		if(milk<max && ans.equalsIgnoreCase("y")) {
			System.out.println("wait ........for filling");
			refillMachine("milk",max-milk);			
		}else if(milk<=max && ans.equalsIgnoreCase("n")){
			System.out.println("machine will now goes to admin control");
			stopMachine("milk",max-milk);
			
		}else {
			getDrink();
		}
		
		}else {
		System.out.println("the entered amount is not avialble");
		System.out.println("please wait for refill...........");
		refillMachine("milk",max-milk);
	}
	}
	static void water(int amount) {
		String ans;
	
	if(amount<=water ) {
		System.out.println("your "+amount+" liter coffee is available");
		water=water-amount;
		System.out.println("the remaining water left in machine: "+water);
		System.out.println("Would you like to have something else | if yes type 'y' or type 'n' ");//condition
		ans =input.next();
	//	while (reply(ans)) {
		
		if(water<max && ans.equalsIgnoreCase("y")) {
			System.out.println("wait ........for filling");
			refillMachine("water",max-water);			
		}else if(water<=max && ans.equalsIgnoreCase("n")){
			System.out.println("machine will now goes to admin control");
			stopMachine("water",max-water);
			
		}else {
			getDrink();
		}
		
		}else {
		System.out.println("the entered amount is not avialble");
		System.out.println("please waqit for refill...........");
		refillMachine("water",max-water);
	}
	}


}
