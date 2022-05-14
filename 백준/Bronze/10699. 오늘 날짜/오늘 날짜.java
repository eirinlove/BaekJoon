import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
public static void main(String[] args) {
	
	
	SimpleDateFormat date = new SimpleDateFormat("YYYY-MM-dd");
	Date day = new Date();
	
	System.out.println(date.format(day));
}
}
