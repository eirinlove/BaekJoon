import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer ob;
		
			int num = Integer.parseInt(br.readLine());
			for (int i=num; i>0; i--) {
				
				ob= new StringTokenizer(br.readLine(), " ");
				bw.write((Integer.parseInt(ob.nextToken())+Integer.parseInt(ob.nextToken()))+"\n");
				
		
		}
			
			bw.flush();
            br.close();
			bw.close();
		
	}
}