import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
	Scanner scanner = new Scanner ( System.in );
	System.out.println("Please enter the number of stars: ");
	int stars = scanner.nextInt();

	for ( int i = 0; i < stars; ++i ) {
	    System.out.print("*");
	}
	System.out.println();

    }

}
