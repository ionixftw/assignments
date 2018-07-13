import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
	Scanner scanner = new Scanner ( System.in );
	int[] a = new int[] { 50, 30, 20, 10, 40 };
	int max = a[0], maxLocation = 0, temp;
	System.out.println("Please enter the value of n: ");
	int n = scanner.nextInt();

	for ( int i = 0;i < n; i++ ) {
	    for ( int j = i; j < a.length; j++ ) {
		if ( a[j] > max ) {
		    max = a[j];
		    maxLocation = j;
		}
	    }
	    temp = a[i];
	    a[i] = max;
	    a[maxLocation] = temp;
	    max = a[i + 1];
	    maxLocation = i + 1;
	}

	for ( int i = 0; i < a.length; i++ ) {
	    if ( i != a.length - 1 ) {
		System.out.print( a[i] + ", " );
	    }else {
		System.out.print( a[i] );
	    }
	     
	}
	System.out.println();
    }
}
