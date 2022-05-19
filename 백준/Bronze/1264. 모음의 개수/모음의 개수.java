import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);
		boolean sw = true;
		
		while(true) {
			
			String str = scan.nextLine();
			String[] strArray = new String[str.length()];
			strArray = str.split("");
			int count = 0;
			
			for(int i=0; i<strArray.length; i++) {
				
				if(strArray[i].equals("a") || strArray[i].equals("e") || strArray[i].equals("i") || strArray[i].equals("o") || strArray[i].equals("u") || strArray[i].equals("A") || strArray[i].equals("E") || strArray[i].equals("I") || strArray[i].equals("O") || strArray[i].equals("U")) {
				count++;	
					
				}
				
				if(strArray[i].equals("#")) {
					sw = false;
					break;
				}
				
			}
			
			
			if(sw==false) {break;}
			System.out.println(count);
			
			
			
			
			
		}
		
		
		
		
	}
}