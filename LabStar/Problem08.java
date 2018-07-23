import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
	Scanner scanner = new Scanner ( System.in );
	System.out.println("Please enter the triangle's height: ");
	int row = scanner.nextInt();
	int scLimit = row -1;
	int stLimit = 1;
	for ( int r = 0; r < row; r++ ) {
	    for ( int sc = 1; sc <= scLimit; sc++ ) {
		System.out.print(" ");
	    }

	    for ( int st = 1; st <= stLimit; st++ ) {
		System.out.print(st);
	    }
	    System.out.println();
	    scLimit--;
	    stLimit++;
	}


    }

}
