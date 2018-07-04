import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
	Scanner k = new Scanner(System.in);
	int total = 0, init = 0, terminal = 10, oddCount = 0;
	double avg;
	while ( init < terminal ) {
	    System.out.println("Please enter a number: " );
	    int num = k.nextInt();
	    if( num % 2 == 1 ) {
		total += num;
		++oddCount;
	    }
	    ++init;
	}
	avg = total / (double) oddCount;
	System.out.println("The total of the odd numbers: " + total);
	System.out.println("The average of the odd numbers: " + avg);
	
    }
}
