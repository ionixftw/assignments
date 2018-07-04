import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
	Scanner k = new Scanner(System.in);
	System.out.println("Please enter a number");
	int num = k.nextInt();
	int count = 0;
	int i = 1;
	while (i <= num) {
	    if( num % i == 0) ++count;
	    ++i;
	}
	System.out.println("Divisor count: " + count);
       
    }
}
