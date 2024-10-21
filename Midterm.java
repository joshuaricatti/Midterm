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
		for(int digit:randomNumber) {


	




System.out.println("1. Play ");
		System.out.println("2. Change Player ID ");
		System.out.println("3. Display Player ID ");
		System.out.println("4. Quit");
System.out.println("Choose an option:");
		int choice = user_input.nextInt();


String player = “Player”;
switch (choice) {
		case 1:	
			System.out.println(“Welcome ”+player+ “!!”);
			System.out.println(“Choose number of attempts you need:”);
			System.out.println(“1. Easy (20 Attempts) \n2. Medium (15 attempts) \n3. Hard (10 Attempts)”);
			System.out.println(“Choose an option: “);
			int choice2 = user_input.nextInt();
				
switch (choice2){
						case 1:
double attempts = 20 ; 

				do {
	System.out.println(“Guess the unknown randomly generated 4-digit number.”);
	System.out.printf(“Enter the random 4-digit number (Attempts remaining: %d):” , attempts);



							
						


				}while(attempts>=0);



}
		
		case 2:	
			String player;
System.out.println("Enter new Player ID: ”);
			player = userinput_next.Line();

			
		
		case 3:	
			System.out.println("Your player ID is “ + player +));
		
		case 4:	
			
			System.out.println("Quitting.... ");
					
			break;
		  	
		default:
			System.out.println("Invalid choice. Try again.");
			return;






		
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
		for(int digit:randomNumber) {
			System.out.print (digit);
		}
		
	}
}









