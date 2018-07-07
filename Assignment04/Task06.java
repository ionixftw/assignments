import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
	Scanner k = new Scanner(System.in);
	System.out.println("Please enter the value of n: ");
	int n = k.nextInt();
	int y = 0, init = 1;
	while ( init <= n ) {
	    if( init % 2 == 0 ) y -= (init *init);
	    else y += (init * init);
	    init++;
	}

	System.out.println("The value of y is: " + y);
	
    }
}
