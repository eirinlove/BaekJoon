import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		int temp = 0;
		int temp2 = 0;
		
		
		for(int i=0; i<5; i++) 
		{
			if(i==0) {int y = scan.nextInt(); temp+=y*6;}
			if(i==1) {int y = scan.nextInt(); temp+=y*3;}
			if(i==2) {int y = scan.nextInt(); temp+=y*2;}
			if(i==3) {int y = scan.nextInt(); temp+=y*1;}
			if(i==4) {int y = scan.nextInt(); temp+=y*2;}
		}

		for(int i=0; i<5; i++) 
		{
			if(i==0) {int y = scan.nextInt(); temp2+=y*6;}
			if(i==1) {int y = scan.nextInt(); temp2+=y*3;}
			if(i==2) {int y = scan.nextInt(); temp2+=y*2;}
			if(i==3) {int y = scan.nextInt(); temp2+=y*1;}
			if(i==4) {int y = scan.nextInt(); temp2+=y*2;}
		}		
		
		System.out.print(temp+" "+temp2);	
		
		
	}
}
