import java.util.*;

public class Task11 {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	System.out.println("Please enter the value of the first variable: ");
	int a = scanner.nextInt();

	System.out.println("Please enter the value of the second variable: ");
	int b = scanner.nextInt();

	int temp;

	temp = a;

	a = b;

	b = temp;

	System.out.println("Now the first variable is: " + a);
	System.out.println("Now the second variable is: " + b);
    }
}
