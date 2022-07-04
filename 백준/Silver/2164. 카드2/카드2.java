import java.util.LinkedList;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	LinkedList<Integer> queue = new LinkedList<>();
	
	Scanner scan = new Scanner(System.in);
	
	int n = scan.nextInt();
	
	
	for(int i =0; i<n; i++) {
		
		queue.add(i+1);
		
	}
	
	while(queue.size() != 1) {
		
		queue.poll();
		int y = queue.pollFirst();
		queue.add(y);
		
		
		
	}
	
	System.out.println(queue.peek());
	
	
}
}