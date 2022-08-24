import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	
	
	int a = scan.nextInt();
	int[] Array = new int[a];
	
	for(int i =0; i<a; i++){
		
		Array[i] = scan.nextInt();
		
	}
	
	int temp=0;
	int solve=0;
	for(int i =0; i<a; i++){
		
		if(Array[i] == 1){
			
			
			solve += 1 + temp;
			temp++;
		}
		
		if(Array[i] == 0){
			temp=0;
			
		}
		
	}
	
	System.out.println(solve);
	
}
}