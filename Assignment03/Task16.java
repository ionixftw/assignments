import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
	Scanner scanner  = new Scanner(System.in);
	System.out.println("Please enter a number: ");
	int num = scanner.nextInt();

	if ( num % 2 == 0) {
	    // even
	    if ( num > 10 )
		System.out.println("An even number greater than 10");
	    if ( num < 10 )
		System.out.println("An even number not greater than 10");
	} else {
	    // odd
	    if ( num > 10 )
		System.out.println("An odd number greater than 10");
	    if ( num < 10 )
		System.out.println("An odd number less than 10");
	}
    }

}
