import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	int temp=0;
	
	while(scan.hasNextLine()) {
		
		String a = scan.nextLine();
		
        if (a.startsWith(" ") || a.endsWith(" ") || a.length()>100 || a.isEmpty()) {
            break;
        }
		if("gum gum for jay jay".equals(a)) {
			temp++;
		}

	}
	System.out.println(temp);
}

}
