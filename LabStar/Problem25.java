import java.util.Scanner;

public class Problem25 {
    public static void main(String[] args) {
	Scanner scanner = new Scanner ( System.in );
	System.out.println("Please enter the palindromic triangle's height");
	int row = scanner.nextInt();

	for ( int r = 1; r <= row; r++ ) {
	    for ( int sc = 1; sc <= row - r; sc++ ) {
		System.out.print(" ");
	    }
	    for ( int n = 1; n <= r; n++ ) {
		System.out.print(n);
	    }
	    for ( int n = r - 1; n >= 1; n--) {
		System.out.print(n);
	    }
	    System.out.println();
	}


    }

}
