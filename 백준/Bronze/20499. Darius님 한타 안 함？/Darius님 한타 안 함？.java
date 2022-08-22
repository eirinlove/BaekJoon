import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	
	Scanner scan= new Scanner(System.in);
	
	String a  = scan.next();
	String[] b = a.split("/");
	
	
	if(Integer.parseInt(b[0])+Integer.parseInt(b[2]) < Integer.parseInt(b[1]) || Integer.parseInt(b[1]) == 0) {
		
		System.out.println("hasu");
	}
	
	else { System.out.println("gosu");}
}
}
