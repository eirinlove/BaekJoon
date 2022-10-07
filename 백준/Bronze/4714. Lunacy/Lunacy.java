import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	while(true) {
	float a = scan.nextFloat();
	if(a < 0 ) {break;}	
	System.out.println("Objects weighing "+String.format("%.2f", a)+" on Earth will weigh "+String.format("%.2f", a*0.167)+" on the moon.");
	
	
	}
}
}
