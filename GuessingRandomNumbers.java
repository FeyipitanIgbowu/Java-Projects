import java.util.Scanner;
public class GuessingRandomNumbers {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

 int numberToGuess = (int)(Math.random() * 100) + 1;
int guess = 0;

      while (guess != numberToGuess) {
          System.out.print("Guess the number (1 to 100): ");
          guess = input.nextInt();
      if (guess > numberToGuess) {
          System.out.println("Number too high, try again.");
     }else if (guess < numberToGuess) {
          System.out.println("Number too low, try again.");
    }else {
          System.out.println("You guessed the right number");
            }
           }
         }
}
