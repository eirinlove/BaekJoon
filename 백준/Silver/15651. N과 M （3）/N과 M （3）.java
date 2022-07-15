import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Main {
	

static	int N = 0;
static	int M = 0;
static int[] Array;
static boolean[] 다녀감;
static StringBuilder sb = new StringBuilder();


public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	


	StringTokenizer st = new StringTokenizer(br.readLine());
	
	N = Integer.parseInt(st.nextToken());
	M = Integer.parseInt(st.nextToken());
	
	다녀감 = new boolean[N+1];  
	Array = new int[M+1]; // 배열 
	
	깊이탐색(0);
	
	System.out.println(sb);
}



static void 깊이탐색(int index) throws IOException { 
	
	if( index == M ) {
		for(int i =0; i<M; i++) {
			
			//System.out.print(Array[i] + " "); 
			sb.append(Array[i] + " ");
			}
		sb.append("\n");
		
		return;
	}
	for ( int i = 1; i<=N; i++) { 
		
			다녀감[i] = true;  
			Array[index] = i; 
			깊이탐색(index+1);
			다녀감[i] = false; 
			
		
		
	}
	
}


}