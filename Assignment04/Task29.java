import java.util.Scanner;

public class Task29 {
    public static void main(String[] args) {
	Scanner k = new Scanner(System.in);
	System.out.println("Please enter a number: ");
	int num = k.nextInt();
	int init = 1, sum = 0;
	while ( init < num ) {
	    if( num % init == 0 ) sum += init;
	    ++init;
	}
	if ( sum == num ) System.out.println(num + " is a perfect number");
	else System.out.println( num + " is not a perfect number");
    }
}
