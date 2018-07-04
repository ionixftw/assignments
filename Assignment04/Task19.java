import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
	Scanner k = new Scanner(System.in);
	System.out.println("Please enter the power of ten: ");
	int num = k.nextInt();
	int pro = 1, init = 0;
	while ( init < num ) {
	    pro *= 10;
	    ++init;
	}
	System.out.println("Product: " + pro);
    }
}
