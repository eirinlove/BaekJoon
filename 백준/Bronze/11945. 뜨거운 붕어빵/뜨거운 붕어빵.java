import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	
	int a = scan.nextInt();
	int b = scan.nextInt();

	for(int i=0; i<a; i++) {
	
	while(scan.hasNext()) {
	StringBuilder r = new StringBuilder(scan.next());
	
	System.out.println(r.reverse());
	}
	
		
		
	}
}
}