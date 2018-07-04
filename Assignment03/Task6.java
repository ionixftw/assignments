import java.util.*;

public class Task6 {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	System.out.println("Please enter the value of S: ");
	int s = scanner.nextInt();

	int l;
	
	if ( s < 100) l = 3000 - 125*s*s;
	else l = 12000/(4 + (s*s/14900));
	System.out.println("The value of l is: " + l);
	
   }
}
