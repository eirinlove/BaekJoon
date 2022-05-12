import java.util.Scanner;

public class Main {

public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	
	while(true) {
	String str = scan.next();
	String[] Array = str.split("");
	boolean s = true;
	
	if (str.equals("0")) {
		
		break;
	}
	
	for(int i=0; i<Array.length; i++) {
		if(!Array[i].contains(Array[(Array.length-1)-i])) {
			
			s = false;
		}
	}
	if(s==true) {
		
		System.out.println("yes");
	}
	else if(s==false) {
		
		System.out.println("no");
	}
	
	
	}
	
	
}
	
}