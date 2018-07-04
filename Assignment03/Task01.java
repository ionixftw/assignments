import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Please enter student's mark");
	int mark = scanner.nextInt();
	if(mark <= 50) {
	    System.out.println("You shall not pass");
	} else {
	    System.out.println("Pass");
	} 
	
    }
}
