import java.util.Scanner;	
 
public class Main {
	public static void main(String[] args) {
 
		Scanner scan = new Scanner(System.in);	
 
		 			
		String i = scan.next(); 
        int n = scan.nextInt();
        int temp = 0;
        while(n !=0 ){
            
            String a = scan.next();
            if(a.equals(i)){
                temp++;
            }
            n--;
        }
        System.out.println(temp);
	}
 
}