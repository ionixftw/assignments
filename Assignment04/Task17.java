import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
	Scanner k = new Scanner(System.in);
	int fi = 0, fb = 1, fib = 0;
	System.out.print(fi+" ");
	System.out.print(fb+ " ");
	while( fi + fb < 1600 ) {
	    fib = fi + fb;
	    System.out.print(fib + " ");
	    fi = fb;
	    fb = fib;
	}
    }
}
