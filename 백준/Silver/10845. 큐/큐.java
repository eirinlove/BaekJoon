import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		
		
		BufferedReader bf = new BufferedReader (new InputStreamReader(System.in));

		
		
		LinkedList<String> queue = new LinkedList<>();
		
		int count = Integer.parseInt(bf.readLine());
	
		while(count!=0) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			String command = st.nextToken();
			
			if(command.contains("push")) {
				
				String insert = st.nextToken();
				queue.add(insert);
				
			}
			
			if(command.contains("front")) {
				
				if(!queue.isEmpty()) {
					
					System.out.println(queue.getFirst());
					
				}
				else if (queue.isEmpty()) {
					System.out.println("-1");
				}
				
			}
			
			if(command.contains("back")) {
				
				if(!queue.isEmpty()) {
					
					System.out.println(queue.getLast());
					
				}
				else if (queue.isEmpty()) {
					System.out.println("-1");
				}
				
				
			}
			
			if(command.contains("pop")) {
				
				if(!queue.isEmpty()) {
				String a = queue.pollFirst();
				System.out.println(a);}
				else if (queue.isEmpty()) {
					System.out.println("-1");
				}
			}
			if(command.contains("size")) {
				
				System.out.println(queue.size());
			}
			if(command.contains("empty")) {
				
				if(queue.isEmpty()) {
					System.out.println("1");
				}
				else if (!queue.isEmpty()) {
					System.out.println("0");
				}
			}
			
			
			count--;
		}
		
	}
}