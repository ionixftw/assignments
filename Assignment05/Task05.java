import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
	Scanner scanner = new Scanner ( System.in );
	int[] a = new int[] { 50, 30, 20, 10, 40 };
	int max = a[1], maxLocation = 1, temp;
	for ( int i = 1 ; i < a.length; i++ ) {
	    if ( a[i] > max ) {
		
		max = a[i];
		maxLocation = i;
	    }
	}
	temp = a[1];
	a[1] = max;
	a[maxLocation] = temp;

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
