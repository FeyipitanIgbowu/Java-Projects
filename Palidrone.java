import java.util.Scanner;
   public class Palidrone {
      public static void main(String[] args) {
      
     Scanner input = new Scanner(System.in);
     
     System.out.println("Input a string: ");
     String num = input.next();
     int low = 0; 
     int high = num.length() - 1;
      
      
      if( num.charAt(low) == num.charAt(high)) {
      System.out.println(num + " is  a palidrone");
      } else { 
       System.out.println(num + " is not a palidrone");
        }
          } 
            }
     