import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		scan.close();
		String bin = Integer.toBinaryString(num);
		int count = 0;
		
		
		for(int i=0; i<bin.length(); i++) {
			
			if(bin.charAt(i) == '1') {
				
				count++;
				
				
			}
		}
		
		System.out.println(count);
		
	}
	
}