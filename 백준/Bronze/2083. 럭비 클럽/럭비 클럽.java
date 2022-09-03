import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);

	while(true) {
		
		
		String name = scan.next();
		int age = scan.nextInt();
		int weight = scan.nextInt();
		
		
		if("#".equals(name) && age==0 && weight==0) {
			
			break;
		}

		if(age > 17 || weight >= 80) {
			
			System.out.println(name+" Senior");
		}
		
		else {
			System.out.println(name+" Junior");
			
			
		}
		

		
		
	}
	
	
	
	
}
}