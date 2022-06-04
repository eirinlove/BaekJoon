import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	String[] No = new String[20]; 
	double[] Array = new double[20];
	String[] Array2 = new String[20];
	double Hab = 0;
	double Hab2 = 0;
	
	for (int i = 0; i<20; i++) {
		
		No[i] = scan.next();
		Array[i] = scan.nextDouble();
		Array2[i] = scan.next();
	


		double temp = 0;
		if(Array2[i].equals("A+")) { temp = 4.5; }
		else if (Array2[i].equals("A0")) { temp = 4.0; }
		else if (Array2[i].equals("B+")) { temp = 3.5; }
		else if (Array2[i].equals("B0")) { temp = 3.0; }
		else if (Array2[i].equals("C+")) { temp = 2.5; }
		else if (Array2[i].equals("C0")) { temp = 2.0; }
		else if (Array2[i].equals("D+")) { temp = 1.5; }
		else if (Array2[i].equals("D0")) { temp = 1.0; }
		else if (Array2[i].equals("F"))  { temp = 0.0; }
		else if (Array2[i].equals("P"))  { temp = 1000;}
		
		if (temp < 1000) {
		Hab += Array[i] * temp; 
		Hab2 += Array[i];
		}

	}
	scan.close();
	
	
	System.out.println(String.format("%.6f", (double)Hab/Hab2));
	
	
	
	
	
}
	

	
}