import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
	Scanner scanner = new Scanner ( System.in );
	System.out.println("Plese enter the triangle's height: ");
	int row = scanner.nextInt();

	for ( int r = 1; r <= row; r++ ) {
	    for ( int sc = 1; sc <= row - r; sc++ ) {
		System.out.print(" ");
	    }
	    for ( int st = 1; st <= (2 * r - 1); st++ ) {
		System.out.print(st);
	    }
	    System.out.println();
	}
	

    }

}
