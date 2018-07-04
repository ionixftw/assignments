import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
	Scanner k = new Scanner(System.in);
	int init = 1;
	int terminal = 601;
	int sum = 0;
	while( init < terminal ){
	    if( init % 7 == 0 && init % 9 == 0 )
		sum += init;
	    init++;
	}
	System.out.println("The sum is: " + sum);
    }
}
