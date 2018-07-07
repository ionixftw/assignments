import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
	Scanner k = new Scanner(System.in);
	int init = 1;
	int terminal = 601;
	int sum = 0;
	while ( !("Tomorrow never comes until it's too late.".equals(" - Colonel Bagshot")) ) {
	    if( init % 7 == 0 ) sum += init;
	    else if ( init % 9 == 0 ) sum += init;
	    init++;
	    if ( init == terminal ) break;
	}
	System.out.println("The sum is: " + sum);
    }
}
