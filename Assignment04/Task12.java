import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
	Scanner k = new Scanner(System.in);
	int total = 0, init = 0, terminal = 10, divCount = 0;
	double avg;
	while ( init < terminal ) {
	    System.out.println("Please enter a number: " );
	    int num = k.nextInt();
	    if( num % 4 == 0 ) {
		total += num;
		++divCount;
	    }
	    ++init;
	}
	avg = total / (double) divCount;
	System.out.println("The total of the divisors: " + total);
	System.out.println("The average of the divisors: " + avg);
	
    }
}
