import java.util.*;

public class Task7 {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	System.out.println("Please enter the value of the first side: ");
	double x = scanner.nextDouble();
	System.out.println("Please enter the value of the second side: ");
	double y = scanner.nextDouble();
	System.out.println("Please enter the value of the third side: ");
	double z = scanner.nextDouble();

	double s, area;

	s = (x + y + z) / 2;
	area = Math.sqrt(s * (s -x) * (s-y) * (s-z));

	System.out.println("The area of the triangle is: " + area);
    }
}
