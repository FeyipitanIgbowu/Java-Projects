import java.util.Scanner
public class trafficLight{ 
	public static void main (String... feyi) {
scanner input = new Scanner(System.in);
System.out.println("Enter a color: ");
String color = input.nextLine();
if (color == "Green") {
		return "Go";
	} else if (color == "Red") {
		return "Stop";
	} else if (color == "Yellow") {
		return "Wait";
	}
}
}
}