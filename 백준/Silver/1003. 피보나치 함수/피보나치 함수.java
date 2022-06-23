import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	int set = scan.nextInt();
	
	while(set!=0){
		int n = scan.nextInt();
		
		switch(n){
		
		case 0:
			System.out.println("1 0");
			break;
		case 1:
			System.out.println("0 1");
			break;
		case 2:
			System.out.println("1 1");
			break;
		case 3:
			System.out.println("1 2");
			break;
		case 4:
			System.out.println("2 3");
			break;
		case 5:
			System.out.println("3 5");
			break;
		case 6:
			System.out.println("5 8");
			break;
		case 7:
			System.out.println("8 13");
			break;
		case 8:
			System.out.println("13 21");
			break;
		case 9:
			System.out.println("21 34");
			break;
		case 10:
			System.out.println("34 55");
			break;
		case 11:
			System.out.println("55 89");
			break;
		case 12:
			System.out.println("89 144");
			break;
		case 13:
			System.out.println("144 233");
			break;
		case 14:
			System.out.println("233 377");
			break;
		case 15:
			System.out.println("377 610");
			break;
		case 16:
			System.out.println("610 987");
			break;
		case 17:
			System.out.println("987 1597");
			break;
		case 18:
			System.out.println("1597 2584");
			break;
		case 19:
			System.out.println("2584 4181");
			break;
		case 20:
			System.out.println("4181 6765");
			break;
		case 21:
			System.out.println("6765 10946");
			break;
		case 22:
			System.out.println("10946 17711");
			break;
		case 23:
			System.out.println("17711 28657");
			break;
		case 24:
			System.out.println("28657 46368");
			break;
		case 25:
			System.out.println("46368 75025");
			break;
		case 26:
			System.out.println("75025 121393");
			break;
		case 27:
			System.out.println("121393 196418");
			break;
		case 28:
			System.out.println("196418 317811");
			break;
		case 29:
			System.out.println("317811 514229");
			break;
		case 30:
			System.out.println("514229 832040");
			break;
		case 31:
			System.out.println("832040 1346269");
			break;
		case 32:
			System.out.println("1346269 2178309");
			break;
		case 33:
			System.out.println("2178309 3524578");
			break;
		case 34:
			System.out.println("3524578 5702887");
			break;
		case 35:
			System.out.println("5702887 9227465");
			break;
		case 36:
			System.out.println("9227465 14930352");
			break;
		case 37:
			System.out.println("14930352 24157817");
			break;
		case 38:
			System.out.println("24157817 39088169");
			break;
		case 39:
			System.out.println("39088169 63245986");
			break;
		case 40:
			System.out.println("63245986 102334155");
			break;
		
		}
		set--;
		
	}
	
	
}
}