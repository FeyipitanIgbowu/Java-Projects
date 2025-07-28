import java.util.Scanner;
public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         char try_Again;

        do {
             System.out.print("Enter first number: ");
            int num1 = input.nextInt();

            System.out.print("Enter second number: ");
            int num2 = input.nextInt();

            int sum = num1 + num2;
            System.out.println("Sum: " + sum);

            System.out.print("Do you want to try again? Yes or No: ");
            try_Again = input.next().charAt(0);

        } while (try_Again == 'y' || try_Again == 'Y');

        System.out.println("Okay, bye!");
    }
}
