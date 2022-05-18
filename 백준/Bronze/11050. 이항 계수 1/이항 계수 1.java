import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	int a = scan.nextInt();
	int b = scan.nextInt();
	
	System.out.println(fact(a)/(fact(b)*fact(a-b)));
	
}




static int fact(int x) {
	
	if(x!=0) {
	return x * fact(x-1); //재귀 호출
	}
	else {
		
		return 1;
	}
	
}

}