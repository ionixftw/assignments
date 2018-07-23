import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
	Scanner scanner = new Scanner ( System.in );
	System.out.println("Please enter the triangle's height: ");
	int row = scanner.nextInt();
	int scLimit = row - 1;

	for ( int r = 0; r < row; r++ ) {
	    for ( int sc = 0; sc < scLimit; sc++) {
		System.out.print(" ");
	    }
	    for ( int stc = 0; stc < 2 * r + 1; stc++ ) {
		System.out.print("*");
	    }
	    System.out.println();
	    scLimit--;
	}


    }

}
