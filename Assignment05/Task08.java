import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
	Scanner scanner = new Scanner ( System.in );
	System.out.println("Please enter the quantity of numbers: ");
	int quantity = scanner.nextInt();
	int a[] = new int[quantity];
	int maxLocation, temp, aLengthMinusOne = a.length - 1, median;
	for ( int i = 0; i < a.length; i++ ) {
	    System.out.println("Please enter a number: ");
	    a[i] = scanner.nextInt();
	}
	
	for ( int i = 0; i < aLengthMinusOne; i++ ) {
	    maxLocation = i;
	    for ( int j = i + 1; j < a.length; j++ ) {
		if ( a[j] > a[maxLocation] ) {
		    maxLocation = j;
		}
	    }
	    temp = a[i];
	    a[i] = a[maxLocation];
	    a[maxLocation] = temp;
	}

	if ( a.length % 2 == 1 ) {
	    median = a[a.length / 2];
	} else {
	    median = (a[a.length / 2] + a[a.length / 2 - 1]) / 2;
	}
	System.out.println("Median: " + median);
    }
}
