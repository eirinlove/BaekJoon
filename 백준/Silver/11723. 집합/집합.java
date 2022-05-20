import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main{
public static void main(String[] args) throws IOException {
	
	
	BufferedReader bf = new BufferedReader (new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
	
	Set<Integer> hash = new LinkedHashSet<Integer>();
	
	int count = Integer.parseInt(bf.readLine());
	while(count!=0) {
		StringTokenizer st = new StringTokenizer(bf.readLine());
		String command = st.nextToken();
		
		if(command.contains("add")) {
		
			String insert = st.nextToken();
			hash.add(Integer.parseInt(insert));
			
		}
		if(command.contains("remove")) {
			
			String remove = st.nextToken();
			hash.remove(Integer.parseInt(remove));
		}
		if(command.contains("check")) {
			
			String check = st.nextToken();
			if (hash.contains(Integer.parseInt(check))) {
				
			bw.write("1\n");
			}
			else {bw.write("0\n");}
			
		}
		
		if(command.contains("toggle")) {
			
			String toggle = st.nextToken();
			if(hash.contains(Integer.parseInt(toggle))){
				
				hash.remove(Integer.parseInt(toggle));
			}
			else {hash.add(Integer.parseInt(toggle));}
		}
		if (command.equals("all")) {
			
			for(int i=0; i<20; i++) {
				hash.add(i+1);
			}
		}
		if (command.equals("empty")) {
			
			hash.clear();
		}
		
		count--;
	}
	bw.flush();
	bw.close();
	
	
}
}