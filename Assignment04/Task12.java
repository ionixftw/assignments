import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
	Scanner k = new Scanner(System.in);
	int total = 0, init = 0, terminal = 10, multipleCount = 0;
	double avg;
	while ( init < terminal ) {
	    System.out.println("Please enter a number: " );
	    int num = k.nextInt();
	    if( num % 4 == 0 ) {
		total += num;
		++multipleCount;
	    }
	    ++init;
	}
	avg = total / (double) multipleCount;
	System.out.println("The total of the multiples: " + total);
	System.out.println("The average of the multiples: " + avg);
	
    }
}
