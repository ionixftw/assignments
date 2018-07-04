import java.util.*;

public class Task8 {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	System.out.println("Please enter the number of published articles: ");
	int articles = scanner.nextInt();

	int totalFees;

	totalFees = articles * 500;

	System.out.println("Total fees for the writer: " + totalFees);
    }
}
