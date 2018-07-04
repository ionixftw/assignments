import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
	Scanner k = new Scanner(System.in);
	int sum = 0;
	int max = 0;
	int count = 0;
	while(count < 20) {
	    System.out.println("Please enter a number: ");
	    int num = k.nextInt();
	    if(count == 0) {
		max = num;
	    } else {
		if (num > max) max = num;
	    }
	    sum += num;
	    count++;
	}
	double avg =  sum / 20.0;
	System.out.println("Max Number: " + max);
	System.out.println("Average : " + avg);
    }
}
