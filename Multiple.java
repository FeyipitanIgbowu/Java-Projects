import java.util.Scanner;
   public class Multiple {
      public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         System.out.println("Enter a num: ");
         int number = input.nextInt();
         
           int num1 = 6;
           int num2 = 7 ;  
           
               
         if ( number % num1 == 0  || number % num2 ==0) {
         System.out.println(number + " is a multiple of 6 and 7");
         } else {
         System.out.println( number + " is not a multiple of 6 and 7");
           }        
         }
     }