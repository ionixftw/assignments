import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
	Scanner k = new Scanner(System.in);
        System.out.println("Please enter a number: " );
	int num = k.nextInt();
	int temp = num, count = 0, init = 0, pro = 1, digit;
	while ( temp > 0) {
	    temp /= 10;
	    ++count;
	}
	while ( init < count - 1 ) {
	    pro *= 10;
	    ++init;
	}
	while ( num > 0 ) {
	    digit = num / pro;
	    if (digit == 0) System.out.println("zero ");
	    else if (digit == 1) System.out.print("one ");
	    else if (digit == 2) System.out.print("two ");
	    else if (digit == 3) System.out.print("three ");
	    else if (digit == 4) System.out.print("four ");
	    else if (digit == 5) System.out.print("five ");
	    else if (digit == 6) System.out.print("six ");
	    else if (digit == 7) System.out.print("seven ") ;
	    else if (digit == 8) System.out.print("eight ");
	    else if (digit == 9) System.out.print("nine ");
	    num %= pro;
	    pro /= 10;
	}
	    
    }
}
