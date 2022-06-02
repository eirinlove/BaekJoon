import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	String a = scan.next();
	
	if(a.length()==3) {
		
		if(a.charAt(1)=='0') {
			
			System.out.println(Integer.parseInt(a.substring(0, 2))+Integer.parseInt(a.substring(2, 3)));
		}
		else if (a.charAt(1)!='0') {
			
			System.out.println(Integer.parseInt(a.substring(0, 1))+Integer.parseInt(a.substring(1, 3)));
			
		}
		
	}
	else if (a.length()==4) {
		
		System.out.println(Integer.parseInt(a.substring(0, 2))+Integer.parseInt(a.substring(2, 4)));
		
		
	}
	
	else {
		
		System.out.println(Integer.parseInt(a.substring(0, 1))+Integer.parseInt(a.substring(1, 2)));
	}
}
}