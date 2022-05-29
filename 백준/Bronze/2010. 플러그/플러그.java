import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		
		int plug = scan.nextInt();
		int[] Array = new int[plug];
		
		for(int i=0; i<plug; i++) {
			
			Array[i] = scan.nextInt()-1;
			
		}
		
		int hab = 0;
		
		for(int i=0; i<plug; i++) {
			
		hab += Array[i];	
			
		}
		
		System.out.println(hab+1);
		
		
	}
}