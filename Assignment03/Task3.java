import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	System.out.println("Please enter the width of the ractangle");
	int width = scanner.nextInt();
	System.out.println("Please enter the height of the ractangle");
	int height = scanner.nextInt();
	int area = width * height;
	System.out.println("The area of the rectangle is " + area + " square unit(s)");
	
    }
}
