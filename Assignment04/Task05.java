import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
	Scanner k = new Scanner(System.in);
	System.out.println("Please enter the value of n: " );
	int n = k.nextInt();
	int sum, count;
	sum = 0;
	count = 1;
	while ( count <= n ) {
	    sum += (count * count * count);
	    count++;
	}
	double y = Math.pow(sum, 1/ 3.0);
	System.out.println("The value of y is: " + y);
    }
}
