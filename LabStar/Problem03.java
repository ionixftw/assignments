import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
	Scanner scanner = new Scanner ( System.in );
	System.out.println("Please enter the rectangle's width: ");
	int width = scanner.nextInt();
	System.out.println("Please enter the ractangle's height: ");
	int height = scanner.nextInt();

	for ( int w = 0; w < width; w++ ) {
	    for ( int h = 0; h < height; h++ ) {
		System.out.print("*");
	    }
	    System.out.println();
	}


    }

}
