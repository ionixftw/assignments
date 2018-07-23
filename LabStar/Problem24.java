import java.util.Scanner;

public class Problem24 {
    public static void main(String[] args) {
	Scanner scanner = new Scanner ( System.in );
	System.out.println("Please enter the palindrome's limit number");
	int limit = scanner.nextInt();

	for ( int n = 1; n <= limit; n++) {
	    System.out.print(n);
	}
	for ( int n = limit - 1; n >= 1; n-- ) {
	    System.out.print(n);
	}
	System.out.println();

    }

}
