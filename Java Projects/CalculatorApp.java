import java.util.Scanner;
import java.util.Random;
public class CalculatorApp {
 public static void main(String... feyi) {
 Scanner input = new Scanner(System.in);
 Random number = new Random();

int score = 0;
int correct = 0;
for (int i = 1; i <= 10; i++) {
    int num1 = random.nextInt(10) + 1;  
    int num2 = random.nextInt(10) + 1;
    int operator = random.nextInt(4);  
         
  String operator;
   if (operator.equals(0)) {
         operator = '+';
         correct = num1 + num2;
 } else if (operator.equals(1)) {
           operator = '-';
           correct = num1 - num2;
  } else if (operator.equals(2)) {
            operator = '*';
            correct = num1 * num2;
  } else {
             operator = '/';
            correct = num1 / num2;
            }

           
 System.out.print("What is " + num1 + operator + num2 );
 int answer = input.nextInt();

  if (answer == correct) {
      System.out.println("Correct");
       score++;
 } else {
       System.out.println("Wrong");
            }
        }
 System.out.println("Your score is " + score);
    }
}
