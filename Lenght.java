import java.util.Scanner;
     public class Lenght {
         public static void main(String[] args) { 
            Scanner input = new Scanner(System.in);
               
               System.out.print(" Enter V and a : ");
               double v = input.nextDouble();
               System.out.print(" Enter A: ");
               double a = input.nextDouble();
               
               
               double lenght = v * v / 2 * a;
               
               System.out.print(" The minimum runway lenght for this airplane is: " + lenght);
               
             }
          }