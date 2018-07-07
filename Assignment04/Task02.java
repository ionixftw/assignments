import java.util.Scanner;
public class Task02 {
    public static void main(String[] args) {
	Scanner k = new Scanner(System.in);
	int num = 10;
	while(num < 51) {
	    if(num % 2 == 1) System.out.println(num);
	    num++;
	}
    }
}
