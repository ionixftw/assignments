import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
	Scanner scanner  = new Scanner(System.in);
	System.out.println("Please enter a number: ");
	int num = scanner.nextInt();

	if( num % 2 == 0) {
	    if (!(num % 5 == 0))
		System.out.println(num);
	}
	else if(num % 5 == 0) {
	    if(!(num % 2 == 0))
		System.out.println(num);
	}
    }

}
