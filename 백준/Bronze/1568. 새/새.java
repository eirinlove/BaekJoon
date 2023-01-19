import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	int n = scan.nextInt();
	int temp = 0;
	int o = 0;
	while(true){
		
		for(int i = 1; i<=n; i++){
			
			if(temp+i<=n){
				
				temp += i;
				o++;
			}
			
			else if (temp+i>n){
				
				break;
			}
			
		}
		
		if(temp==n){
			
			break;
		}
		
	}
	
	System.out.println(o);
}
}
