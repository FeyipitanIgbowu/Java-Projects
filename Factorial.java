import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  
        System.out.print("Enter a number: ");
        int number = input.nextInt(); 

        int i = 1;              
       int j = 1;      
       
        while (i <= number) {
           j = j * i;  
               i++;                      
        }

        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
