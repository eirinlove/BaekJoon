import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		
		
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s = new StringTokenizer(scan.readLine(), " ");
		
	
		int a  = Integer.parseInt(s.nextToken());
		int b  = Integer.parseInt(s.nextToken());
		int c  = Integer.parseInt(s.nextToken());
		int d = (c-b) / (a-b);
		
		
		if ((c-b) % (a-b) != 0 ) { // 결과가 0이라면, 낮과 밤이 맞아떨어지지만, 그것이 아니라면 하루를 더 오를것이다.
			
		d++;
		
		}
		System.out.println(d);
		
	
	}
}

