import java.util.Scanner;
      public class Interest { 
           public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
             
             System.out.println("Enter balance and interest rate: ");
               double balance = input.nextDouble();
               double annual_interest = input.nextDouble();
             
             double interest = balance * (annual_interest / 1200);
             
             System.out.println("The interest is: " + interest);
           }
      }
               