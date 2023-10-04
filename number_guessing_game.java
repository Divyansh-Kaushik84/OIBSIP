import java.util.Random;
import java.util.Scanner;

public class number_guessing_game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int lb = 1;//lowerbound
        int ub = 100;//upperbound
        int target = random.nextInt(ub - lb + 1) + lb;
        int maxAttempts = 10;
        int attempts = 0;
        System.out.println("\033c");
        System.out.println("\n--------------------------------------------------Welcome to the Guess the Number game!------------------------------------------------------");
        System.out.println("\n------------------------------------------------I've selected a number between " + lb + " and " + ub + ".----------------------------------------------------");
        System.out.println("\n--------------------------------------------------Can you guess it within " + maxAttempts + " attempts?-------------------------------------------------------");
        System.out.println("\n\n\t\t\t                                 TOTAL ATTEMPTS: 10");
        while (attempts < maxAttempts) {
            System.out.print("\nEnter your guess: ");
            int userGuess = scanner.nextInt();
            
            if (userGuess == target) {
                System.out.println("\n\nCongratulations! You guessed the number " + target + " correctly.\n");
                break;
            } else if (userGuess < target) {
                System.out.println("Try a higher number.\n\t\t\t                                 Attempts left:"+(10-attempts-1));
            } else {
                System.out.println("Try a lower number.\n\t\t\t                                 Attempts left:"+(10-attempts-1));
            }
            
            attempts++;
        }
        
        if (attempts == maxAttempts) {
            System.out.println("\nSorry, you've reached the maximum number of attempts. The correct number was " + target + ".\n");
        }
        
        scanner.close();
    }
}
