import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
	Scanner scanner = new Scanner ( System.in );
	int[] a = new int[] { 10, 30, 20, 50, 40 };
	int largestNumber = a[0], largestNumberLocation = 0,
	    backup;

	for ( int i = 0; i < a.length; i++ ) {
	    if ( a[i] > largestNumber ) {
		largestNumber = a[i];
		largestNumberLocation = i;
	    }
	}
	backup = a[0];
	a[0] = largestNumber;
	a[largestNumberLocation] = backup;

	for ( int i = 0; i < a.length; i++ ) {
	    if ( i != a.length - 1 ) {
		System.out.print(a[i] + ", ");
	    } else {
		System.out.print(a[i]);
	    }
	}
	System.out.println();
	
    }
}
