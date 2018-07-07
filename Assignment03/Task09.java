import java.util.*;

public class Task09 {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	System.out.println("Please enter the first number: ");
	int a = scanner.nextInt();

	System.out.println("Please enter the second number: ");
	int b = scanner.nextInt();

	System.out.println("Please enter the third number: ");
	int c = scanner.nextInt();

	int largest;
	
	if ( a > b ) {
	    if ( a > c) 
		largest = a;
	    else 
		largest = c;
	} else {
	    if (b > c)
		largest = b;
	    else
		largest = c;
	}

	System.out.println("The largest number is: " + largest);
    }
}
