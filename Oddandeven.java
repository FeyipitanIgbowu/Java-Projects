import java.util.Scanner;
   public class Oddandeven {
        public static void main(String[]  args) {
       Scanner input = new Scanner(System.in);
       
       System.out.print(" Enter an Integer : ");
          int num1 = input.nextInt();
       System.out.print(" Enter an Integer : ");
          int num2 = input.nextInt();
       System.out.print(" Enter an Integer : ");
           int num3 = input.nextInt();
        System.out.print(" Enter an Integer : ");
           int num4 = input.nextInt();
        System.out.print(" Enter an Integer : ");
           int num5 = input.nextInt();
        System.out.print(" Enter an Integer : ");
           int num6 = input.nextInt();

         int sumEven = 0;
          int sumOdd = 0;
          
          if(num1 % 2 == 0) sumEven += num1;
            else{ sumOdd += num1;}
          if(num2 % 2 == 0) sumEven += num2;
            else{ sumOdd += num2;}
           if(num3 % 2 == 0) sumEven += num3;
             else{ sumOdd += num3;}
           if(num4 % 2 == 0) sumEven += num4;
             else{ sumOdd += num4;}
           if(num5 % 2 == 0) sumEven += num5;
             else{ sumOdd += num5;}
           if(num6 % 2 == 0) sumEven += num6;
             else{ sumOdd += num6;}

         System.out.println("The sum of the odd numbers are : " + sumOdd);
          System.out.println("The sum of the even numbers are : " + sumEven);
          }
        }
          