import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Stack<Integer> stack = new Stack<>();
		
		int count = Integer.parseInt(bf.readLine());
		
		
		while(count!=0) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			String command = st.nextToken();
			
			if (command.contains("push")) {
				
				int insert = Integer.parseInt(st.nextToken());
				stack.push(insert);
				
				
			}
			
			if (command.equals("pop")) {
				
				
				
				if(!stack.isEmpty()) {
				
				bw.write(stack.pop()+"\n");
				}
				
				else { bw.write("-1\n"); }
			}
			
			if (command.equals("size")) {
				
				bw.write(stack.size()+"\n");
				
			}
			
			if (command.equals("empty")) {
				
				if(stack.isEmpty()) {
					
					bw.write("1\n");
				}
				else if (!stack.isEmpty()) {
					bw.write("0\n");
				}
				
			}
			
			if (command.equals("top")) {
			
				if(!stack.isEmpty()) {
				bw.write(stack.peek()+"\n");}
				
				else {bw.write("-1\n");}
				
			}
			count--;
			
		}
		bw.flush();
		bw.close();
		
	}
}