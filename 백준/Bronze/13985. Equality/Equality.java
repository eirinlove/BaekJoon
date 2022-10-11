import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	
	int a = scan.nextInt();
	String b = scan.next();
	int c = scan.nextInt();
	String d = scan.next();
	int e = scan.nextInt();
	
	if("+".equals(b) && a+c==e) {
		
		System.out.println("YES");
		
	}
	else if("-".equals(b) && a-c==e){
		
		System.out.println("YES");
		
	}
	else if("*".equals(b) && a*c==e){
		
		System.out.println("YES");
		
	}
	else if("/".equals(b) && a/c==e){
		
		System.out.println("YES");
		
	}
	
	else {System.out.println("NO");}
}
}
