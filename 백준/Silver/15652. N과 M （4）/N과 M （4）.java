import java.util.Scanner;

public class Main {
	
	static	int N = 0;
	static	int M = 0;
	static int[] Array;
	static boolean[] visit;
	
public static void main(String[] args) {
	
	Scanner scan= new Scanner(System.in);
	N = scan.nextInt();
	M = scan.nextInt();
	
	Array = new int[M];
	visit = new boolean[M];
	
	backtrack(0,1);
	
}


static void backtrack(int go, int fail) {
	
	if(go == M) {
		
		for(int i=0; i<M; i++) {
			
			System.out.print(Array[i] + " ");
		}
		
		System.out.println();
		return;
		
	}
	
	for(int i=fail; i<=N; i++) {
			
		Array[go] = i;
		backtrack(go+1, i);
		
		
	}
	
}


}