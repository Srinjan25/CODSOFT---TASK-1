import java.util.Random;
import java.util.Scanner;

public class numbergame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int upperbound = 100;
        int lowerbound = 1;
        int generateNumber = random.nextInt(upperbound - lowerbound + 1) + lowerbound;
        boolean guess = false;
        System.out.println("Hi user welcome to the number guessing game");
        System.out.println("The lower limit and the upper limit of the game is" + lowerbound + " and " + upperbound + ".");

        while (!guess) {
            System.out.print("Enter the number you guessed: ");
            int userGuess = scanner.nextInt();

            if (userGuess < generateNumber) {
                System.out.println("Too low!");
            } else if (userGuess > generateNumber) {
                System.out.println("Too high!");
            } else {
                guess = true;
                System.out.println("Hurrah! You guessed the correct number: " + generateNumber);
            }
        }

        scanner.close();
    }
}

