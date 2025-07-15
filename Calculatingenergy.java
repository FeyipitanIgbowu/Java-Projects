import java.util.Scanner
     public class Calculatingenergy {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the amount of water in kilograms : ");
               double water_in_kg = input.nextDouble();
             System.out.print("Enter the initial temperature : ");
               double initial_temp = input.nextDouble();
             System.out.print("Enter thr final temperature : ");
               double final_temp = input.nextDouble();
               
               double energy = water_in_kg * ( final_temp - initial_temp);
               
               System.out.print("The energy needed is: " + energy);
               
               }
           }