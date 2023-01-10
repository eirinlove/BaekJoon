import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	int a = scan.nextInt();
	while(true)
		
	{
		
		String b = scan.next();
		
		if("+".equals(b)) {
			
			a+=scan.nextInt();
		}
		
		else if ("-".equals(b)) {
			a-=scan.nextInt();
			
		}
		
		else if ("*".equals(b)) {
			
			a*=scan.nextInt();
		}
		else if ("/".equals(b)) {
			a/=scan.nextInt();
			
		}
		
		if("=".equals(b)) {
			
			System.out.println(a);
			break;
		}
		
	}
	
	
	
}
}