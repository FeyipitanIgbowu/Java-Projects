import java.util.Scanner;
   public class Letters {
      public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          
          System.out.print("Input a Letter: ");
            char letter = input.next().charAt(0);
     
     if(Character.isLetter(letter)) {     
          if( letter == 'a' || letter == 'A') {
          System.out.println(letter + " is a vowel");
          } else if ( letter == 'e' || letter == 'E') {
          System.out.println(letter + " is a vowel");
          } else if ( letter == 'i' || letter == 'I') {
          System.out.println( letter + " is a vowel");
          } else if ( letter == 'o' || letter == 'O') {
          System.out.println( letter + " is a vowel");
          } else if ( letter == 'u' || letter == 'U') {
          System.out.println( letter + " is a vowel");
          } else { 
          System.out.println( letter + " is a consonant");
          }
      } else {
        System.out.println("Invalid Input");
      }
          }
             }