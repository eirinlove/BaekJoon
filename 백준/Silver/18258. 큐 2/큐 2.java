import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		
		
		BufferedReader bf = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		
		
		LinkedList<String> queue = new LinkedList<>();
		
		int count = Integer.parseInt(bf.readLine());
		
		while(count!=0) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			String command = st.nextToken();
			
			if(command.contains("push")) {
				
				String insert = st.nextToken();
				queue.add(insert);	
			}
			
			if(command.equals("front")) {
				
				if(!queue.isEmpty()) {
					
					bw.write(queue.getFirst()+"\n");
					
				}
				else if (queue.isEmpty()) {
					bw.write("-1\n");
					
				}
				
			}
			
			if(command.equals("back")) {
				
				if(!queue.isEmpty()) {
					
					bw.write(queue.getLast()+"\n");
					
				}
				else if (queue.isEmpty()) {
					bw.write("-1\n");
		
				}
				
				
			}
			
			if(command.equals("pop")) {
				
				if(!queue.isEmpty()) {
				String a = queue.pollFirst();
				bw.write(a+"\n");}
				else if (queue.isEmpty()) {
					bw.write("-1\n");
					
				}
			}
			if(command.equals("size")) {
				
				//write( queue.size());
			
				bw.write(queue.size()+"\n");
				
			}
			if(command.equals("empty")) {
				
				if(queue.isEmpty()) {
					bw.write("1\n");
				}
				else if (!queue.isEmpty()) {
					bw.write("0\n");
				}
			}
			
			
			
			
			count--;
		}
		bw.flush();
		bw.close();
		
	}
}