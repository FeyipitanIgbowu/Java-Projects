import java.util.Scanner;
     public class Costofdriving {
          public static void main(String[] args) {
             Scanner input = new Scanner(System.in);
           System.out.print(" Enter the driving distance : ");
             double driving_distance = input.nextDouble();
           System.out.print( " Enter miles per gallon : ");
             double miles_per_gallon = input.nextDouble();
           System.out.print( " Enter price per gallon : ");
             double price_per_gallon = input.nextDouble();
           
           
           double cost_of_driving = driving_distance / miles_per_gallon * price_per_gallon;
            System.out.print(" The cost of driving is : " + cost_of_driving);
          }
        }