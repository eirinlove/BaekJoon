import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		Scanner scan = new Scanner(System.in);
		
		
		int count = scan.nextInt();
		
		while(count!=0) {
			boolean sw = true;
			String word = scan.next();
			String[] Array = new String[word.length()];
			Array = word.split("");
			

			
			for(int i=0; i<Array.length; i++) {
				
				if(Array[i].equals("(") ) {
					
					stack.push(Array[i]);
					
				}

				else if (Array[i].equals(")")) {
					
					
					if(stack.empty() || !stack.peek().equals("(")) {sw = false; break; }
					else {stack.pop();}
						
					
				}
				
			}
			
			if(stack.empty() && sw == true) { System.out.println("YES");} // 짝이 맞아 stack이 비어있을 경우.
			else {System.out.println("NO");}
			stack.clear();
			count--;
			
		}
		scan.close();
		
		
	}
}