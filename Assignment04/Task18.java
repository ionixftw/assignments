import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
	Scanner k = new Scanner(System.in);
	System.out.println("Please enter a number : ");
	int num = k.nextInt();
	int count = 0;
	do {
	    num /= 10;
	    ++count;
	} while ( num > 0 );
	System.out.println("Total : " + count + " digit(s)"); 
    }
    
}
