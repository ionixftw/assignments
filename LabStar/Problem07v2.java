import java.util.Scanner;

public class Problem07v2 {
    public static void main(String[] args) {
	Scanner scanner = new Scanner ( System.in );
	System.out.println("Please enter the triangle's height: " );
	int row = scanner.nextInt();

	for ( int r = 1; r <= row; r++ ) {
	    for ( int sc = 1; sc <= row - r; sc++ ) {
		System.out.print(" ");
	    }

	    for ( int stc = 1; stc <= r; stc++ ) {
		System.out.print("*");
	    }
	    System.out.println();
	}
	

    }

}
