import java.util.Scanner;

public class Main {
	

static	int N = 0;
static	int M = 0;
static int[] Array;
static boolean[] 다녀감;

public static void main(String[] args) {
	


	Scanner scan = new Scanner(System.in);
	N = scan.nextInt();
	M = scan.nextInt();
	scan.close();
	다녀감 = new boolean[N+1]; 
	Array = new int[M+1];
	
	깊이탐색(0);
	
	
}



static void 깊이탐색(int index) {
	
	if( index == M ) { 
		for(int i =0; i<M; i++) {
			
			System.out.print(Array[i] + " "); 
			} 
		System.out.println(); 
		return;
	}
	for ( int i = 1; i<=N; i++) { 
		if (!다녀감[i]) { 
			다녀감[i] = true; 
			Array[index] = i;
			깊이탐색(index+1);
			for(int j = i+1; j <= N; j++) {
			다녀감[j] = false;
			}
		}
		
	}
	
}


}