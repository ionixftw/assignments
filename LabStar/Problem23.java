import java.util.Scanner;

public class Problem23 {
    public static void main(String[] args) {
	Scanner scanner = new Scanner ( System.in );
	System.out.println("Please enter the rowCount");
	int row = scanner.nextInt();

	for ( int r = 1; r <= row; r++ ) {
	    for ( int sc = 1; sc <= row - r; sc++ ) {
		System.out.print(" ");
	    }
	    for ( int c = 1; c <= 2 * r - 1; c ++ ) {
		if ( c == 1 || c == 2 * r - 1 ) {
		    System.out.print(c);
		} else {
		    System.out.print(" ");
		}
	    }
	    System.out.println();
	}
	for ( int r = row - 1; r >= 1; r-- ) {
	    for ( int sc = 1; sc <= row - r; sc++ ) {
		System.out.print(" ");
	    }
	    for ( int c = 1; c <= 2 * r - 1; c ++ ) {
		if ( c == 1 || c == 2 * r - 1 ) {
		    System.out.print(c);
		} else {
		    System.out.print(" ");
		}
	    }
	    System.out.println();
	}


    }

}
