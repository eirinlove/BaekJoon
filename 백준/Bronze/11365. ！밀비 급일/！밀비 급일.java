import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		while(true) {
		String a = scan.nextLine();
		String b[] = a.split("");
		
		if("END".equals(a)) {break;}
		
		
		for(int i=b.length-1; i>=0; i--) {
			
			System.out.print(b[i]);
			
			
		}
		System.out.println();
		}
		
	}
}