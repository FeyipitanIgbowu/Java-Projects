import java.util.Scanner;
public class Array {
 public static void main(String... feyi) {
 
 Scanner input = new Scanner(System.in);
 
 int[] scores = new int[5];
 
 for (int j = 0; j < 5; j++) {
  System.out.println("Enter a number: ");
   scores[j] = input.nextInt();
  }
  
 int i = 0;
 for (; i < 5; i++) {
  if ( i % 2 == 0)
   System.out.println(scores[i]); 
  }
 }
 
}