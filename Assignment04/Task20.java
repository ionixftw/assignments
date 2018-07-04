import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
	Scanner k = new Scanner(System.in);
	System.out.println("Please enter a number: ");
	int num = k.nextInt();
	while ( num > 0 ) {
	    System.out.print(num % 10 + " ");
	    num /= 10;
	}
    }
}
