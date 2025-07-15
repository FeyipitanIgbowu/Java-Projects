import java.util.Scanner;
     public class Integervariable {
        public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print(" Enter an integer value 1 : ");
        int value1 = input.nextInt();
        System.out.print(" Enter an integer value 2 : ");
        int value2 = input.nextInt();
        
        value1 = value1 + value2;
        value2 = value1 - value2;
        value1 = value1 - value2;
        
        System.out.printf("Value 1 = " + value1 + "  Value 2 = " + value2);
        
        }
     }