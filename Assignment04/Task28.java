import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
	Scanner k = new Scanner(System.in);
	System.out.println("Please enter a number" );
	int num = k.nextInt();
	int init = 1, sum = 0;
	while ( init <= num ) {
	    if ( num % init == 0 ) sum += init;
	    ++init;
	}
	System.out.println("The sum of all the factors: " + sum);
	    
    }
}
