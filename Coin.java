import java.util.Scanner;
   public class Coin {
      public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
            int random = (int)(Math.random() * 2);
                
            System.out.println("Enter a guess: ");
            int guess = input.nextInt();
            
                  if (guess == 1) {
               System.out.println("Head");
            } else {
                   System.out.println("Tail");
           
          if (guess != 0 && guess != 1) {
                System.out.println("Invalid input");          
                 System.out.println("Enter a guess: ");
                  guess = input.nextInt();
            
                  if (guess == 1) {
               System.out.println("Head");
            } else {
                   System.out.println("Tail");
           

           
}
            }
              }
           }
         }
    