import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int[] Array = new int[num];
		int[] range = new int[8001];
		int[][] count = new int[8001][2];
		
		int mode = 0;
		int first = 0;
		
		
		for(int i=0; i<num; i++) {
			
			Array[i] = scan.nextInt();
			count[Array[i]+4000][1] = Array[i];
			count[Array[i]+4000][0]++;
			first += Array[i];
		}
		scan.close();
		
		Arrays.sort(Array);
		Arrays.sort(count, (x,y)->{
			
			if(x[0] == y[0]) 
				
				return x[1]-y[1];
			
			else  
				
				return y[0]-x[0];
			
			
		});
		mode = mode(Array, count);
		
		
		
		System.out.println(Math.round((double)first/Array.length));
		System.out.println(Array[Array.length/2]);
		System.out.println(mode);
		System.out.println(Array[Array.length-1]-Array[0]);
		

		
		
	}
	

	
	
	static int mode(int[] Array, int[][] count) {
	
	if(Array.length == 1) 
		return (Array[0]);
		
	else if(count[0][0] == count[1][0]) 
		return count[1][1];
		
	else
		return count[0][1]; 
	
	
	
}
	
	
}