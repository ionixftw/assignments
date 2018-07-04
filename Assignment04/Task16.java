import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
	Scanner k = new Scanner(System.in);
        int init = 0;
	int terminal = 10;
	int max = 0 , min = 0 , sum = 0;
	double avg;
	
	while ( init < terminal ) {
	    System.out.println("Please enter the mark: " );
	    int mark = k.nextInt();
	    if( init == 0 ) {
		max = mark;
		min = mark;
	    } else {
		if( mark > max ) max = mark;
		else if( mark < min ) min = mark;
	    }
	    sum += mark;
	    ++init;
	}
	avg = sum / 10.0;
	System.out.println("Max : " + max);
	System.out.println("Min : " + min);
	System.out.println("Average : " + avg);
	
    }
}
