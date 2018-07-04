import java.util.*;

public class Task12 {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	System.out.println("Please enter the value of a: ");
	int a = scanner.nextInt();
	System.out.println("Please enter the value of b: ");
	int b = scanner.nextInt();
	System.out.println("Please enter the value of c: ");
	int c = scanner.nextInt();
	int temp;
	temp = a;
	a = c;
	c = b;
	b = temp;
	System.out.println("Now the value of a is: " + a );
	System.out.println("Now the value of b is: " + b);
	System.out.println("Now the value of c is: " + c);

    }
}
