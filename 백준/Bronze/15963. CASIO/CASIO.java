import java.util.Scanner;

public class Main {

public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	String a = scan.next();
	String b = scan.next();
	
	if(a.equals(b)) {System.out.println("1");}
	else {System.out.println("0");}
	
}
}