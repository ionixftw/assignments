import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
	Scanner k = new Scanner(System.in);
	int total = 0, init = 0, terminal = 10, evenCount = 0;
	double avg;
	while ( init < terminal ) {
	    System.out.println("Please enter a number: " );
	    int num = k.nextInt();
	    if( num % 2 == 0 ) {
		total += num;
		++evenCount;
	    }
	    ++init;
	}
	avg = total / (double) evenCount;
	System.out.println("The total of the even numbers: " + total);
	System.out.println("The average of the even numbers: " + avg);
	
    }
}
