import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
	Scanner k = new Scanner(System.in);
	System.out.println("Please enter a number: " );
	int num = k.nextInt();
	int temp = num, count = 0, pro = 1, init = 0;
	while( temp > 0) {
	    temp /= 10;
	    ++count;
	}
	while ( init < count - 1 ) {
	    pro *= 10;
	    ++init;
	}
	while ( num > 0 ) {
	    System.out.print(num / pro + " ");
	    num %= pro;
	    pro /= 10;
	}
	
    }
}
