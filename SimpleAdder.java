import java.util.Scanner;
public class SimpleAdder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char repeat;

        do {
          
            System.out.print("Enter the first number: ");
            int number1 = input.nextInt();

            System.out.print("Enter the second number: ");
            int number2 = input.nextInt();

           
            int sum = number1 + number2;
            System.out.println("The sum is: " + sum);

            System.out.print("Do you want to add two more numbers? (y/n): ");
            repeat = input.next().charAt(0);

        } while (repeat == 'y' || repeat == 'Y');

        System.out.println("Goodbye!");
    }
    }
