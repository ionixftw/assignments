import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
	Scanner k = new Scanner(System.in);
	System.out.println("Please enter the quantity of numbers: ");
	int quan = k.nextInt();
	int init = 0;
	int pro = 1;
	while( init < quan ) {
	    System.out.println("Please enter a number: ");
	    int num = k.nextInt();
	    pro *= num;
	    ++init;
	}
	System.out.println("The product of all the numbers is: " + pro);
    }
}
