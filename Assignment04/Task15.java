import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
	Scanner k = new Scanner(System.in);
	int init = 0;
	int terminal = 20;
	int sum = 0;
        int[] num = new int[terminal];
	while ( init < terminal ){
	    System.out.print("Please enter a number: " );
	    num[init] = k.nextInt();
	    if( init == terminal - 1 ) {
		init = 0;
		while (init < terminal) {
		    sum += num[init];
		    System.out.println(sum);
		    ++init;
		}
		init = terminal - 1;
	    }
	    ++init;
	}
    }
}
