import java.lang.*;
import java.util.*;

class NumberGame
{
public static void main(String args[])
{
    Scanner obj=new Scanner(System.in);
    Random ran= new Random();

    int lowestNumber = 1;
    int highestNumber = 100;
    int maxAttempts = 7;
    int round = 0;
    int totalscaore = 0;

    System.out.println("Wellcome in the Game");
    String playAgain;
    do{
        int numberToGuess = ran.nextInt(highestNumber - lowestNumber +1) + lowestNumber;
        int attempt = 0;
        boolean isGuessed = false;

        System.out.println("\nGuess number between" + lowestNumber + "and" +highestNumber);

        while(attempt<maxAttempts)
		{
            System.out.println("Enter your guess: ");
            int userGuess = obj.nextInt();
            attempt++;

            if (userGuess == numberToGuess)
            {
            System.out.println("Correct you guess the number in" +attempt + "attempt");
            totalscaore += (maxAttempts - attempt +1 );
            isGuessed =true ;
            break;
            }else if (userGuess<numberToGuess){
                System.out.println("it is low , try again!");
            }else{
                System.out.println("It is High, try again!");
            }
            }
             if (!isGuessed){
                System.out.println("You have use all attempts. The number is: " +numberToGuess);
            }
             round++;
             System.out.println("You Want to play another round? (yes or no ):");
             playAgain=obj.next().toLowerCase();   
            }while (playAgain.equals("yes"));
            System.out.println("\n Game over You played " +round+"round(s).");
            System.out.println("your total score is: " +totalscaore);
            obj.close();
    }
    }