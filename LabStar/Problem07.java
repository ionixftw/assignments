import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
	Scanner scanner = new Scanner ( System.in );
	System.out.println("Please enter the triangle's height: ");
	int row = scanner.nextInt();
	int scLimit = row - 1;
	int stLimit = 1;
	for ( int r = 1; r <= row; r++ ) {
	    for ( int s = 1; s <= scLimit; s++ ) {
		System.out.print(" ");
	    }
	    for ( int t = 1; t <= stLimit; t++ ) {
		System.out.print("*");
	    }
	    System.out.println();
	    scLimit--;
	    stLimit++;
	}


    }

}
