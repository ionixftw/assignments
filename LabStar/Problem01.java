import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
	Scanner scanner = new Scanner ( System.in );
	System.out.println("Please enter the number of outputs: ");
	int num = scanner.nextInt();

	for ( int i = 1; i <= num; i++ ) {
	    System.out.print(i + " " );

	}
	System.out.println();

    }

}
