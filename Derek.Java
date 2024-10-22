package MidTerm;
import java.util.Scanner;


public class MidTerm {
	public static void main (String Args[]){
		// my_arr {1,2,3,4,56};
		//my_arr {1,'s', "Derek"} Not possible bc different data types
	Scanner user_input = new Scanner(System.in);	
		


	int[] randomNumber = new int[4];
				
				int firstrandInt = (int)(Math.random() * 9);
		
		while (firstrandInt == 0) {
			firstrandInt = (int)(Math.random() * 9);
		}
		int secondrandInt = (int)(Math.random() * 9);
		int thirdrandInt = (int)(Math.random() * 9);
		int fourthrandInt = (int)(Math.random() * 9);
		
		randomNumber[0] = firstrandInt;
		randomNumber[1] = secondrandInt;
		randomNumber[2] = thirdrandInt;
		randomNumber[3] = fourthrandInt;


String player = "Player";
while(true) {
	System.out.println("Menu:");
	System.out.println("1. Play ");
System.out.println("2. Change Player ID ");
System.out.println("3. Display Player ID ");
System.out.println("4. Quit");
System.out.println("Choose an option:");
int choice = user_input.nextInt();
switch (choice) {
		case 1:	
			System.out.println("Welcome "+player+ "!!");
			System.out.println("Choose number of attempts you need:");
			System.out.println("1. Easy (20 Attempts) \n2. Medium (15 attempts) \n3. Hard (10 Attempts)");
			System.out.println("Choose an option: ");
			int choice2 = user_input.nextInt();
				
				switch (choice2){
						case 1:
									double attempts = 20;
									double catches = 0;
									double matches = 0;
							do {
								System.out.println("Guess the unknown randomly generated 4-digit number. \nEnter the random 4-digit number (Attempts remaining: "+attempts+"):");

								attempts = attempts-1

										int[] guess = new int[4];
										System.out.print("Whats your guess");
										String guessString = user_input.next();
								if(guessString.length()!=4) {
									System.out.println("Invalid input. Try again.");
								}
								else if(guessString.charAt(0)==0){
									System.out.println("Invalid input. Try again.");
								}
								else {
								int val = Integer.valueOf(guessString);
					
						 
						     
						      		     	int firstnum = val % 10;
						      			int secondnum = val % 100;
									int thirdnum = val % 1000;
									int fourthnum = val % 10000;
						            	if(firstnum==firstrandInt) {
						            		matches = matches + 1;
						            	}
						            	else if(firstnum==secondrandInt) {
						            			catches = catches + 1;
						            	}
						            	else if(firstnum==thirdrandInt) {
					            			catches = catches + 1;
					            		}
						            	else if(firstnum==fourthrandInt) {
					            			catches = catches + 1;
					            		}
						            	else {}

								if(secondnum==secondrandInt) {
						            		matches = matches + 1;
						            	}
						            	else if(secondnum==thirdrandInt) {
						            		catches = catches + 1;
						            	}
						            	else if(secondnum==fourthrandInt) {
					            			catches = catches + 1;
					            		}
						            	else if(secondnum==firstrandInt) {
					            			catches = catches + 1;
					            		}
						            	else {}

						           	if(thirdnum==thirdrandInt) {
						            		matches = matches + 1;
						            	}
						            	else if(thirdnum==secondrandInt) {
						            			catches = catches + 1;
						            	}
						            	else if(thirdnum==firstrandInt) {
					            			catches = catches + 1;
					            		}
						            	else if(thirdnum==fourthrandInt) {
					            			catches = catches + 1;
					            		}
						            	else {}
								

								if(fourthnum==fourthrandInt) {
						            		matches = matches + 1;
						            	}
						            	else if(fourthnum==secondrandInt) {
						            			catches = catches + 1;
						            	}
						            	else if(fourthnum==thirdrandInt) {
					            			catches = catches + 1;
					            		}
						            	else if(fourthnum==fourthrandInt) {
					            			catches = catches + 1;
					            		}
						            	else {}
}
								if(matches == 4){
								System.out.println("Congratulations! You've guessed the correct number.");
								break;
						   
								}
								else{
								System.out.println("Matches: %d, Catches: %d" ,matches,catches);
								}
									}while(attempts>=0);
								
								System.out.println("Game OVER. The correct number was: " + randomnumber);
						case 2:

						case 3:

						default:

}
			break;
		case 2:	
		
				System.out.println("Enter new Player ID: ");
				player = user_input.next();

			break;
		
		case 3:
			System.out.println("Your player ID is: "+ player);
			break;
		case 4:	
			
			System.out.println("Quitting.... ");
			System.exit(0);
			break;
		  	
		default:
			System.out.println("Invalid choice. Try again.");
			
	}
}
	}
	
}
