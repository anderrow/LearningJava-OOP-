package pigGame;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;


public class pigMain {

	
	
	//-----MAIN MENU-----
	public static int menu(Scanner sc, boolean error) {
			
		if (error) System.out.println("Introduce a number between 0 to 4");
		
		System.out.println("--------MENU--------");
		System.out.println("[0] END");
		System.out.println("[1] Start playing");
		System.out.println("[2] Check Data");
		System.out.println("[3] Set the difficulty level of the AI");
		System.out.println("---------------------");
		System.out.print("Your option-> ");
		
		try {
			int answer = sc.nextInt();
			
			if (answer <0 || answer >3) {
				return menu(sc, true); //Close the function and restart it due to an error.
			}
			return answer;
		}
		catch(InputMismatchException e) { 
			System.out.println("Exception: You must introduce an integrer number");
			sc.nextLine(); // Clean the scanner buffer
			return menu(sc, true); //Close the function and restart it due to an error.
		}
	}
	
	
	//-----Generate a random number from 1 to 6
	public static int random() {
		Random random = new Random();
		return (random.nextInt(6) + 1); // Generates a int between 1 and 6 and return
	}
	
	
	//Roll the dice
	public static int roll(Scanner sc) {
		int dice = 0, turnScore = 0;
		
		while(dice!=1){
			dice = random();
			if (dice!=1) {
				turnScore = turnScore + dice;
				
				System.out.println("");
				System.out.println("Congrats! You added " + dice + " points with this roll");
				System.out.println("If you retire right now, your Turn score would be " + (turnScore));
				System.out.println("Do you want to continue?[yes/no]");
				System.out.println("");
				
				String response = sc.nextLine().trim();// Clean de buffer
				
				if (!response.equalsIgnoreCase("yes")) {
					return turnScore;
				}
			}
		}
		
		System.out.println("Ops! That's a 1. No points for you :(");
		return turnScore;
	}
	
	//Roll for the AI
	public static int rollAI(int ailevel) {
		int dice=0, turnScore=0;
		
		switch(ailevel) {
		
		case 1: // Playing two times
			for(int i=0;i<2;i++) { //Two Turns
				dice=random();
				if(dice==1) {
					System.out.println("");
					System.out.println("IA scored 0 points! (Pathetic)");
					System.out.println("");
					
					return 0; //Whenever dice is 1 return 0 points
				}
				System.out.println("");
				System.out.println("IA rolled " + dice + " points!");
				System.out.println("");
				turnScore =turnScore + dice;
			}
			
			System.out.println("");
			System.out.println("IA Scored:" + turnScore + " points!");
			System.out.println("");
			
			return turnScore; // After finishing the for loop return the TurnScore
			
		case 2: //Playing till 10 points are achieved
			while(turnScore<10) { //Two Turns
				dice=random();
				if(dice==1) {
					System.out.println("");
					System.out.println("IA scored 0 points! (Pathetic)");
					System.out.println("");
					
					return 0; //Whenever dice is 1 return 0 points
				}
				turnScore =turnScore + dice;
			}
			
			System.out.println("");
			System.out.println("IA Scored:" + turnScore + " points!");
			System.out.println("");
			
			return turnScore;
			
		case 3: //Playing till 20 points are achieved 
			
			while(turnScore<20) { //Two Turns
				dice=random();
				if(dice==1) {
					System.out.println("");
					System.out.println("IA scored 0 points! (Pathetic)");
					System.out.println("");
					
					return 0; //Whenever dice is 1 return 0 points
				}
				turnScore =turnScore + dice;
			}
			
			System.out.println("");
			System.out.println("IA Scored:" + turnScore + " points!");
			System.out.println("");
			
			return turnScore;
	
		}
		return turnScore;
	}
	
	

	
	//-------MAIN RUTINE------
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //Open scanner
		
		int lastReg = 0;
		int[] userTurn =  new int[100]; //Array for saving the results of the user
		int[] aiTurn = new int[100]; //Array for saving the results of the AI
		int ailevel = 1;
		
		System.out.println("Welcome to the PIG game!");
		
		//Open the menu and keep ‘mainoption’ selected
		int mainoption = menu(sc, false);
		System.out.println("Option choosed: " + mainoption);
		
		while(mainoption!=0) {
			switch(mainoption) {
			case 1:
				int lastroll=0, userTotalScore = 0, aiTotalScore= 0;
				System.out.println("The game is starting!");
				
				while(userTotalScore <100 && aiTotalScore <100) {
					//User turn
					lastroll = roll(sc);//Roll the dice
					
					userTurn[lastReg]=lastroll; //Save the turn
					
					userTotalScore = userTotalScore + lastroll; //Calculate the total Score
					System.out.println("The user score is now " + userTotalScore);
					
					lastroll=  rollAI(ailevel);//Roll the dice
					
					aiTurn[lastReg]=lastroll; //Save the turn
					
				    aiTotalScore = aiTotalScore + lastroll; //Calculate the total Score
				    System.out.println("The AI score is now " + aiTotalScore);
				    
				    lastReg++; //Advance
					}

				break;
			case 2:
				System.out.println("USER----------AI");
				for(int i=0;i<lastReg;i++) {
					System.out.println(userTurn[i] + " | " + aiTurn[i]);
				}
				break;
			case 3:
				System.out.print("Set the AI level [1], [2] , [3] ");
				
				
				try {
					int aux = sc.nextInt();
					
					if (aux <0 || aux >3) {
						System.out.println("This is not a valid answer. Ai level not changed.");
					}
					else {
						
						System.out.println("Ai level has been set to " + aux);
						ailevel=aux;
					}
				}
				catch(InputMismatchException e) { 
					System.out.println("Exception: You must introduce an integrer number, Ai level not changed.");
					sc.nextLine(); // Clean the scanner buffer
				}
				break;
				
			}
			mainoption=menu(sc, false);
			}
		
        System.out.println("Game ended. Goodbye!");
        sc.close(); // Close the Scanner
		}

		
	}
