
public class Conditions {

	public static void main(String[] args) {
		boolean isInternetConnected = true;
		boolean isSongPlay = false;
	if(isInternetConnected) {
		System.out.println("you can browes the internet");
		if(isSongPlay) {
			System.out.println("You can listen the songs....");
		}else {
			System.out.println("please! check your internet connection");
		}
	}else {
		System.out.println("Please Connect To Internet And Try Lgain Later");
	}
	System.out.println();
	
	
	if (isSongPlay&&isInternetConnected) {
		System.out.println("you can use the internet and listen song ...");
	}else {
		System.out.println("pleaase check your internet connection and try again ...!");
	}
	int num1 = 100;
	int num2 = 100;
	int num3 = 100;
	
	// Complete the Logic with all the use cases which you can think of !!
	
	if(num1 > num2){
		if(num1 > num3){
			System.out.println("num1 is greatest");
		}else{
			System.out.println("num3 is greatest");
		}
	}else{
		if(num2 > num3){
			System.out.println("num2 is greatest");
		}else{
			System.out.println("num3 is greatest");
		}
	}
	
	System.out.println();
	
	int microCab = 1;
	int miniCab = 2;
	int luxuryCab = 3;
	int bike = 4;
	int auto = 5;
	
	int userChoice = 4;
	
	// Ladder if/else
	
	if(userChoice == microCab){
		System.out.println("Micro Cab Booked !! Arriving Soon !!");
	}else if(userChoice == miniCab){
		System.out.println("Mini Cab Booked !! Arriving Soon !!");
	}else if(userChoice == luxuryCab){
		System.out.println("Luxury Cab Booked !! Arriving Soon !!");
	}else if(userChoice == bike){
		System.out.println("Bike Booked !! Arriving Soon !!");
	}else if(userChoice == auto){
		System.out.println("Auto Booked !! Arriving Soon !!");
	}else{
		System.out.println("Please Select a Valid Cab First");
	}
	
	System.out.println();
	
	// Switch Case
	switch (userChoice) {
		case 1:
			System.out.println("Micro Cab Booked !! Arriving Soon !!");
			break;
			
		case 2:
			System.out.println("Mini Cab Booked !! Arriving Soon !!");
			break;
			
		case 3:
			System.out.println("Luxury Cab Booked !! Arriving Soon !!");
			break;
			
		case 4:
			System.out.println("Bike Booked !! Arriving Soon !!");
			break;
			
		case 5:
			System.out.println("Auto Booked !! Arriving Soon !!");
			break;
			
		default:
			System.out.println("Please Select a Valid Cab First");
			break;
	}
	}
}


