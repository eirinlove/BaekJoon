import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	
	
	int n = scan.nextInt();
	int temp = 0;
	
	for(int i = 1; i<=500; i++) {
		
		for(int j = 1; j<=500; j++) {
			
			if((i*i) - (j*j) == n) {
				
				temp = temp+1;
				
			}
			
			
		}
	}
System.out.println(temp);

}


}