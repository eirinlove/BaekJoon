import java.util.Scanner;
import java.util.Stack;

public class Main {

	
	public static void main(String[] args) {
		
		
		Stack<Integer> stack = new Stack<>();
		
		
		Scanner scan = new Scanner(System.in);
		
		int count = scan.nextInt();
		int temp=0;
		while(count!=0) {
			
			int j = scan.nextInt();
			if(j != 0 ) {
				stack.push(j);	
				
			}
			else if (j == 0 ) {
				
				stack.pop();
				
			}
			
			
			count--;
			
		}
		
		for(int i=0; i<stack.size(); i++) {
			
			temp += stack.get(i);
			
		}
		
		
		if ( stack.isEmpty() ) {
			
			
			System.out.println("0");
		}
		else {
			
			System.out.println(temp);
		}
		
		
		
	}
	
}