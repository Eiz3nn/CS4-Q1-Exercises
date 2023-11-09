package CS4TruthRevis;

import java.util.Scanner;

public class RockPaperScissors{
    
    
    
	public static void main(String[] args){
            
            Scanner input = new Scanner(System.in);
            
            Move rock = new Move("Rock");
            Move paper = new Move("Paper");
            Move scissors = new Move("Scissors");

            rock.setStrongAgainst(scissors);
            paper.setStrongAgainst(rock);
            scissors.setStrongAgainst(paper);

            int roundsToWin = 2;
            int random;
            
            Move moveComp;
            Move moveUser;
            int scoreComp;
            int scoreUser;
            
            boolean ongoing = true;
            
            do {
                // - INITIALIZING - 
                
                moveComp = null;
                moveUser = null;
                scoreComp = 0;
                scoreUser = 0;

                System.out.println("Welcome to Rock, Paper, Scissors. Please choose an option:");
                System.out.println("1. Start game");
                System.out.println("2. Change number of rounds");
                System.out.println("3. Exit application");

                switch(input.nextInt()) {
                    case 1:
                        System.out.printf("\nThis match will be first to %d wins.\n", roundsToWin);
                        
                        // - GAME START -
                        
                        while (scoreUser<roundsToWin && scoreComp<roundsToWin){
                           
                            // - BOT RNG - 
                            random = (int) Math.floor(Math.random()*3) + 1;
                            switch (random) {
                                case 1:
                                    moveComp = rock;
                                    break;
                                    
                                case 2:
                                    moveComp = paper;
                                    break;
                                    
                                case 3:
                                    moveComp = scissors;
                                    break;
                            }
                            
                            // - INPUT -
                            System.out.println("\nThe computer has selected its move. Select your move:");
                            System.out.println("1. Rock");
                            System.out.println("2. Paper");
                            System.out.println("3. Scissors");
                            
                            switch (input.nextInt()) {
                                case 1:
                                    moveUser = rock;
                                    break;
                                    
                                case 2:
                                    moveUser = paper;
                                    break;
                                    
                                case 3:
                                    moveUser = scissors;
                                    break;
                            }
                            
                            // - ROUND WIN DECISION -                            
                            System.out.printf("\nPlayer chose %s. Computer chose %s. ", moveUser.getName(), moveComp.getName());
                            
                            switch (Move.compareMoves(moveUser,moveComp)) {
                                case 0:
                                    System.out.println("Player wins round!");
                                    scoreUser++;
                                    break;
                                case 1:
                                    System.out.println("Computer wins round!");
                                    scoreComp++;
                                    break;
                                case 2:
                                    System.out.println("Round is tied!");
                                    break;
                            }
                            
                            System.out.printf("Player: %d - Computer: %d\n",scoreUser,scoreComp);
                        }
                        
                        // - GAME WIN DECISION -
                        
                        if(scoreUser > scoreComp){
                            System.out.println("\nPlayer wins!\n");
                        }
                        else {
                            System.out.println("\nComputer wins!\n");
                        } 
                        
                        // - GAME END -
                        
                        break;
                                     
                    // - DECIDE ROUNDS - 
                    case 2:
                        System.out.println("\nHow many wins are needed to win a match?");
                        roundsToWin = input.nextInt();
                        System.out.println("\nNew setting has been saved!\n");
                        break;

                    // - STOP. -
                    case 3:
                        System.out.println("\nThank you for playing!");
                        ongoing = false;
                        break;


                }
                
            } while(ongoing);
            
            

		
	}
}