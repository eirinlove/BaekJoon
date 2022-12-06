import java.util.ArrayList;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	
	ArrayList<String> array = new ArrayList<String>();
	
	for(int i=0; i<8; i++) {
		
		String k = scan.next();
		array.add(k);
	}
	boolean s = true;
	
	for(int i=0; i<8; i++) {
		
		if(!"0".equals(array.get(i)) && !"1".equals(array.get(i))) {
			s = false;
			
		}
		
	}
	
	if(s==true) {
		
		System.out.println("S");
	}
	else {
		
		System.out.println("F");
	}
	
}
}