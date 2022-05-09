import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		while(true) {
			
			
		int num = s.nextInt();
		if(num < 1) { break; }
		int c=0;
		for(int o=num+1;o<=num*2;o++) {
			boolean p=true;
		for(int z=2; z<=Math.sqrt(o); z++) {
			if(o%z==0) { 
			p = false; break;
			}	
		}if(p&&o!=1) {c++;} 
		}
		System.out.println(c);
		
		}
	}
}