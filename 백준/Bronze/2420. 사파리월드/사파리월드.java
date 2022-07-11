import java.util.Scanner;


public class Main{
    
    
    public static void main(String args[])
        {
        
        Scanner scan = new Scanner(System.in);
        
        long a = scan.nextInt();
        long b = scan.nextInt();
        
        System.out.println(Math.abs(a+(b*-1)));
        
        
        }
        
    }