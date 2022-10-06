import java.util.Scanner;
public class Main {

	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		
		int i;
		int j = scan.nextInt();
		
		for (i=1; i<=9; i++) {
			
			System.out.println(j+" * "+i+" = "+j*i);		
		}		
	}
}
