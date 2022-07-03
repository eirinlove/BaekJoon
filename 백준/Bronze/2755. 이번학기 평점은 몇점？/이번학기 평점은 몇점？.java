import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	
	
	int n = scan.nextInt();
	String[] 과목명 = new String[n];
	int[] 학점 = new int[n];
	String[] 성적 = new String[n];
	double 총성적보관[] = new double[n];
	
	
	for ( int i =0 ; i< n; i++) {
		
		
		
		과목명[i] = scan.next();
		학점[i] = scan.nextInt();
		성적[i] = scan.next();
		
		switch(성적[i]) {
		
		case "A+":
			총성적보관[i] =  (double) (4.3 * 학점[i]);
			break;
		case "A0":
			총성적보관[i] =  (double) (4.0 * 학점[i]);
			break;
		case "A-":
			총성적보관[i] =  (double) (3.7 * 학점[i]);
			break;
		case "B+":
			총성적보관[i] =  (double) (3.3 * 학점[i]);
			break;
		case "B0":
			총성적보관[i] =  (double) (3.0 * 학점[i]);
			break;
		case "B-":
			총성적보관[i] =  (double) (2.7 * 학점[i]);
			break;
		case "C+":
			총성적보관[i] =  (double) (2.3 * 학점[i]);
			break;
		case "C0":
			총성적보관[i] =  (double) (2.0 * 학점[i]);
			break;
		case "C-":
			총성적보관[i] =  (double) (1.7 * 학점[i]);
			break;
		case "D+":
			총성적보관[i] =  (double) (1.3 * 학점[i]);
			break;
		case "D0":
			총성적보관[i] =  (double) (1.0 * 학점[i]);
			break;
		case "D-":
			총성적보관[i] =  (double) (0.7 * 학점[i]);
			break;
		case "F":
			총성적보관[i] =  (double) (0 * 학점[i]);
			break;
		
		}
			
	}
	
	
	double temp = 0;
	double temp2 = 0;
	for(int i = 0; i<n; i++) {
		
		temp += 총성적보관[i];
		temp2 += 학점[i];

	}
	
	System.out.println(String.format("%.2f", temp/temp2));

	
}
}
