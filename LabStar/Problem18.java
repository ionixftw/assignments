import java.util.Scanner;

public class Problem18 {
    public static void main(String[] args) {
	Scanner scanner = new Scanner ( System.in );
	System.out.println("Please enter the rowCount");
	int row = scanner.nextInt();

	for ( int r = 1; r <= row; r++ ) {
	    for ( int sc = 1; sc <= row - r; sc ++ ) {
		System.out.print(" ");
	    }
	    for ( int c = 1; c <= r; c++ ) {
		if ( c == 1 || c == r || r == row ) {
		    System.out.print("*");
		} else {
		    System.out.print(" ");
		}
	    }
	    System.out.println();
	}


    }

}
