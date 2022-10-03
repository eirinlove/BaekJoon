import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	
	int a = scan.nextInt();
	
	
	System.out.println("int a;");
	for(int i =1; i<=a; i++) {
		
		System.out.print("int ");
		for(int j=0; j<i; j++) {
			System.out.print("*");
		}
		if(i==1)
		{
		System.out.print("ptr =" + " &a;");	
		}
		
		else if (i==2)
		{
		System.out.print("ptr"+i+" = &ptr;");
		}
		
		else
		{
		System.out.print("ptr"+i+" = &ptr"+(i-1)+";");
		}
		System.out.println();
	}
	
	
}
}
