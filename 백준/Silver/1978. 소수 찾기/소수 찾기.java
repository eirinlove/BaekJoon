import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();
		int c=0;
		for(int o=0;o<i;o++) {
			int y=s.nextInt();
			boolean p=true;
		for(int z=2; z<=Math.sqrt(y); z++) {
			if(y%z==0) { 
			p = false; break;
			}	
		}if(p&&y!=1) {c++;} 
		}
		System.out.print(c);
	}
}
