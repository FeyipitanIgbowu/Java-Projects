import java.util.Scanner;
public class Task {
 public static void main(String... feyi) {
 
 Scanner input = new Scanner(System.in);
 System.out.println("Input an operator: ");
 String operator = input.nextLine();
 System.out.println("Input the first number: ");
 int firstNumber = input.nextInt();
 System.out.println("Input the second number: ");
 int secondNumber = input.nextInt();
 
 if (operator.equals("*"))  {
  int multiply = firstNumber * secondNumber;
  System.out.println(multiply);
 }else if (operator.equals("+")) {
  int add = firstNumber + secondNumber;
  System.out.println(add);
 }else if (operator.equals("/")) {
  int divide =  firstNumber / secondNumber;
  System.out.println(divide);
  }else if (operator.equals("-")) {
  int subtract =  firstNumber - secondNumber;
  System.out.println(subtract);
 }else;
  System.out.println("Invalid input");

  
  
 }
 
 
 
 }
 