import java.util.*;

public class Task05 {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	System.out.println("Please enter total seconds: ");
	int totalSeconds = scanner.nextInt();

	String text = "";

	text = totalSeconds/3600 + " hour(s) " + totalSeconds % 3600 / 60 + " minute(s) " + totalSeconds % 3600 % 60 + " second(s).";
	System.out.println(text);
    }
}
