
public class breakAndContinue {

	public static void main(String[] args) {
		int totalFloors = 15;
		int userOnFloors = 5;
		int userDestiFloor = 10;
		 /*for(int elevator=1; elevator<=15;elevator++) {
			 System.out.println("elevator on floor"+elevator);
             if (userDestiFloor == elevator) {// check user destination floor i.e 10 == value of elevator
				System.out.println("elevator arrived on floor" +elevator+ "thank you!!");
				// loop go further till 15 
				// to control the loop we use break statement 
				break;//terminate the loop
			}*/
		//for continue the loop
		    System.out.println();
			 for (int elevator=1;elevator<=15;elevator ++) {
				 if (elevator<=userDestiFloor ) {
					 
					 continue;
				}
		System.out.println("elevator is on floor"+elevator); 
			
			}
			 outer:
				 for(int i=1;i<=10;i++) {
					 System.out.println("the value of outer loop "+i);
	                
			 inner:
				for(int j=1;j<=5;j++) {
					System.out.println("the value of inner loop"+j);
					if(j<3) {
						//break;
					break outer;
				
					}	
			      }
				}
	
				
	}
	
		
	}


