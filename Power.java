import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
 System.out.print("Enter the base number: ");
   int base = input.nextInt();
System.out.print("Enter the exponent: ");
   int exponent = input.nextInt();

        int result = 1;
        int count = 1;

      while (count <= exponent) {
            result = result * base;
            count = count + 1;
        }

        System.out.println("Result: " + result);
     
    }
}
