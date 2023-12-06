import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame{
    public static void main(String() args){
        Random random=new Random();
        Scanner scanner=new Scanner(System.in);
        boolean playAgain=true;
        while(playAgain){
            int rangeMin=1;
            int rangeMax=100;
            int attemptsAllowed=3;
            int score=0;
            int roundsWon=0;
            int targetNumber=random.nextInt(rangeMax-rangeMin+1)+rangeMin;
            System.out.println("Welcome to the number guessing game!");
            System.out.printf("Guess a number between %d and %d in %d attempts:\n",rangeMin,rangeMax,attemptsAllowed);
            for(int attempt=0;attempt<attemptsAllowed;attempt++){
                int guess=scanner.nextInt();
                ig(guess==targetNumber){
                    score+=(attemptsAllowed-attempt);
                    roundsWon++;
                    System.out.println("Congratulations! You guessed the number in" + "tries.");
                    break;
                }else if(guess<targetNumber){
                    System.out.println("Too low,try again!");
                }else{
                    System.out.println("Too high,try again!");
                }
            }if (attempt==attemptsAllowed){
                System.out.println("Sorry,you ran out of attempts.The number was" + targetNUmber +".");
            }
            System.out.println("play again?(y/n)");
            playAgain=scanner.next().equalsIgnoreCase("y");
            if(!playAgain){
                System.out.println("Your total score:"+ score);
                system.out.println("Rounds won:"+ roundsWon);
            } 
         }
         scanner.close();
    }
}