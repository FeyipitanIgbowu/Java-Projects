import java.util.Scanner;
public class NumberCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
 int positive = 0;
 int negative = 0;
 int zero = 0;

  String again = "yes";

  while (again.equalsIgnoreCase("yes")) {
  System.out.print("Enter a number: ");
  int num = input.nextInt();

  if (num > 0) {
       positive++;
   } else if (num < 0) {
       negative++;
   } else {
       zero++;
            }

    System.out.print("Do you want to enter another number? (yes/no): ");
     again = input.next();
        }

 System.out.println("Total Positive numbers: " + positive);
 System.out.println("Total Negative numbers: " + negative);
 System.out.println("Total Zeros: " + zero);
    }
}
