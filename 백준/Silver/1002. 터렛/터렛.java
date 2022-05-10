import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	int testNum = scan.nextInt();
	
	
	for(int i=0; i<testNum; i++) {
	
	
	int x1 = scan.nextInt();
	int y1 = scan.nextInt();
	int r1 = scan.nextInt();
	int x2 = scan.nextInt();
	int y2 = scan.nextInt();
	int r2 = scan.nextInt();
	
	double distance = Range(x1,x2,y1,y2);
	
	
	if ( x1==x2 && y1 == y2 && r1 == r2) { System.out.println("-1");} // 양 쪽이 두점사이의 거리가 0이고, 반지름이 같다면, 같은 원으로 접점 개수 무한 
	else if (distance > r1+r2 || distance < Math.abs(r1-r2)) { System.out.println("0");} // 점사이의 거리가 반지름보다 크거나 원을 감싸고 있으면서, 접점이 없는경우 
	else if (distance == Math.abs(r1-r2) || distance == Math.abs(r1+r2)) {System.out.println("1");} // 내접의 경우, 외접의 경우
	else {System.out.println("2");} // 나머지의 경우
	
	}
	scan.close();
}

static double Range(int x1, int x2, int y1, int y2) { //두 점 사이의 거리.
	
	double x = Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2)); // 보통 반지름 ^2 와 비교함.
	
	return x;

}

}