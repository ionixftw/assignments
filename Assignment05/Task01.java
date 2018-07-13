import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
	Scanner scanner = new Scanner ( System.in );
	int[] marks = new int[] { 10, 30, 20, 50, 40 };
	int max = marks[0], min = marks[0], sum = 0;
	double avg;
	for ( int index = 0; index < marks.length; index++ ) {
	    if ( marks[index] > max ) {
		max = marks[index];
	    }

	    if ( marks[index] < min ) {
		min = marks[index];
	    }

	    sum += marks[index];
	}

	avg = (double) sum / marks.length;

	System.out.println("Highest mark is " + max);
	System.out.println("Lowest mark is " + min);
	System.out.println("Average mark is " + avg);
    }
}
