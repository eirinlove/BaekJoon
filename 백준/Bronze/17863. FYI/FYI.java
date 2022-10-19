import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	String n = scan.next();
	n = n.substring(0, 3);
	
	if(n.equals("555")) {
		System.out.println("YES");
	}
	else 
	{System.out.println("NO");}
	
}
}