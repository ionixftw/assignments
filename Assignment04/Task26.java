import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
	Scanner k = new Scanner(System.in);
	System.out.println("Please enter a number: ");
	int num = k.nextInt();
	int init = 1, count = 0;
	while (init < num + 1) {
	    if( num % init == 0 ) ++count;
	    ++init;
	}
	if ( count < 3 ) System.out.println("Prime Number.");
	else System.out.println("Not a prime number.");
    }
}
