import java.util.*;

public class Task14 {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	System.out.println("Please enter a number: ");
	int num = scanner.nextInt();

	if (num < 0) num *= -1;

	System.out.println("The absolute value is: " + num);
    }
}
