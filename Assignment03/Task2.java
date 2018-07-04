import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Please enter student's mark");
	int mark = scanner.nextInt();

	if(mark < 0) System.out.println("Wrong Input");
	else if(mark < 50) System.out.println("F");
	else if(mark < 60) System.out.println("E");
	else if(mark < 70) System.out.println("D");
	else if(mark < 80) System.out.println("C");
	else if(mark < 90) System.out.println("B");
	else if(mark < 101) System.out.println("A");
	else System.out.println("Wrong Input");
	
    }
}
