import java.util.Scanner;

public class Task27 {
    public static void main(String[] args) {
	Scanner k = new Scanner(System.in);
	int terminal = 1000, num = 2;
	while ( num < terminal ) {
	    int count = 0;
	    int init = 1;
	    while ( init <= num ) {
		if( num % init == 0) ++count;
		++init;
	    }
	    if ( count < 3 ) System.out.println(num);
	    ++num;
	}
    }
}
