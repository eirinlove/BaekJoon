import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Queue<Integer> queue = new LinkedList<Integer>();
	Scanner scan = new Scanner(System.in);
	
	int N = scan.nextInt();
	int K = scan.nextInt();
	
	for ( int i=0; i<N; i++) {
		
		queue.add(i+1);
	}
	
	
	System.out.print("<");
	
	for (int j=0; j<N; j++) {
	
	for(int z=1; z<K; z++) {
		
		
		if ( queue.size() > 1 ) {
		int temp = queue.poll();
		queue.add(temp);
		}
		
		
	}
	if( queue.size() > 1 ) {
	System.out.print(queue.poll()+", ");
	}
	else {System.out.print(queue.poll());}
	
	}
	System.out.print(">");
	
	
	
}
}