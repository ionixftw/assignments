import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
	Scanner k = new Scanner(System.in);
	int count, min, sum, avgCount, totalCount;
	double avg;
	count = min = sum = avgCount = 0;
	totalCount = 20;
	while (count < totalCount) {
	    System.out.println("Please enter a number: " );
	    int num = k.nextInt();
	    if ( count == 0 ) min = num;
	    else if(num < min ) min = num;
	    if( num % 2 == 0) {
		avgCount++;
		sum += num;
	    }
	    count++;
	    
	}
	avg = sum / (double)avgCount;
	System.out.println("Min: " + min);
	System.out.println("Average: " + avg);
    }
}
