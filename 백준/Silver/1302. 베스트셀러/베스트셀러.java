import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		HashMap<String,Integer> over = new HashMap<String,Integer>();
		String str = "";
		int y  = 0;
		int x = scan.nextInt();
		for(int i=0; i<x; i++) {
			
			String temp  = scan.next();
			if(!over.containsKey(temp)) {over.put(temp, 1);}
			else { over.put(temp, over.get(temp)+1);}
		}
		scan.close();
		for(String in : over.keySet()) {	int get = over.get(in);
			
			if(y == get && str .compareTo(in) > 0 ) {str = in; y = get;}
			else if (y < get) {str = in; y =  get;}
			
			
		}
		System.out.println(str);
		
	}
}