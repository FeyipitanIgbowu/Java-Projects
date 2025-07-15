import java.util.Scanner;
   public class Future_investment_value {
       public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
            
            System.out.print(" Enter investment amount : ");
              double investment_amount = input.nextDouble();
            System.out.print(" Enter annual interest rate in percentage : ");
              double annual_interest = input.nextDouble();
            System.out.print(" Enter number of years : ");
               double years = input.nextDouble();
               
               double monthly_interest_rate = annual_interest / 12;
               double calc = Math.pow(1 + monthly_interest_rate, years * 12);
               double future_investment_value = investment_amount * calc;
               
               System.out.print(" Accumulated value is : " + "$" +future_investment_value);
               }
          }
               
               
               
               
              