import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
	Scanner scanner = new Scanner ( System.in );
	// Triangle Left Justified

	System.out.println("Please enter the triangle's height: ");
	int row = scanner.nextInt();

	for ( int r = 0; r < row; r++ ) {
	    for ( int c = 0; c <= r; c++) {
		System.out.print("*");
	    }
	    System.out.println();
	}


    }

}
