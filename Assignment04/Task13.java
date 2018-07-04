import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
	Scanner k = new Scanner(System.in);
	System.out.println("Please enter the value of N: ");
	int n = k.nextInt();
	int init = 1, sum = 0;
	while ( init <= n ) {
	    if ( init % 2 == 1 ) sum += init;
	    ++init;
	}
	System.out.println("The sum of the odd numbers: " + sum);
    }
}
