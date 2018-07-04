import java.util.*;

public class Task15 {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	System.out.println("Please enter your desired hour: ");
	int hour = scanner.nextInt();

	if(hour < 0) System.out.println("Wrong time");
	else if (hour < 4) System.out.println("Patience is a virtue");
	else if (hour < 7) System.out.println("Breakfast");
	else if (hour < 12) System.out.println("Patience is a virtue");
	else if (hour < 14) System.out.println("Lunch");
	else if (hour < 16) System.out.println("Patience is a virtue");
	else if (hour < 18) System.out.println("Snacks");
	else if (hour < 19) System.out.println("Patience is a virtue");
	else if (hour < 21) System.out.println("Dinner");
	else if (hour < 24) System.out.println("Patience is a virtue");
	else System.out.println("Wront time");
    }
}
