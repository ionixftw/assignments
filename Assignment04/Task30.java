import java.util.Scanner;

public class Task30 {
    public static void main(String[] args) {
	Scanner k = new Scanner(System.in);
	int primeCount = 0, perfectCount = 0;
	System.out.println("Please enter the lower range: ");
	int low = k.nextInt();
	int lowCopy = low;
	System.out.println("Please enter the upper range: ");
	int high = k.nextInt();
	while ( low <= high ) {
	    int init = 1, count = 1, sum = 0;
	    while ( init < low ) {
		if ( low % init == 0 ){
		    ++count;
		    sum += init;
		}
		++init;
	    }
	    if ( count < 3 ) ++primeCount;
	    if ( sum == low ) ++perfectCount;
	    ++low;
	}
	System.out.println("Between " + lowCopy + " and " + high + ", Found " + perfectCount + " perfect number(s) and Found " + primeCount + " prime number(s)");
    }
}
