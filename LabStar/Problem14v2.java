import java.util.Scanner;

public class Problem14v2 {
    public static void main(String[] args) {
	Scanner scanner = new Scanner ( System.in );
	System.out.println("Please enter the rectangle's width: ");
	int col = scanner.nextInt();
	System.out.println("Please enter the rectangle's height: ");
	int row = scanner.nextInt();


	for ( int r = 1; r <= row; r++ ) {
	    for ( int c = 1; c <= col; c++ ) {
		if ( c == 1 || c == col || r== row || r == 1 ) {
		    System.out.print("*");
		} else {
		    System.out.print(" ");
		}
	    }
	    System.out.println();
	}


    }

}
