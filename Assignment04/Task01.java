import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
	Scanner k = new Scanner(System.in);
	System.out.println("Please enter the name of your favorite car: ");
	String car = k.nextLine();
	System.out.println("Please enter a number: ");
	int num = k.nextInt();
	int count = 0;
	while (count < num) {
	    System.out.println(car);
	    count++;
	}
    }
}
