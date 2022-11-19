import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	scan.nextLine();
	while(n!=0) {
		
		String s = scan.nextLine();
		String[] array = s.split("");
		System.out.print(array[0].toUpperCase());
		for(int i = 1; i<array.length; i++) {
			
			System.out.print(array[i]);
		}
		System.out.println();
		n--;
	}
}
}
