import java.util.Scanner;
import java.util.Stack;

public class Main {
public static void main(String[] args) {
	
	
	Scanner scan =  new Scanner(System.in);
	
	String a = scan.nextLine();
	Stack stack = new Stack();
	boolean sw = false;
	
	for (int i = 0; i<a.length(); i++) {
		
		
		if(a.charAt(i) == '<' || a.charAt(i) == '>') {
			
			if(a.charAt(i) == '<') {
				
				while(!stack.empty()) { // 스택 빌때까지 계속 꺼냄
					
					System.out.print(stack.peek());
					stack.pop();
				}
				
			
			}
			if(a.charAt(i) == '>') {
				
				System.out.print('>');
			
			}
			
			sw = !sw;
			
		}
	

		
		if(a.charAt(i) == ' ') {
			
		while(!stack.empty()) { // 스택 빌때까지 계속 꺼냄
			
			System.out.print(stack.peek());
			stack.pop();
		}
			
		System.out.print(a.charAt(i)); // 공백은 그대로 출력하고 여기서 나눠야함	
			
		}
		
		if(sw && a.charAt(i) != ' ') { //sw 가 true 상태 = 꺽쇠 열린 상태
			
			System.out.print(a.charAt(i));
		}
		
		else if (!sw && a.charAt(i) != '>' && a.charAt(i) != ' ') {  // sw false 상태 = 꺽쇠 닫힌상태 (리버스)
			
			
			stack.push(a.charAt(i));
			
		}
		
	}
	
	while(!stack.empty()) { // 마지막은 공백 구분이 안되므로 push한것 전부 꺼냄
		
		System.out.print(stack.peek());
		stack.pop();
	}
	
	
}
}