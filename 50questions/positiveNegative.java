import java.util.Scanner
public class positiveNegative{ 
	public static void main (String... feyi) {
scanner input = new Scanner(System.in);
System.out.println("Enter a color: ");
int number = input.nextInt();

 if(number > 0) {
	 	return "Positive";
	 } else {
	 	return "Negative or Zero";
}
}
}
}