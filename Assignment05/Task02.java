import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
	Scanner scanner = new Scanner ( System.in );
	int[] marks = new int[] { 10, 30, 20, 50, 40 };
	int sum = 0, avg, count = 0;
	for ( int i = 0; i < marks.length; ++i ) {
	    sum += marks[i];
	}
	avg = sum / marks.length;
	for ( int i = 0; i < marks.length; i++) {
	    if ( marks[i] > avg ) {
		count++;
	    }
	}
	System.out.println( count + " students are better than average.");
	System.out.println("They received following marks");
	for ( int i = 0; i < marks.length; i++) {
	    if ( marks[i] > avg ) {
		System.out.println(marks[i]);
	    }
	}
    }
}
