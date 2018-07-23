import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
	Scanner scanner = new Scanner ( System.in );
	System.out.println("Please enter the width/row: " );
	int row = scanner.nextInt();
	System.out.println("Please enter the height/column: ");
	int col = scanner.nextInt();

	for ( int r = 0; r < row ; r++ ) {
	    for ( int c = 0; c < col; c++ ) {
		System.out.print(c + 1);
	    }
	    System.out.println();
	}


    }

}
