import java.util.LinkedList;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	LinkedList<Integer> queue = new LinkedList <>();
	
	Scanner scan = new Scanner(System.in);


	
	int n = scan.nextInt();
	
	
	for(int i = 1; i<=n; i++) {
		queue.add(i);
	
	}

	
	
	while(!queue.isEmpty()) {
		
		int temp = queue.poll();
		System.out.print(temp);
		if(!queue.isEmpty()) {
		int temp2 = queue.poll();
		queue.add(temp2);
		System.out.print(" ");
		}
		
		
		
		
	}
	

}
}