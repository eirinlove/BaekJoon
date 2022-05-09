import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	

		int[] Array1 = new int[3];
		int[] Array2 = new int[3];
		int ob=0;
		int ject=0;
		
		
		for ( int i=0; i<Array1.length; i++) {
			
			Array1[i] = scan.nextInt();
			Array2[i] = scan.nextInt();
		}
		scan.close();
		if ( Array1[1] == Array1[2]) {
			ob = Array1[0];}
		
		
		else {if(Array1[0] == Array1[1]) 
			{ob = Array1[2];} else {ob = Array1[1];}
		}
		
		if ( Array2[1] == Array2[2]) {
			ject = Array2[0];}
		
		
		else {if(Array2[0] == Array2[1]) 
			{ject = Array2[2];} else {ject = Array2[1];}
		}
		System.out.println(ob + " " + ject);
		
		
		
	
	}
	
	
}