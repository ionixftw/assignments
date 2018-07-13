import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
	Scanner scanner = new Scanner ( System.in );
	int[] a = new int[] { 50, 30, 20, 10, 40 };
	int max, maxLocation, temp, aLengthMinusOne =  a.length - 1;

	for ( int i = 0; i < aLengthMinusOne; i++ ) {
	    max = a[i];;
	    maxLocation = i;
	    for ( int j = i + 1; j < a.length; j++ ) {
		if ( a[j] > max ) {
		    max = a[j];
		    maxLocation = j; 
		}
	    }
	    temp = a[i];
	    a[i] = max;
	    a[maxLocation] = temp;
	}

	for ( int i = 0; i < a.length; i++ ) {
	    if ( i != aLengthMinusOne ) {
		System.out.print( a[i] + ", " );
	    } else {
		System.out.print( a[i] );
	    }
	}
	System.out.println();
	
    }
}
