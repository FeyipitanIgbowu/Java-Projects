import java.util.Scanner;
     public class Bmi {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            
            System.out.println("Enter Weight in Pounds: ");
            double weight = input.nextDouble();
             Double calcweight = weight * 0.45359237;
            
           
             System.out.println("Enter Height in Inches: ");
            double height = input.nextDouble();
            Double calcheight = height * 0.0254;
            
            Double bmi = (calcweight * 703) / (calcheight * calcweight);
            System.out.print("Your BMI is: " + bmi);
            
            
            
            }
    }