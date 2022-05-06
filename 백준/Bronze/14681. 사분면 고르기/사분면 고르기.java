import java.util.Scanner;

public class Main{

    public static void main(String[] args) { 
    	
    	
    	Scanner scan = new Scanner(System.in);
    	
    	
    	int a = scan.nextInt();
    	int a1 = scan.nextInt();
    	
    	if (a >= 0 && a1 >= 0) {System.out.println("1");}
    	if (a < 0 && a1 >= 0) {System.out.println("2");}
    	if (a < 0 && a1 < 0) {System.out.println("3");}
    	if (a >= 0 && a1 < 0) {System.out.println("4");}
}
    

}