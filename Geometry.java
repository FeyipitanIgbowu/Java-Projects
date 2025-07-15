import java.util.Scanner;
    public class Geometry {
         public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          
          System.out.print(" Enter Three Points for a Triangle: ");
             double xy1a = input.nextDouble();
             double xy1b= input.nextDouble();
             double xy2a= input.nextDouble();
             double xy2b= input.nextDouble();
             double xy3a= input.nextDouble();
             double xy3b= input.nextDouble();
             
             double s = (xy1a + xy1b + xy2a + xy2b + xy3a + xy3b) / 2;
             double area1 = (s - xy1a*xy1b) * s;
             double area2 = (s - xy2a*xy2b) * s;
             double area3 = (s - xy3a*xy3b) * s;
             double area4 = area1 * area2 * area3;
             double area = Math.sqrt(area4);
             
             System.out.println("The area of the triangle is: "+ area);
             
           
                     }
      }
      