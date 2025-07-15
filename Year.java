import java.util.Scanner;
  public class Year { 
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a Year: ");
     int year = input.nextInt();
        
          if (year <1000 || year >=10000) {
       System.out.println("Invalid year");
    }else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
         System.out.print(true);
      }  else {
           System.out.println(false);
        }
      }
       }
         
      