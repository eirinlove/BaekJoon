import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		Scanner scan = new Scanner(System.in);
		
		
		while(true) {
			boolean sw = true;
			String word = scan.nextLine();
			String[] Array = new String[word.length()];
			Array = word.split("");
			
			if(Array.length==1 && Array[0].equals(".")) {
				
				break;
			}
			
			
			for(int i=0; i<Array.length; i++) {
				
				if(Array[i].equals("[")  || Array[i].equals("(") ) {
					
					stack.push(Array[i]);
					
				}
				else if (Array[i].equals("]")) {
					
					
					if(stack.empty() || !stack.peek().equals("[")) {sw = false; break;}
					else {stack.pop();}
					
				}
				else if (Array[i].equals(")")) {
					
					
					if(stack.empty() || !stack.peek().equals("(")) {sw = false; break; }
					else {stack.pop();}
						
					
				}
				
			}
			
			if(stack.empty() && sw == true) { System.out.println("yes");} // 짝이 맞아 stack이 비어있을 경우.
			else {System.out.println("no");}
			
			stack.clear();
			
		}
		scan.close();
		
		
	}
}