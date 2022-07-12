import java.util.Scanner;

public class Main {
	
	static int a = 0;
	
	static int[] Array;
	static boolean[] visit;
	
public static void main(String[] args) {
	
	Scanner scan= new Scanner(System.in);
	a = scan.nextInt();
	
	
	Array = new int[a+1];
	visit = new boolean[a+1];
	
	
	backtrack(0);
	

	
}


static void backtrack(int go) {
	
	
	if(go == a) {
		
		for(int i=0; i<a; i++) {
			
			
			
			System.out.print(Array[i] + " ");
		}
		
		System.out.println();
		return;
		
	}
	
	for(int i=1; i<=a; i++) {
		
		if(!visit[i]) {
		visit[i] = true;
		Array[go] = i;
		backtrack(go+1);
		visit[i] = false;
		}
		
	}
	
}


}
