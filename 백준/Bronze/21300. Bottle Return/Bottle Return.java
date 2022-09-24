import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
        int temp = 0;
        
        for(int i = 0; i  < 6; i++){
            temp += scan.nextInt()*5; 
            
        }
        
        System.out.print(temp);
		
	}
}