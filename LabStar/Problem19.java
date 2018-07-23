import java.util.Scanner;

public class Problem19 {
    public static void main(String[] args) {
	Scanner scanner = new Scanner ( System.in );
	System.out.println("Please enter the rowCount");
	int row = scanner.nextInt();

	for ( int r = 1; r <= row; r++ ) {
	    for ( int sc = 1; sc <= row - r; sc++ ) {
		System.out.print(" ");
	    }
	    for ( int c = row - r + 1; c <= row; c++ ) {
		if ( c == row - r + 1 || c == row || r == row ) {
		    System.out.print(c);
		} else {
		    System.out.print(" ");
		}
	    }
	    System.out.println();
	}


    }

}
