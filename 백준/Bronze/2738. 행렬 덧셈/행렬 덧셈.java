import java.util.Scanner;

public class Main {

public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);

	int a = scan.nextInt();
	int b = scan.nextInt();
	
	
	int[][] array = new int[a][b];
	
	
	for(int i = 0; i<a; i++) {
		
		for(int j = 0; j<b; j++){
			
			
			array[i][j] = scan.nextInt();
			
		}
		
		
	}
	
	for(int i =0; i<a; i++) {
		
		for(int j=0; j<b; j++) {
			
			
			int r =  array[i][j] + scan.nextInt();
			System.out.print(r+" ");
		} 
		System.out.println();
	}
	
	
	
	
}
}