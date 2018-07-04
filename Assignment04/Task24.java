import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
	Scanner k = new Scanner(System.in);
	System.out.println("Please enter a number: ");
	int num = k.nextInt();
	int init = 1;
	while ( init < num + 1 ) {
	    System.out.println(init);
	    ++init;
	}
    }
}
