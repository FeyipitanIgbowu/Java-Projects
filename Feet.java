import java.util.Scanner;
   public class Feet {
      public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
           System.out.print(" Enter a value for feet : ");
             double feet = input.nextDouble();
            
            double feet_in_meters = feet * 0.305;
           System.out.print( feet + " feet is " + feet_in_meters + " meters ");
           
          }
       }