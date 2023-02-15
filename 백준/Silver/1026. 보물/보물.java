import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }

        for (int i = 0; i < n; i++) {
            b[i] = scan.nextInt();
        }

        Arrays.sort(a); 

        int s = 0;
        for (int i = 0; i < n; i++) {
            s += a[i] * b[atleast(b)];
            b[atleast(b)] = -1; 
        }

        System.out.println(s);
    }

    public static int atleast(int[] arr) {
        int m = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[m]) {
                m = i;
            }
        }
        return m;
    }
}
