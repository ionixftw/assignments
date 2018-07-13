import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
	Scanner scanner = new Scanner ( System.in );
	int[] a = new int[] { 10, 30, 20, 50, 40 };
	int max = a[0], location = 0;

	for ( int i = 0; i < a.length; i++ ) {
	    if ( a[i] > max ) {
		max = a[i];
		location = i;
	    }
	}

	System.out.println("Largest number is " + max);
	System.out.println("Largest number was found at location " + location);
	
    }
}
