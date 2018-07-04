import java.util.*;

public class Task13 {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	System.out.println("Please enter the value of a: ");
	int a = scanner.nextInt();
	System.out.println("Please enter the value of b: ");
	int b = scanner.nextInt();
	System.out.println("Please enter the value of c: ");
	int c = scanner.nextInt();
	System.out.println("Please enter the value of d: ");
	int d = scanner.nextInt();

	int temp;
	temp = a;
	a = b;
	b = c;
	c = d;
	d = temp;
	System.out.println("Now the value of a is: " + a);
	System.out.println("Now the value of b is " + b);
	System.out.println("Now the value of c is " + c);
	System.out.println("Now the value of d is: " + d);
	
    }
}
