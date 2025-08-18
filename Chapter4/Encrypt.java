import java.util.Scanner;
public class Encrypt {
	public static void main(String... feyi) {
 		Scanner input = new Scanner(System.in);
 		
 	System.out.println("Enter a 4 digit number: ");
 	int number = input.nextInt();
 		
       int digit1 = (number / 1000) % 10;
        int digit2 = (number / 100) % 10;
        int digit3 = (number / 10) % 10;
        int digit4 = number % 10;
 
       digit1 = (digit1 + 7) % 10;
        digit2 = (digit2 + 7) % 10;
        digit3 = (digit3 + 7) % 10;
        digit4 = (digit4 + 7) % 10;
        
        int swap = digit1;
        digit1 = digit3;
        digit3 = swap;
        swap = digit2;
        digit2 = digit4;
        digit4 = swap;
        
        System.out.printf("%d%d%d%d%n", digit1, digit2, digit3, digit4);
        }
      }