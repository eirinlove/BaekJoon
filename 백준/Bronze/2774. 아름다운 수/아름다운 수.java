import java.util.Scanner;

public class Main {

	
public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	boolean[] b = {false,false,false,false,false,false,false,false,false,false};
	
	
	int t = scan.nextInt();
	

	while(t!=0) {
		
		int num = scan.nextInt();
		int count = 0;
		String[] text = new String[Integer.toString(num).length()];
		text = Integer.toString(num).split("");
		
		
		for(int i=0; i<text.length; i++) {
			
			
			b[Integer.parseInt(text[i])] = true;
			
			
		}
		
		
		for(int i=0; i<b.length; i++) {
			
			if(b[i] == true) {
				b[i] = false;
				count++;
			}
		
		}
			
		System.out.println(count);
		
		t--;
		
	}
	
	
	
	
}	
}