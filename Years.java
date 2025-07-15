import java.util.Scanner;
    public class Years {
       public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       System.out.print("Enter the number of minutes: ");
        int minutes = input.nextInt();
        
        int years = minutes / 525700;
        int days = minutes / 1440;
        
        System.out.print( minutes + " minutes is approximately " + years + " years and " + days + "days");
        
       
          }
    }