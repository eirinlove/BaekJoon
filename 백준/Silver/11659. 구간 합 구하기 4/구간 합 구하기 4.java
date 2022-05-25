import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		//Scanner scan = new Scanner(System.in);
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		StringBuilder sb = new StringBuilder();
		
		int num = Integer.parseInt(st.nextToken());
		int TC = Integer.parseInt(st.nextToken());
		int[] Array = new int[num+1]; // Array[1] = 첫번째수 와 동일하게 맞추어야 함.
		st = new StringTokenizer(bf.readLine());
		
		for(int i=1; i<=num; i++) {
			Array[i] = Array[i-1] + Integer.parseInt(st.nextToken());
		}
	
		
		while(TC!=0) {
			
			st = new StringTokenizer(bf.readLine());
			int first = Integer.parseInt(st.nextToken());
			int second = Integer.parseInt(st.nextToken());
			
			sb.append(Array[second]-Array[first-1]);
			System.out.println(sb);
			sb.setLength(0); // 누적 입력 초기화
			TC--;
		}
		
	}
}