import java.util.Scanner;
   public class Acceleration {
        public static void main(String[] args) {
             Scanner input = new Scanner(System.in);
             
             System.out.print(" Enter Vo, V1 and t: ");
             int vo = input.nextInt();
             int v1 = input.nextInt();
            int time = input.nextInt();
             
             int acceleration = (v1 - vo) / time;
              System.out.print("The Average Acceleration is: " + acceleration);
             
             
             
           }
     }