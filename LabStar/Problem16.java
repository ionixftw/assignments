import java.util.Scanner;

public class Problem16 {
    public static void main(String[] args) {
	Scanner scanner = new Scanner ( System.in );
	System.out.println("Please enter the triangle's height: ");
	int row = scanner.nextInt();

	for ( int r = 1; r <= row; r++ ) {
	    for ( int c = 1; c <= r; c++ ) {
		/*if ( c == 1 || c == r || r == row ) {
		    System.out.print("*");
		} else {
		    System.out.print(" ");
		}  */
		if ( c > 1 && c < r && r != row ) {
		    System.out.print(" ");
		} else {
		    System.out.print("*");
		}
		
	    }
	    System.out.println();
	}


    }

}
