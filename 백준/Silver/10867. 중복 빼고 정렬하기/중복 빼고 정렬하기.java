import java.util.Scanner;
import java.util.TreeSet;

public class Main {
public static void main(String[] args) {
	
	
	
	Scanner scan = new Scanner(System.in);
	
	TreeSet<Integer> num = new TreeSet<Integer>();
	
	int n = scan.nextInt();
	
	for(int i=0; i<n; i++) {
		
		int j  = scan.nextInt();
		num.add(j);
		
	}


	String o = num.toString();
	o = o.replace("[", "");
	o = o.replace("]", "");
	o = o.replaceAll(",", "");

	System.out.println(o);
	
	
}
}