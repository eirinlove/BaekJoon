import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	
	int[] a = new int[6];
	
	for(int i =0; i<a.length; i++) {
		
		a[i] = scan.nextInt();
		
	}
	
	int b = 0;
	
	for(int i =0; i<a.length; i++) {
		
	
		if(i==0) { b=1;}
		if(i==1) { b=1;}
		if(i==2) { b=2;}
		if(i==3) { b=2;}
		if(i==4) { b=2;}
		if(i==5) { b=8;}
	
		a[i] = b-a[i];
		
	}
	
	
	for(int i =0; i<a.length; i++) {
		
		if(i != a.length) {
		System.out.print(a[i]+" ");
		}
		else {
		System.out.println(a[i]);
			
		}
		
		}
	
	
	
}
}