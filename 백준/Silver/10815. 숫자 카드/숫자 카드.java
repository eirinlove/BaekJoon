import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws IOException {
		
		Set<String> set = new HashSet<String>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] Array = new int[num];
		
		for(int i = 0; i<num; i++) {
			
			String x = st.nextToken();
			set.add(x);
			
		}
		
		int num2 = Integer.parseInt(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for(int i=0; i<num2; i++) {
			
			String x = st2.nextToken();
			if( set.contains(x) ) {
				
				System.out.print("1");
			}
			else {System.out.print("0"); }
			
			if(i!=num2-1) {
				
				System.out.print(" ");
			}
			
		}
		
		
	}
	
}