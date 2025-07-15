import java.util.Scanner;
     public class QuadraticEquation {
         public static void main(String[] args) {
             Scanner input = new Scanner(System.in);
             
         System.out.println("Enter first number : ");
           double a = input.nextDouble();
         System.out.println("Enter second number : ");
           double b = input.nextDouble();
         System.out.println("Enter third number : ");
            double c = input.nextDouble();
        
       double sqrt =Math.sqrt( b * b - 4 * a * c);
       double numerator = (- b - sqrt) / (2 * a);  
       double denominator  =  (- b - sqrt) / (2 * a);        
            
             if(sqrt > 0) {
             System.out.println("x1 is : " + numerator + " x2 is : " + denominator);
            } else if (sqrt == 0) {
                          System.out.println("There is only one real root");
              } else {
                        System.out.println("There is no real root");
                  }
               
        }
      }
         
          