import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
	Scanner scanner = new Scanner ( System.in );
	System.out.println("Please enter the triangle's height: " );
	int row = scanner.nextInt();
	int scLimit = row - 1;
	for ( int r = 1; r <= row; r++ ) {
	    for ( int sc = 1; sc <= scLimit; sc++ ) {
		System.out.print(" ");
	    }
	    for ( int nc = row - r + 1; nc <= row; nc++ ) {
		System.out.print(nc);
	    }
	    System.out.println();
	    scLimit--;
	}

    }

}
