import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	int loop = scan.nextInt();

	
	
while(loop>0) {
	
	int sample = scan.nextInt();
	String text = scan.next();
	String[] Array = text.split("");

	for(int num=0; num<Array.length; num++) {
		
		for(int y=1; y<=sample; y++) {
			
			System.out.print(Array[num]);
			
		}
	}
	System.out.println("");
	loop = loop - 1;
	
}
scan.close();
}
}