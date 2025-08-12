
public class passwordChecker { 
	public static void main (String... feyi) {
scanner input = new Scanner(System.in);
String password = "secret123";
System.out.println("Type a password: ");
String passcode = input.nextLine();
		if( password == passcode) {
			return "Access Granted, welcome."
		} else {
			return "Access denied!"
			}
return passcode;
}

}
}
