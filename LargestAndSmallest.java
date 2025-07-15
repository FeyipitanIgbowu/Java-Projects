import java.util.Scanner;
    public class LargestAndSmallest {
        public static void main(String[] args) {
              Scanner input = new Scanner(System.in);
              
              
              System.out.print("Enter First Number: ");
                int num1 = input.nextInt();
              System.out.print("Enter Second Number: ");
                int num2 = input.nextInt();
              System.out.print("Enter Third Number: ");
                int num3 = input.nextInt();
              System.out.print("Enter Fourth Number: ");
                int num4 = input.nextInt();
              System.out.print("Enter Fifth Number: ");
                int num5 = input.nextInt();
                
           int smallest = num1;
       if (smallest > num1) smallest = num1;
       if (smallest > num2) smallest = num2;
       if (smallest > num3) smallest = num3;
       if (smallest > num4) smallest = num4;
       if (smallest > num5) smallest = num5;
       System.out.println(" The smallest is : " + smallest);
       
       
          int largest = 0;
       if (largest < num1) largest = num1;
       if (largest < num2) largest = num2;
       if (largest < num3) largest = num3;
       if (largest < num4) largest = num4;
       if (largest < num5) largest = num5;
       System.out.println(" The largest is : " + largest);
       
       
       
      }
  }

                         