import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
	Scanner k = new Scanner(System.in);
	int init = 1;
	int terminal = 20;
	int sum = 0;
	while  ( init <= terminal ){
	    System.out.println("Please enter a number: " );
	    int num = k.nextInt();
	    sum += num;
	    System.out.println("Sum: " + sum);
	    ++init;
	}
    }
}
